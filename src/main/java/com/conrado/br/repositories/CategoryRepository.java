package com.conrado.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conrado.br.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
