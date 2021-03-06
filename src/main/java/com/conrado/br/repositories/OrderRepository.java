package com.conrado.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conrado.br.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
