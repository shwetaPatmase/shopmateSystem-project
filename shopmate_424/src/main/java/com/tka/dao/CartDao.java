package com.tka.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tka.model.Cart;

public interface CartDao extends JpaRepository<Cart,Integer>{

}