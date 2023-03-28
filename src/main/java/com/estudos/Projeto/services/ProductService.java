package com.estudos.Projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.Projeto.entities.Product;
import com.estudos.Projeto.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired 
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findByld(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	

}
