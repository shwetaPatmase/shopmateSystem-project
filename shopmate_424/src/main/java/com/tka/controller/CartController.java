package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.tka.model.Cart;
import com.tka.model.Customer;
import com.tka.service.CartService;

import jakarta.servlet.http.HttpSession;

@Controller
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/addtocart")
    public String addToCart(@RequestParam String name,
                            @RequestParam long price,
                            @RequestParam String image,
                            @RequestParam int qty,
                            HttpSession session) {

        Customer customer = (Customer) session.getAttribute("user");

        if(customer == null){
            return "redirect:/login";
        }

        Cart cart = new Cart();
        cart.setName(name);
        cart.setPrice(price);
        cart.setImage(image);
        cart.setQty(qty);

        cart.setCustomer(customer);

        cartService.save(cart);

        return "redirect:/cart";
    }

    @GetMapping("/cart")
    public String getCart(Model model, HttpSession session) {

        Customer customer = (Customer) session.getAttribute("user");

        if(customer == null){
            return "redirect:/login";
        }

        List<Cart> cartItems = cartService.getCartProducts(customer.getId());

        model.addAttribute("cartItems", cartItems);

        return "cart";
    }

    

    
}