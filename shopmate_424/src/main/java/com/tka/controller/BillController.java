package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tka.model.Bill;
import com.tka.model.Cart;
import com.tka.model.Customer;
import com.tka.service.BillService;
import com.tka.service.CartService;

import jakarta.servlet.http.HttpSession;

@Controller
public class BillController {

    @Autowired
    CartService cartService;

    @Autowired
    BillService billService;

    @PostMapping("/buyProducts")
    public String buyProducts(
            @RequestParam(value = "cartIds", required = false) List<Integer> cartIds,
            Model model,
            HttpSession session,
            RedirectAttributes redirectAttributes){

        Customer customer = (Customer) session.getAttribute("user");

        if(customer == null){
            return "redirect:/login";
        }

        // 🔴 FIRST check null or empty
        if(cartIds == null || cartIds.isEmpty()){
            redirectAttributes.addFlashAttribute("msg", "Select at least one item to buy!");
            return "redirect:/cart";
        }

        // THEN use it
        List<Cart> products = cartService.getProductsByIds(cartIds);

        long total = 0;
        for(Cart c : products){
            total += c.getPrice() * c.getQty();
        }

        Bill bill = new Bill();
        bill.setCustomer(customer);
        bill.setTotalAmount(total);

        billService.saveBill(bill);

        // delete selected items
        cartService.deleteCartItem(cartIds);

        model.addAttribute("customer", customer);
        model.addAttribute("products", products);
        model.addAttribute("total", total);

        return "bill";
    }
}