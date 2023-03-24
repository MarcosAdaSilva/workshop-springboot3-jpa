package com.estudos.Projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.Projeto.entities.Order;
import com.estudos.Projeto.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired 
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findByld(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	

}
