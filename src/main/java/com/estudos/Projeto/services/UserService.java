package com.estudos.Projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.Projeto.entities.User;
import com.estudos.Projeto.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findByld(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	

}