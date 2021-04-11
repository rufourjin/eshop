package com.haiyu.manager.controller.system;

import com.haiyu.manager.dao.BaseBuyerMapper;
import com.haiyu.manager.pojo.BaseBuyer;
import com.haiyu.manager.service.impl.BuyerServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("buyer")
public class BuyerController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BuyerServiceImp buyerServiceImp;

    @RequestMapping("/buyerManage")
    public String toPage() {
        logger.info("进入用户管理");
        return "/buyer/buyerManage";
    }

    @GetMapping("getBuyerList")
    @ResponseBody
    public List<BaseBuyer> getBuyerList(){
        logger.info("获取用户列表");
        return buyerServiceImp.getBuyerList();
    }

    @GetMapping("addBuyer")
    @ResponseBody
    public int addBuyer(BaseBuyer baseBuyer){
        logger.info("添加一名用户");
        baseBuyer.setBuyerId(6);
        baseBuyer.setBuyerName("abc");
        baseBuyer.setBuyerPwd("6513580");
        baseBuyer.setBuyerGender("男");
        baseBuyer.setBuyerAddress("广西");
        baseBuyer.setBuyerPhone("15933647845");
        baseBuyer.setBuyerBirth("1999-7-8");
        baseBuyer.setUpdateTime(new Date());
        return buyerServiceImp.addBuyer(baseBuyer);
    }

    @GetMapping("getBuyerById/{id}")
    @ResponseBody
    public BaseBuyer getBuyerById(@PathVariable("id") Integer buyerId){
        logger.info("通过ID获取一名用户");
        return buyerServiceImp.getBuyerById(buyerId);
    }

    @GetMapping("deleteBuyer/{id}")
    @ResponseBody
    public void deleteBuyer(@PathVariable("id") Integer buyerId){
        logger.info("删除用户");
        buyerServiceImp.deleteBuyer(buyerId);
    }
}
