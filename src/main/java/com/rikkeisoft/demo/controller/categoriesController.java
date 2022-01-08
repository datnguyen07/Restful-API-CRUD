package com.rikkeisoft.demo.controller;

import java.util.List;

import com.rikkeisoft.demo.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rikkeisoft.demo.entity.Categories;
import com.rikkeisoft.demo.service.CategoriesServiceImpl;


@RequestMapping("/categorie")
@RestController
public class categoriesController {

    @Autowired
    private CategoriesServiceImpl categorieService;


    @PostMapping("/add")
    public Categories addCategories(@RequestBody Categories categorie) {
        return categorieService.addCategories(categorie);
    }

    @PutMapping("/update")
    public Categories updateCategories(@RequestParam("id") int id, @RequestBody Categories categorie) {
        return categorieService.updateCategories(id, categorie);

    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteCategories(@PathVariable("id") int id) {
        return categorieService.deleteCategories(id);
    }

    @GetMapping("/list")
    public List<Categories> getAllCategories() {
        return categorieService.getAllCategories();
    }

    @GetMapping("/getListCategoryDTO")
    public List<CategoryDTO> getListCategoryDTO() {
        return categorieService.getListCategoryDTO();
    }
}