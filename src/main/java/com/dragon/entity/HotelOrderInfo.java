package com.dragon.entity;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

//@TableName("t_hotel_order_info")
public class HotelOrderInfo implements Serializable {

    private String id;

    private String billNo;

    private String personName;

    private String personNum;

    private String hotelCity;

    private String hotelName;

    private String hotelAddress;

    private Date checkInDate;

    private Date checkOutDate;

    private BigDecimal refundAmount;

    /**
     * 是否可以编辑，该注解表名在数据库表是否存在，默认false
     */
    @TableField(exist = false)
    private String editFlag;
}
