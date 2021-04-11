package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.BaseBuyer;
import org.springframework.stereotype.Repository;
import tk.mapper.MyMapper;

import java.util.List;
@Repository
public interface BaseBuyerMapper extends MyMapper<BaseBuyer> {
    List<BaseBuyer> getBuyerList();
    BaseBuyer getBuyerById(Integer buyerId);
    int addBuyer(BaseBuyer baseBuyer);
    void updateBuyer(BaseBuyer baseBuyer);
    void deleteBuyer(Integer buyerId);
}
