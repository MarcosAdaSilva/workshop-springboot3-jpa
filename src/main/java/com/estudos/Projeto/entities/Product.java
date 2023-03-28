package com.estudos.Projeto.entities;

import java.util.Locale.Category;
import java.util.Set;

public class Product {
	
	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imgUrl;
	
	private Set<Category> categories = new HashSet<>(); // O SET É UMA INTERFACE E NÃO PODE SER INTANCIADO POR ISSO A CLASSE HASHSET

}
