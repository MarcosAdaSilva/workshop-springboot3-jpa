package com.estudos.Projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.Projeto.entities.Order;
import com.estudos.Projeto.services.OrderService;

@RestController
@RequestMapping(value = "/orders") // APERTAR CTRL+F PARA EDITAR TODOS OS NOMES DA CLASSE DE UMA VEZ
public class OrderResource {

	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findByld(id);
		return ResponseEntity.ok().body(obj);
	}

}
