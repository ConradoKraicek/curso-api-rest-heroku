package com.conrado.br.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conrado.br.entities.Order;
import com.conrado.br.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order finById(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}
	
	

}
