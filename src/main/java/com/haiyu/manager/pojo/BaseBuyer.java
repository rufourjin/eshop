package com.haiyu.manager.pojo;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Table(name="base_buyer")
public class BaseBuyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buyerId;
    @Column(name = "buyer_name")
    private String buyerName;
    @Column(name = "buyer_pwd")
    private String buyerPwd;
    @Column(name = "buyer_gender")
    private String buyerGender; //0：女  1：男
    @Column(name = "buyer_address")
    private String buyerAddress;
    @Column(name = "buyer_phone")
    private String buyerPhone;
    @Column(name = "buyer_birth")
    private String  buyerBirth;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;


    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerPwd() {
        return buyerPwd;
    }

    public void setBuyerPwd(String buyerPwd) {
        this.buyerPwd = buyerPwd;
    }

    public String getBuyerGender() {
        return buyerGender;
    }

    public void setBuyerGender(String buyerGender) {
        this.buyerGender = buyerGender;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerPhone() {
        return buyerPhone;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerBirth() {
        return  buyerBirth;
    }

    public void setBuyerBirth(String buyerBirth) {
        this.buyerBirth =  buyerBirth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "BaseBuyer{" +
                "buyerId=" + buyerId +
                ", buyerName='" + buyerName + '\'' +
                ", buyerPwd='" + buyerPwd + '\'' +
                ", buyerGender='" + buyerGender + '\'' +
                ", buyerAddress='" + buyerAddress + '\'' +
                ", buyerPhone='" + buyerPhone + '\'' +
                ", buyerBirth='" + buyerBirth + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
