package com.cake.application.service;

import com.cake.domain.Order;
import com.cake.infrastructure.dto.OrderDTO;
import com.cake.infrastructure.model.OrderEntity;
import com.cake.infrastructure.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public String createOrder(Order order) {
        OrderEntity orderEntity = new OrderEntity(order.getPhoneNumber(), order.getName(), order.getAddress(), order.getSize(), order.getFlavor(), order.getState());
        OrderEntity orderSaved = orderRepository.save(orderEntity);
        OrderDTO orderDTO = new OrderDTO(orderSaved.getId(), orderSaved.getPhoneNumber(), orderSaved.getName(), orderSaved.getAddress(), orderSaved.getSize(), orderSaved.getFlavor(), orderSaved.getState());
        return "Order ID: " + orderDTO.getId() + " created. Status: " + orderDTO.getState() + " order: " + orderDTO;
    }

    public List<OrderDTO> getOrders() {
        List<OrderEntity> orderList = orderRepository.findAll();
        List<OrderDTO> orders = new ArrayList<>();
        for (OrderEntity order : orderList) {
            OrderDTO orderDTO = new OrderDTO(order.getId(), order.getPhoneNumber(), order.getName(), order.getAddress(), order.getSize(), order.getFlavor(), order.getState());
            orders.add(orderDTO);
        }
        return orders;
    }

}
