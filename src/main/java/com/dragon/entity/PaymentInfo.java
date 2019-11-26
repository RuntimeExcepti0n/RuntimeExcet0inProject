package com.dragon.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dragon.entity.BaseEntity;
import java.util.Date;
/**
 * <p>
 * 
 * </p>
 *
 * @author RuntimeExcet0in
 * @since 2019-11-25
 */
@TableName("t_payment_info")
public class PaymentInfo extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID22
     */
    private String id;

    /**
     * 单据编号
     */
    private String billNo;

    private String payeeName;

    private String payeeNum;

    private String accountName;

    private String accountNum;

    private String payWay;

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

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeeNum() {
        return payeeNum;
    }

    public void setPayeeNum(String payeeNum) {
        this.payeeNum = payeeNum;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    @Override
    public String toString() {
        return "PaymentInfo{" +
        ", id=" + id +
        ", billNo=" + billNo +
        ", payeeName=" + payeeName +
        ", payeeNum=" + payeeNum +
        ", accountName=" + accountName +
        ", accountNum=" + accountNum +
        ", payWay=" + payWay +
        "}";
    }
}
