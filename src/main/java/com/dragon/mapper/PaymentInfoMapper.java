package com.dragon.mapper;

import com.dragon.entity.PaymentInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author RuntimeExcet0in
 * @since 2019-11-25
 */
@Mapper
public interface PaymentInfoMapper extends BaseMapper<PaymentInfo> {

    List<PaymentInfo> getList();

}
