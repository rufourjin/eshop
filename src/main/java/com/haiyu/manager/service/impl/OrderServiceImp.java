package com.haiyu.manager.service.impl;

import com.haiyu.manager.dao.BaseOrderMapper;
import com.haiyu.manager.pojo.BaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderServiceImp {
    @Autowired
    BaseOrderMapper baseOrderMapper;
    public List<BaseOrder> getOrderList(){
        return baseOrderMapper.getOrderList();
    }
    public int sumOrder(BaseOrder baseOrder){
        return baseOrderMapper.sumOrder(baseOrder);
    }
    public BigDecimal sumMoney(BaseOrder baseOrder){
        return baseOrderMapper.sumMoney(baseOrder);
    }
    public void deleteOrder(Integer orderId){
        baseOrderMapper.deleteOrder(orderId);
    }
    public BaseOrder getOrderById(Integer buyerId){
        return baseOrderMapper.getOrderById(buyerId);
    }
}
