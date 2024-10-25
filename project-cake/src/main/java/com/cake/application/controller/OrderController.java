package com.cake.application.controller;

import com.cake.application.service.OrderService;
import com.cake.domain.Order;
import com.cake.infrastructure.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping(value = "/create")
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.createOrder(order));
    }

    @GetMapping(value = "/")
    public ResponseEntity<List<OrderDTO>> getOrders() {
        return ResponseEntity.ok(orderService.getOrders());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<OrderDTO> getOrder(@PathVariable Long id) {
        try {
            OrderDTO order = orderService.getOrderById(id);
            return ResponseEntity.ok(order);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
