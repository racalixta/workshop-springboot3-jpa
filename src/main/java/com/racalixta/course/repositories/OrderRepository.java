package com.racalixta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.racalixta.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
