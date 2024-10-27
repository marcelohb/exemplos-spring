package com.cake.infrastructure.repository;

import com.cake.infrastructure.dto.OrderDTO;
import com.cake.infrastructure.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    List<OrderDTO> findByFlavor(String flavor);
}
