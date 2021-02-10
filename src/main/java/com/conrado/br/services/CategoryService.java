package com.conrado.br.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conrado.br.entities.Category;
import com.conrado.br.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Category finById(Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
	
	

}
