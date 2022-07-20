package com.example.demo.aula.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.aula.jpa.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {}
