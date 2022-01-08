package com.rikkeisoft.demo.repository;

import java.util.List;

import com.rikkeisoft.demo.dto.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rikkeisoft.demo.entity.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories,Integer> {
    @Query(value = "select new com.rikkeisoft.demo.dto.CategoryDTO(" +
            "c.id, c.name, count(p.id)" +
            ") from Categories c left join Product p on c.id = p.category_id" +
            " and p.price >= 100000 and p.price <=500000" +
            " group by c.id")
    public List<CategoryDTO> getListCategoryDTO();
}
