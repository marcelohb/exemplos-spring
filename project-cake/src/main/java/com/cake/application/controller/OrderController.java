package com.cake.application.controller;

import com.cake.application.service.OrderService;
import com.cake.domain.Order;
import com.cake.infrastructure.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/create")
    public String createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @GetMapping(value = "/")
    public List<OrderDTO> getOrders() {
        return orderService.getOrders();
    }
}
