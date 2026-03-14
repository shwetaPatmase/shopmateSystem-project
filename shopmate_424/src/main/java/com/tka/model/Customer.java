package com.tka.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String fullName;
    String email;
    long mobileNo;
    String userName;
    String password;

    @OneToMany(mappedBy = "customer")
    List<Cart> cartItems;

    public Customer(){}

}