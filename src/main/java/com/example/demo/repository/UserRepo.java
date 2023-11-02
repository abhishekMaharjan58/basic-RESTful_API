package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Integer> {

    @Query(value = "Select a.id,a.name,a.contact,a.location from users a where a.status=true and a.is_admin = false", nativeQuery = true)
    List<Map<String, Object>> getAllUser();

    @Query(value = "select * from users a where a.id = ?1",nativeQuery = true)
    Optional<User> findByUserId(Integer id);
}
