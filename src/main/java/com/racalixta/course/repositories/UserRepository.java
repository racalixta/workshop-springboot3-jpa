package com.racalixta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.racalixta.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
