package com.example.demo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class OrderPojo {
    private Integer id;
    private Integer userId;
    private Integer quantity;
    private Integer productId;
    private Integer price;
}
