package com.btvn.bai1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/admin/orders")
    public String getOrders() {
        return "List of all orders (ADMIN only)";
    }

    @GetMapping("/public/products")
    public String getPublicProducts() {
        return "List of public products";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to SmartRetail Hub Homepage";
    }

    @GetMapping("/user/profile")
    public String userProfile() {
        return "User Profile Page";
    }
}