package com.ziulc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ziulc.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
