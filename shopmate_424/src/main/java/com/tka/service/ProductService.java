package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ProductDao;
import com.tka.model.Product;
import java.util.Optional;

@Service
public class ProductService {
@Autowired
ProductDao productDao;

public List<Product> getAllProducts() {
	List<Product>products=productDao.findAll();
	return products;
}

public  Product getProductById(int pId) {
	 Optional<Product> product = productDao.findById(pId);

	    if(product.isPresent()) {
	        return product.get();
	    }

	    return null;
}
	
}
