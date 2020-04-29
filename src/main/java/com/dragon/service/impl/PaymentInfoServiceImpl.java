package com.dragon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dragon.entity.PaymentInfo;
import com.dragon.mapper.PaymentInfoMapper;
import com.dragon.service.PaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author RuntimeExcet0in
 * @since 2019-11-25
 */
@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

    @Autowired
    PaymentInfoMapper paymentInfoMapper;

    @Override
    public IPage selectByPage(Page page,PaymentInfo paymentInfo) {
        IPage result = paymentInfoMapper.selectPage(page, new QueryWrapper<PaymentInfo>().eq("bill_no", paymentInfo.getBillNo()));
        return result;
    }

    @Override
    public List<PaymentInfo> getList() {

        return paymentInfoMapper.getList();
    }

}
