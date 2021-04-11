package com.haiyu.manager.controller.system;

import com.haiyu.manager.pojo.BaseOrder;
import com.haiyu.manager.service.impl.OrderServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    OrderServiceImp orderServiceImp;

    @RequestMapping("/buyerManage")
    public String toPage() {
        logger.info("进入订单管理");
        return "order/orderManage";
    }

    @GetMapping("getOrderList")
    @ResponseBody
    public List<BaseOrder> getOrderList(){
        logger.info("获取订单信息");
        return orderServiceImp.getOrderList();
    }

    @GetMapping("sumOrder")
    @ResponseBody
    public int sumOrder(BaseOrder baseOrder){
        logger.info("订单总数");
        return orderServiceImp.sumOrder(baseOrder);
    }

    @GetMapping("sumMoney")
    @ResponseBody
    public BigDecimal sumMoney(BaseOrder baseOrder){
        logger.info("订单金额总数");
        return orderServiceImp.sumMoney(baseOrder);
    }

    @GetMapping("getOrderById/{id}")
    @ResponseBody
    public BaseOrder getBuyerById(@PathVariable("id") Integer orderId){
        logger.info("通过ID获取该订单信息");
        return orderServiceImp.getOrderById(orderId);
    }

    @GetMapping("deleteOrder/{id}")
    @ResponseBody
    public void deleteOrder(@PathVariable("id") Integer orderId){
        logger.info("通过订单id删除订单");
        orderServiceImp.deleteOrder(orderId);
    }
}
