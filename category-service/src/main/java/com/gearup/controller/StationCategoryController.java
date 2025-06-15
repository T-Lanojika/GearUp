package com.gearup.controller;

import com.gearup.dto.StationDTO;
import com.gearup.model.Category;
import com.gearup.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/categories/station-owner")
public class StationCategoryController {
    private  final CategoryService categoryService;

    @PostMapping()
    public ResponseEntity<Category> createCategory(
           @RequestBody Category category
    ){
        StationDTO stationDTO = new StationDTO();
        stationDTO.setId(1L);
        Category savedCategory=categoryService.saveCategory(category,stationDTO);

        return ResponseEntity.ok(savedCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(
            @PathVariable Long id
    ) throws Exception {
        StationDTO stationDTO = new StationDTO();
        stationDTO.setId(1L);

        categoryService.deleteCategoryById(id,stationDTO.getId());

        return ResponseEntity.ok("Category deleted successfully");
    }
}
