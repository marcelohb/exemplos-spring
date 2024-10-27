package com.cake.application.service;

import com.cake.domain.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    void createOrder() {
        Order anOrder = new Order("999", "my name", "my address st", "SMALL", "BACON");
        var orderSaved = orderService.createOrder(anOrder);
        Assertions.assertNotNull(orderSaved);
    }

    @Test
    void getOrders() {
    }

    @Test
    void getOrderById() {
    }
}