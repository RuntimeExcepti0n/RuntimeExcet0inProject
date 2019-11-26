package com.dragon.entity;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getScanNumber() {
        return scanNumber;
    }

    public void setScanNumber(String scanNumber) {
        this.scanNumber = scanNumber;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public BigDecimal getRefundTotalAmount() {
        return refundTotalAmount;
    }

    public void setRefundTotalAmount(BigDecimal refundTotalAmount) {
        this.refundTotalAmount = refundTotalAmount;
    }

    public String getActionFlag() {
        return actionFlag;
    }

    public void setActionFlag(String actionFlag) {
        this.actionFlag = actionFlag;
    }

    public String getIsQuickPay() {
        return isQuickPay;
    }

    public void setIsQuickPay(String isQuickPay) {
        this.isQuickPay = isQuickPay;
    }

    public String getIsQuGuiMian() {
        return isQuGuiMian;
    }

    public void setIsQuGuiMian(String isQuGuiMian) {
        this.isQuGuiMian = isQuGuiMian;
    }

    public String getIsVip() {
        return isVip;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<TranPortationOrderInfo> getTranPortationOrderInfoList() {
        return tranPortationOrderInfoList;
    }

    public void setTranPortationOrderInfoList(List<TranPortationOrderInfo> tranPortationOrderInfoList) {
        this.tranPortationOrderInfoList = tranPortationOrderInfoList;
    }

    public List<HotelOrderInfo> getHotelOrderInfoList() {
        return hotelOrderInfoList;
    }

    public void setHotelOrderInfoList(List<HotelOrderInfo> hotelOrderInfoList) {
        this.hotelOrderInfoList = hotelOrderInfoList;
    }

    public List<OtherCostOrderInfo> getOtherCostOrderInfoList() {
        return otherCostOrderInfoList;
    }

    public void setOtherCostOrderInfoList(List<OtherCostOrderInfo> otherCostOrderInfoList) {
        this.otherCostOrderInfoList = otherCostOrderInfoList;
    }

    public List<TripPerson> getTripPersonList() {
        return tripPersonList;
    }

    public void setTripPersonList(List<TripPerson> tripPersonList) {
        this.tripPersonList = tripPersonList;
    }

    @Override
    public String toString() {
        return "TripBase{" +
                "id='" + id + '\'' +
                ", billNo='" + billNo + '\'' +
                ", scanNumber='" + scanNumber + '\'' +
                ", deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", refundTotalAmount=" + refundTotalAmount +
                ", actionFlag='" + actionFlag + '\'' +
                ", isQuickPay='" + isQuickPay + '\'' +
                ", isQuGuiMian='" + isQuGuiMian + '\'' +
                ", isVip='" + isVip + '\'' +
                ", status='" + status + '\'' +
                ", tranPortationOrderInfoList=" + tranPortationOrderInfoList +
                ", hotelOrderInfoList=" + hotelOrderInfoList +
                ", otherCostOrderInfoList=" + otherCostOrderInfoList +
                ", tripPersonList=" + tripPersonList +
                '}';
    }
}
