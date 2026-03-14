package com.tka.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tka.model.Cart;

public interface CartDao extends JpaRepository<Cart,Integer>{
	   List<Cart> findByCustomerId(int id);
}