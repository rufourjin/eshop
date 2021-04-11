package com.haiyu.manager.dao;

import com.haiyu.manager.pojo.BaseProduct;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaseProductMapper {
    List<BaseProduct> getProductList();
    BaseProduct getProductById(Integer productId);
    void addProduct(BaseProduct baseProduct);
    void updateProduct(BaseProduct baseProduct);
    void  deleteProduct(Integer productId);
}
