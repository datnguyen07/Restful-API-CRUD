package com.rikkeisoft.demo.service;

import java.util.List;

import com.rikkeisoft.demo.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rikkeisoft.demo.entity.Categories;
import com.rikkeisoft.demo.repository.CategoriesRepository;

@Service
public class CategoriesServiceImpl{

	@Autowired
    private CategoriesRepository categorieRepository;

	
	public Categories addCategories(Categories categorie) {
		if(categorie != null)
		return categorieRepository.save(categorie);
		return null;
	}

	
	public Categories updateCategories(int id, Categories categorie) {
		if(categorie != null) {
			Categories categorie1 =categorieRepository.getById(id);
			if(categorie1 != null) {
				categorie1.setName(categorie.getName());
				categorie1.setCreated_at(categorie.getCreated_at());
				categorie1.setUpdated_at(categorie.getUpdated_at());
				
				return categorieRepository.save(categorie1);
			}
		}
		return null;
	}

	
	public boolean deleteCategories(int id) {
		if (id<=1) {
			Categories categorie = categorieRepository.getById(id);
			if(categorie!=null) {
				categorieRepository.delete(categorie);
				return true;
			}
		}
		return false;
	}

	
	public List<Categories> getAllCategories() {
		return categorieRepository.findAll();
	}

	
	public Categories getOnecategories(int id) {
		// TODO Auto-generated method stub
		return categorieRepository.getById(id);
	}

	public List<CategoryDTO> getListCategoryDTO(){
		return categorieRepository.getListCategoryDTO();
	}
	
	

}
