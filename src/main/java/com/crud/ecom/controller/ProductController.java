package com.crud.ecom.controller;

import com.crud.ecom.Entity.Product;
import com.crud.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProduct();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.addProducts(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        service.deleteProduct(id);
        return ResponseEntity.ok("Deleted Successfully");
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,
                                 @RequestBody Product product) {
        return service.updateProduct(id, product);
    }
}
