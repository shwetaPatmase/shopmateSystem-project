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

    public List<Cart> getCartProducts(int customerId){
        return cartDao.findByCustomerId(customerId);
    }

    public void save(Cart cart) {
        cartDao.save(cart);
    }

    public List<Cart> getProductsByIds(List<Integer> ids){
        return cartDao.findAllById(ids);
    }
    
    public void deleteCartItem(List<Integer> cartIds){
        for(Integer id : cartIds){
            cartDao.deleteById(id);
        }
    }

}