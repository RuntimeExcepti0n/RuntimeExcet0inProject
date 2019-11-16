package com.dragon.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
}
