package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String buyProducts(@RequestParam("cartIds") List<Integer> cartIds,
                              Model model,
                              HttpSession session){

        Customer customer = (Customer) session.getAttribute("user");

        List<Cart> products = cartService.getProductsByIds(cartIds);

        long total = 0;

        for(Cart c : products){
            total += c.getPrice() * c.getQty();
        }

        Bill bill = new Bill();
        bill.setCustomer(customer);
        bill.setTotalAmount(total);

        billService.saveBill(bill);

        model.addAttribute("customer", customer);
        model.addAttribute("products", products);
        model.addAttribute("total", total);

        return "bill";
    }
}