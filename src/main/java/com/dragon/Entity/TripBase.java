package com.dragon.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class TripBase extends BaseEntity implements Serializable {

    private String id;

    private String billNo;

    private String scanNumber;

    private String deptId;

    private String deptName;

    private BigDecimal refundTotalAmount;

    private String  actionFlag;

    private String isQuickPay;

    private String isQuGuiMian;

    private String isVip;

    private String status;

    private List<TranPortationOrderInfo> tranPortationOrderInfoList;

    private List<HotelOrderInfo> hotelOrderInfoList;

    private List<OtherCostOrderInfo> otherCostOrderInfoList;

    private List<TripPerson>  tripPersonList;




}
