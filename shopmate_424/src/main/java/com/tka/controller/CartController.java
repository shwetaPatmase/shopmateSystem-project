package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.tka.model.Cart;
import com.tka.service.CartService;

@Controller
public class CartController {

	@Autowired
	CartService cartService;

	@PostMapping("/addtocart")
	public String addToCart(@RequestParam String name, @RequestParam long price, @RequestParam String image,
			@RequestParam int qty) {

		Cart cart = new Cart();

		cart.setName(name);
		cart.setPrice(price);
		cart.setImage(image);
		cart.setQty(qty);

		cartService.save(cart);

		return "redirect:/cart";
	}

	@GetMapping("/cart")
	public String getCart(Model model) {

		List<Cart> cartItems = cartService.getCartProducts();

		model.addAttribute("cartItems", cartItems);

		return "cart";
	}
}