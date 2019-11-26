package com.dragon.handler;

import com.dragon.util.ResultUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ResultInfo handleException(Exception e){
        if(e instanceof MethodArgumentNotValidException){
            return handleMethodArgumentNotValidException((MethodArgumentNotValidException) e);
        }else if(e instanceof ConstraintViolationException){
            return handleConstraintViolationException((ConstraintViolationException) e);
        }else if(e instanceof BusinessServiceException){
            String resultCode = ((BusinessServiceException) e).getResultCode();
            if(StringUtils.isBlank(resultCode)){
                resultCode = ResultCode.INTERNAL_SERVER_ERROR.getCode();
            }
            return ResultUtil.getFailResult(resultCode,e.getMessage(),"");
        }else{
            logger.info("操作错误");
            return ResultUtil.getFailResult(ResultCode.INTERNAL_SERVER_ERROR.getCode(),e.getMessage(),"");
        }
    }

    private ResultInfo handleConstraintViolationException(ConstraintViolationException e) {
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        String failMessage = constraintViolations.stream().map(ConstraintViolation:: getMessage)
                .collect(Collectors.joining(","));
        return ResultUtil.getFailResult(ResultCode.PARAMER_ERROR.getCode(),failMessage,"");
    }

    private ResultInfo handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        String failMessage = bindingResult.getFieldErrors().stream().map(FieldError::getDefaultMessage)
                .collect(Collectors.joining(","));
        return ResultUtil.getFailResult(ResultCode.PARAMER_ERROR.getCode(),failMessage,"");
    }
}
