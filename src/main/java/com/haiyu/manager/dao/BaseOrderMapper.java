package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.BaseOrder;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BaseOrderMapper {
    List<BaseOrder> getOrderList();
    int sumOrder(BaseOrder baseOrder);
    BigDecimal sumMoney(BaseOrder baseOrder);
    void deleteOrder(Integer orderId);
    BaseOrder getOrderById(Integer buyerId);
}
