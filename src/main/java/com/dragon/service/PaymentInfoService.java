package com.dragon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dragon.entity.PaymentInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author RuntimeExcet0in
 * @since 2019-11-25
 */
public interface PaymentInfoService extends IService<PaymentInfo> {

    IPage selectByPage(Page page, PaymentInfo paymentInfo);

    List<PaymentInfo> getList();
}
