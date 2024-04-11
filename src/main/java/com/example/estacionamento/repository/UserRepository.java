package com.example.estacionamento.repository;

import com.example.estacionamento.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
