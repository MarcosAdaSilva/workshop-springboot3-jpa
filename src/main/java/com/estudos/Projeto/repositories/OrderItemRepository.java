package com.estudos.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Projeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
