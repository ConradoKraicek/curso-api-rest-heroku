package com.conrado.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conrado.br.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
