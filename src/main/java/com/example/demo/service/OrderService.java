package com.example.demo.service;

import com.example.demo.model.Invoice;
import com.example.demo.model.Order;
import com.example.demo.pojo.OrderPojo;

import java.util.List;
import java.util.Map;

public interface OrderService {
    List<Map<String, Object>> getAll();

    Order checkIt(Integer id) throws Exception;

    List<OrderPojo> addOrder(List<OrderPojo> orderPojo, Invoice invoice) throws Exception;
}
