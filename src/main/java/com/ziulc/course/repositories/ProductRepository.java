package com.ziulc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ziulc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
