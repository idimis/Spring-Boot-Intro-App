package com.idimis.freshGoodies.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

    @GetMapping
    public String getCart() {
        return "GET request - Returning cart items";
    }

    @PostMapping
    public String addItemToCart(@RequestBody String item) {
        return "POST request - Item added to cart: " + item;
    }

    @PutMapping("/{id}")
    public String updateCartItem(@PathVariable String id, @RequestBody String updatedItem) {
        return "PUT request - Item with ID " + id + " updated to: " + updatedItem;
    }

    @DeleteMapping("/{id}")
    public String removeItemFromCart(@PathVariable String id) {
        return "DELETE request - Item with ID " + id + " removed from cart";
    }
}
