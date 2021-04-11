package com.haiyu.manager.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "base_order")
public class BaseOrder {
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "o_buyer_id")
    private Integer ordBuyerId;
    @Column(name = "o_product_id")
    private Integer ordProductId;
    @Column(name = "order_time")
    private Date orderTime;


    private BaseBuyer baseBuyer;
    private BaseProduct baseProduct;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrdBuyerId() {
        return ordBuyerId;
    }

    public void setOrdBuyerId(Integer ordBuyerId) {
        this.ordBuyerId = ordBuyerId;
    }

    public Integer getOrdProductId() {
        return ordProductId;
    }

    public void setOrdProductId(Integer ordProductId) {
        this.ordProductId = ordProductId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public BaseBuyer getBaseBuyer() {
        return baseBuyer;
    }

    public void setBaseBuyer(BaseBuyer baseBuyer) {
        this.baseBuyer = baseBuyer;
    }

    public BaseProduct getBaseProduct() {
        return baseProduct;
    }

    public void setBaseProduct(BaseProduct baseProduct) {
        this.baseProduct = baseProduct;
    }

    @Override
    public String toString() {
        return "BaseOrder{" +
                "orderId=" + orderId +
                ", ordBuyerId=" + ordBuyerId +
                ", ordProductId=" + ordProductId +
                ", orderTime=" + orderTime +
                ", baseBuyer=" + baseBuyer +
                ", baseProduct=" + baseProduct +
                '}';
    }
}
