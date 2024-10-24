package com.cake.application.controller;

import com.cake.application.domain.Order;
import com.cake.application.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(value = "/create")
    public String createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping(value = "/")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }
}
