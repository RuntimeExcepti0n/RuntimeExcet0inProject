package com.dragon.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

@TableName("t_trip_person")
public class TripPerson extends Model<TripPerson> {

    private String id;

    private String billNo;

    private String personName;

    private String personNum;

    private String finacialClassName;

    private String finacialClassCode;

    private String isExcutive;

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

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonNum() {
        return personNum;
    }

    public void setPersonNum(String personNum) {
        this.personNum = personNum;
    }

    public String getFinacialClassName() {
        return finacialClassName;
    }

    public void setFinacialClassName(String finacialClassName) {
        this.finacialClassName = finacialClassName;
    }

    public String getFinacialClassCode() {
        return finacialClassCode;
    }

    public void setFinacialClassCode(String finacialClassCode) {
        this.finacialClassCode = finacialClassCode;
    }

    public String getIsExcutive() {
        return isExcutive;
    }

    public void setIsExcutive(String isExcutive) {
        this.isExcutive = isExcutive;
    }
}
