package com.blogmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogmanagement.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

	
}
