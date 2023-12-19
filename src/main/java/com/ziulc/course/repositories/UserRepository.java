package com.ziulc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ziulc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
