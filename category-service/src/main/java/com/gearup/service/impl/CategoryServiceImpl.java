package com.gearup.service.impl;

import com.gearup.dto.StationDTO;
import com.gearup.model.Category;
import com.gearup.repository.CategoryRepository;
import com.gearup.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private  final CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category, StationDTO stationDTO) {
        Category newCategory = new Category();
        newCategory.setName(category.getName());
        newCategory.setStationId(category.getId());
        newCategory.setImage(category.getImage());

        return categoryRepository.save(newCategory);
    }

    @Override
    public Set<Category> getAllCategoriesByStation(Long id) {
        return categoryRepository.findByStationId(id);
    }

    @Override
    public Category getCategoryById(Long id) throws Exception {
        Category category=categoryRepository.findById(id).orElse(null);

        if(category == null){
            throw new Exception("Category not exist with id" + id);
        }
        return category;
    }

    @Override
    public void deleteCategoryById(Long id,Long stationId) throws Exception {
        Category category = getCategoryById(id);
        if(category.getStationId().equals(stationId)){
            throw new Exception("You don't have permission to delete this category");
        }
        categoryRepository.deleteById(id);

    }
}
