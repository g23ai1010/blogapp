package com.blogmanagement.services;

import java.util.List;

import com.blogmanagement.payloads.CategoryDto;

public interface CategoryService {

	//Create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//Update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//Delete 
	public void deleteCategory(Integer categoryId);
	
	//Get
	CategoryDto getCategory(Integer categoryId);
	
	//GetAll
	List<CategoryDto> getCategories();
	
}
