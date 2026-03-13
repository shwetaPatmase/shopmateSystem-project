package com.tka.controller;

import java.util.List;
import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.model.Product;
import com.tka.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public String getProducts(Model model) {
		List<Product> products=productService.getAllProducts();
		model.addAttribute("products", products);
		return "products";
	}
	
	
}
