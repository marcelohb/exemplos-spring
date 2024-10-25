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
        var phoneNumber = "99988877";
        var name = "Marcelo";
        var anOrder = new Order(phoneNumber, name, "123 Main Street", "Medium", "Bacon");
        var result = orderController.createOrder(anOrder);
        assertTrue(result.contains("Order created"));
        assertTrue(result.contains(phoneNumber));
        assertTrue(result.contains(name));
    }

    @Test
    void getOrders() {
        var orders = orderController.getOrders();
        assertEquals(1,orders.size());
    }
}