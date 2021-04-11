package com.haiyu.manager.service.impl;


import com.haiyu.manager.dao.BaseBuyerMapper;
import com.haiyu.manager.pojo.BaseBuyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BuyerServiceImp  {
    @Autowired
    BaseBuyerMapper baseBuyerMapper;

    public List<BaseBuyer> getBuyerList(){
        return baseBuyerMapper.getBuyerList();
    }
    public BaseBuyer getBuyerById(Integer buyerId){
        return baseBuyerMapper.getBuyerById(buyerId);
    }
    public int addBuyer(BaseBuyer baseBuyer){
       return baseBuyerMapper.addBuyer(baseBuyer);
    }
    public void updateBuyer(BaseBuyer baseBuyer){
        baseBuyerMapper.updateBuyer(baseBuyer);
    }
    public void deleteBuyer(Integer buyerId){
        baseBuyerMapper.deleteBuyer(buyerId);
    }
}
