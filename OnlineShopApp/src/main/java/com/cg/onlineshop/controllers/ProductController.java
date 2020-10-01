package com.cg.onlineshop.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.onlineshop.beans.Product;
@RestController
public class ProductController {

	@GetMapping("/hello")
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<>("Hello To All Welcome to OnlineShop REST Services",HttpStatus.OK);
	}
	@GetMapping("/getProduct")
	public ResponseEntity<Product> getProduct(){
		Product product = new Product(111, 150000, "HP Laptop");
		return new ResponseEntity<>(product,HttpStatus.OK);
	}
}
