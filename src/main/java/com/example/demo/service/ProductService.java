package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.pojo.ProductPojo;

import java.util.List;
import java.util.Map;

public interface ProductService {
    List<Map<String, Object>> getAll();
    ProductPojo addProduct(ProductPojo productPojo) throws Exception;
    ProductPojo updateProduct(Integer id , ProductPojo productPojo);
    void removeProduct(Integer id) throws Exception;

    Product checkIt(Integer id) throws Exception;

}
