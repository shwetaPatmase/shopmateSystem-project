package com.tka.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.tka.model.Customer;
import com.tka.service.CustomerService;

import jakarta.servlet.http.HttpSession;



@Controller
public class CustomerController {

	@Autowired
	CustomerService customerservice;
	
	@PostMapping("/add-Customer")
	public String addUser( Customer customer) {
		boolean isAdded=customerservice.addCustomer(customer);
		
		if(isAdded)
			return "login";
		return "register";
		
		
	}
	
	//verify-login
	@PostMapping("/verify-login")
	public String verifyCustomer(@RequestParam String userName,
	                             @RequestParam String password,
	                             Model model,
	                             HttpSession session) {

	    Customer customer = customerservice.verifyLoginCred(userName, password);

	    if(customer == null){
	        model.addAttribute("msg", "Invalid Username or Password");
	        return "login";
	    }

	    // store logged user
	    session.setAttribute("user", customer);

	    return "redirect:/profile";
	}
	
	@GetMapping("/profile")
	public String getProfilePage(HttpSession session, Model model){

	    Customer customer = (Customer) session.getAttribute("user");

	    if(customer == null){
	        return "redirect:/login";
	    }

	    model.addAttribute("customer", customer);

	    return "profile";
	}
		
}
