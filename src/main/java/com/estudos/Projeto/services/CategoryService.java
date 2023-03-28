package com.estudos.Projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.Projeto.entities.Category;
import com.estudos.Projeto.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired 
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findByld(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	

}
