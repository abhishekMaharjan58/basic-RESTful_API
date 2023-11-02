package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table (name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    Integer quantity;

    @JoinColumn(name = "user_id",referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    User user;

    @JoinColumn(name = "invoice_id",referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    Invoice invoice;

    @JoinColumn(name = "product_id",referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    Product product;

    Boolean status = true;

}
