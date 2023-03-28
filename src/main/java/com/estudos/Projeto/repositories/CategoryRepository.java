package com.estudos.Projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
