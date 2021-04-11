package com.haiyu.manager.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "base_product")
public class BaseProduct {
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private BigDecimal productPrice;
    @Column(name = "product_intro")
    private String productIntro;
    @Column(name = "p_create_time")
    private Date proCreateTime;
    @Column(name = "p_update_time")
    private Date proUpdateTime;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductIntro() {
        return productIntro;
    }

    public void setProductIntro(String productIntro) {
        this.productIntro = productIntro;
    }

    public Date getProCreateTime() {
        return proCreateTime;
    }

    public void setProCreateTime(Date proCreateTime) {
        this.proCreateTime = proCreateTime;
    }

    public Date getProUpdateTime() {
        return proUpdateTime;
    }

    public void setProUpdateTime(Date proUpdateTime) {
        this.proUpdateTime = proUpdateTime;
    }

    @Override
    public String toString() {
        return "BaseProduct{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productIntro='" + productIntro + '\'' +
                ", proCreateTime=" + proCreateTime +
                ", proUpdateTime=" + proUpdateTime +
                '}';
    }
}
