package com.dragon.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dragon.entity.PaymentInfo;
import com.dragon.handler.ResultInfo;
import com.dragon.service.PaymentInfoService;
import com.dragon.util.ResultUtil;
import com.dragon.util.UUIDUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author RuntimeExcet0in
 * @since 2019-11-25
 */
@RestController
@RequestMapping("/payment")
public class PaymentInfoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PaymentInfoService paymentInfoService;

    @PostMapping("/save")
    public ResultInfo savePayment(@RequestBody PaymentInfo paymentInfo){
        logger.info("保存收款人信息{}", JSON.toJSONString(paymentInfo));
        paymentInfo.setId(UUIDUtil.getUUIDWithoutDash());
        paymentInfo.setUpdatedDate(new Date());
        paymentInfo.setCreatedDate(new Date());
        paymentInfoService.save(paymentInfo);
        return ResultUtil.getSuccessResult("");
    }

    @PostMapping("/select")
    public ResultInfo selectPayment(@RequestBody PaymentInfo paymentInfo){
        logger.info("查询收款人信息{}", JSON.toJSONString(paymentInfo));
        Page page = new Page(1,2);
//        QueryWrapper queryWrapper = new QueryWrapper<PaymentInfo>();
//         queryWrapper.eq("bill_no", paymentInfo.getBillNo());
//        paymentInfoService.page(page,queryWrapper);
        IPage iPage = paymentInfoService.selectByPage(page, paymentInfo);
        return ResultUtil.getSuccessResult(iPage.getRecords());
    }
}
