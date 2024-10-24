package com.cake.application.service;

import com.cake.application.domain.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    public String createOrder(Order order) {
        return "Order created";
    }

    public List<Order> getOrders() {
        List<Order> orderList = new ArrayList<>();
        var order1 = new Order("99988877", "John Doe", "123 Main Street", "Medium", "Bacon");
        orderList.add(order1);
        return orderList;
    }
}
