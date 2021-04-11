package com.haiyu.manager.controller.system;

import com.haiyu.manager.pojo.BaseProduct;
import com.haiyu.manager.service.impl.ProductServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("product")
public class ProductController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ProductServiceImp productServiceImp;

    @RequestMapping("productManage")
    public String toPage() {
        logger.info("进入商家后台商品管理");
        return "/product/productManage";
    }

    @GetMapping("getProductList")
    @ResponseBody
    public List<BaseProduct> getProductList(){
        logger.info("获取商品列表");
        return productServiceImp.getProductList();
    }

    @GetMapping("getProductById/{id}")
    @ResponseBody
    public BaseProduct getProductById(@PathVariable("id") Integer productId){
        logger.info("通过id查找商品");
        return productServiceImp.getProductById(productId);
    }

    /*@GetMapping("addProduct")
    @ResponseBody
    public void addProduct(BaseProduct baseProduct){
        logger.info("上架商品");
        productServiceImp.addProduct(baseProduct);
    }

    @PostMapping("updateProduct")
    @ResponseBody
    public void updateProduct(BaseProduct baseProduct){
        logger.info("修改商品信息");
        productServiceImp.updateProduct(baseProduct);
    }*/

    @GetMapping("deleteProduct/{id}")
    @ResponseBody
    public void deleteProduct(@PathVariable("id") Integer productId){
        logger.info("下架商品");
        productServiceImp.deleteProduct(productId);
    }
}
