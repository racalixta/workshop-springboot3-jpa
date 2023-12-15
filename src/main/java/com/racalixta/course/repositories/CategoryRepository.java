package com.racalixta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.racalixta.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
