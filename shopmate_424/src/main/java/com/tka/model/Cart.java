package com.tka.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;

    private String name;
    private long price;
    private String image;
    private int qty;

    @ManyToOne
    @JoinColumn(name = "customer_id")   // foreign key
    private Customer customer;

    public Cart(){}

}