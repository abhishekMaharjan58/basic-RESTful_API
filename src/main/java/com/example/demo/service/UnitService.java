package com.example.demo.service;

import com.example.demo.model.Unit;
import com.example.demo.pojo.ProductPojo;
import com.example.demo.pojo.UnitPojo;
import com.example.demo.repository.UnitRepo;

public interface UnitService {

    Unit checkIt(Integer id) throws Exception;
    Unit saveUnit(UnitPojo unitPojo) throws Exception;
}
