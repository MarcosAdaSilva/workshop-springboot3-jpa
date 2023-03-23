package com.estudos.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
