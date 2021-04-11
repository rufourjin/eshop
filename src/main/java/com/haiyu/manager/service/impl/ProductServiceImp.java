package com.haiyu.manager.service.impl;

import com.haiyu.manager.dao.BaseProductMapper;
import com.haiyu.manager.pojo.BaseProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp {
    @Autowired
    BaseProductMapper baseProductMapper;
    public List<BaseProduct> getProductList(){
        return baseProductMapper.getProductList();
    }
    public BaseProduct getProductById(Integer productId){
        BaseProduct productById = baseProductMapper.getProductById(productId);
        return productById;
    }
    public void addProduct(BaseProduct baseProduct){
        baseProductMapper.addProduct(baseProduct);
    }
    public void updateProduct(BaseProduct baseProduct){
        baseProductMapper.updateProduct(baseProduct);
    }
    public void deleteProduct(Integer productId){
        baseProductMapper.deleteProduct(productId);
    }

}
