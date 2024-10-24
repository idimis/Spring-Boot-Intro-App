package com.idimis.freshGoodies.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping
    public String getAllProducts() {
        return "GET request - Returning all products";
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable String id) {
        return "GET request - Returning product with ID: " + id;
    }

    @PostMapping
    public String createProduct(@RequestBody String product) {
        return "POST request - Product created: " + product;
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable String id, @RequestBody String updatedProduct) {
        return "PUT request - Product with ID " + id + " updated to: " + updatedProduct;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable String id) {
        return "DELETE request - Product with ID " + id + " deleted";
    }
}
