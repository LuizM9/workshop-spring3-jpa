package com.ziulc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ziulc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
