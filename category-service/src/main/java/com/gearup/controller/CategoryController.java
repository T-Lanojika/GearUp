package com.gearup.controller;

import com.gearup.model.Category;
import com.gearup.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private  final CategoryService categoryService;

    public ResponseEntity<Set<Category>> getCategoriesByStation(
            @PathVariable Long id
    ){
        Set<Category> categories=categoryService.getAllCategoriesByStation(id);
        return ResponseEntity.ok(categories);
    }
}
