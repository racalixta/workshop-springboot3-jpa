package com.racalixta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.racalixta.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
