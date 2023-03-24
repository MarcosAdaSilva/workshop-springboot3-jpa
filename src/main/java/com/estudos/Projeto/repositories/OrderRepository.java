package com.estudos.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
