package com.dragon.controller;

import com.alibaba.fastjson.JSON;
import com.dragon.entity.TripBase;
import com.dragon.service.TripRefundService;
import com.dragon.handler.ResultInfo;
import com.dragon.util.ResultUtil;
import com.dragon.util.UUIDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripRefundController {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    private TripRefundService refundService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("getHello")
    public String getHello(){
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        String[] beanNamesForType = applicationContext.getBeanNamesForType(TripBase.class);

        Environment environment = applicationContext.getEnvironment();
        environment.getProperty("os.name");

        for (String name :beanNamesForType) {
            System.out.println(name);
        }
        return "AAA";
    }

    @PostMapping("/save")
    public ResultInfo saveTripBase(@RequestBody TripBase tripBase){
        logger.info("保存差旅报销单报文{}", JSON.toJSONString(tripBase));
        tripBase.setId(UUIDUtil.getUUIDWithoutDash());
        refundService.saveTripBase(tripBase);
        return ResultUtil.getSuccessResult("");
    }

    @PostMapping("/select")
    public ResultInfo selectTripBase(@RequestBody TripBase tripBase){
        List<TripBase> tripBases = refundService.selectTripBase(tripBase);
        return  ResultUtil.getSuccessResult(tripBases);
    }

    @PostMapping("/getById")
    public ResultInfo getById(@RequestBody TripBase tripBase){
        String id = tripBase.getId();
        Object byId = refundService.getById(id);
        return  ResultUtil.getSuccessResult(byId);
    }
}
