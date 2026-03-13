package com.tka.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@Component
@AllArgsConstructor
public class Cart {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int cartId;

	    private String name;
	    private long price;
	    private String image;
	    private int qty;

	    public Cart(){}

}
