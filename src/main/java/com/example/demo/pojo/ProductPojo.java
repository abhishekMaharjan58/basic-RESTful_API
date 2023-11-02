package com.example.demo.pojo;

import com.example.demo.model.Unit;
import lombok.Data;

@Data
public class ProductPojo {
    private Integer id;

    private String name;

    private Integer price;

    private String description;

    private Boolean status=true;

    private UnitPojo unitPojo;
}
