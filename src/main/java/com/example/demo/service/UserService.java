package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.pojo.UserPojo;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<Map<String, Object>> getAll();

    UserPojo addUser(UserPojo userPojo) throws Exception;

    void deleteUser(Integer id) throws  Exception;
   User checkIt(Integer id) throws Exception;
}
