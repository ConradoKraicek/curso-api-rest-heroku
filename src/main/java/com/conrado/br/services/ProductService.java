package com.conrado.br.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conrado.br.entities.Product;
import com.conrado.br.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product finById(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
	}
	
	

}
