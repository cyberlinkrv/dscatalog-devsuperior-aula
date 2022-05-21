package com.djssoftware.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djssoftware.dscatalog.entities.Category;
import com.djssoftware.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository reposotory;
	
	
	public List<Category> findAll() {
		return reposotory.findAll();
	}

}
