package com.gearup.service;

import com.gearup.dto.StationDTO;
import com.gearup.model.Category;

import java.util.Locale;
import java.util.Set;

public interface CategoryService {

    Category saveCategory(Category category, StationDTO stationDTO);
    Set<Category> getAllCategoriesByStation(Long id);
    Category getCategoryById(Long id) throws Exception;
    void deleteCategoryById(Long id);
}
