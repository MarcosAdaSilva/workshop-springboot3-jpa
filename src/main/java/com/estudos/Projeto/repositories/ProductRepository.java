package com.estudos.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
