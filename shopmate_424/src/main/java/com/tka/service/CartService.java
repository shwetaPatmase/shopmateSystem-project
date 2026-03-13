package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CartDao;
import com.tka.model.Cart;

@Service
public class CartService {

    @Autowired
    CartDao cartDao;

//    public void addProduct(Cart cart){
//        cartDao.save(cart);
//    }

    public List<Cart> getCartProducts(){
        return cartDao.findAll();
    }

	public void save(Cart cart) {
		cartDao.save(cart);
		
	}
}