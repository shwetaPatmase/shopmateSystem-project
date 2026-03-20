package com.tka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ShopmateController {

	@GetMapping("/home")
	public String getHomePage() {
		return "home";
	}

	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@GetMapping("/register")
	public String getRegisterPage() {
		return "register";
	}

	@GetMapping("/bill")
	public String getBillPage() {
		return "bill";
	}

	@GetMapping("/shop")
	public String getShopPage() {
		return "shop";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {

		session.invalidate(); 
		System.err.println("successfully logout.. >>>>>login again");
		return "redirect:/login?logout=success";
	}

}
