package com.cake.application.controller;

import com.cake.application.domain.Order;
import com.cake.application.service.OrderService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderControllerJTest {

    private final OrderService orderService = new OrderService();
    private final OrderController orderController = new OrderController(orderService);

    @Test
    void createOrder() {
        var anOrder = new Order("99988877", "John Doe", "123 Main Street", "Medium", "Bacon");
        var result = orderController.createOrder(anOrder);
        assertTrue(result.contains("Order created"));
    }

    @Test
    void getOrders() {
        var orders = orderController.getOrders();
        assertEquals(1,orders.size());
    }
}