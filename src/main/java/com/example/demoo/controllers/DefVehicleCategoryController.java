package com.example.demoo.controllers;

import com.example.demoo.domain.DefVehicleCategory;
import com.example.demoo.services.DefVehicleCategoryService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/def-vehicle-categories")
public class DefVehicleCategoryController {

    private final DefVehicleCategoryService defVehicleCategoryService;

    @Autowired
    public DefVehicleCategoryController(DefVehicleCategoryService defVehicleCategoryService) {
        this.defVehicleCategoryService = defVehicleCategoryService;
    }

    @GetMapping
    public List<DefVehicleCategory> getAllDefVehicleCategories() {
        return defVehicleCategoryService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DefVehicleCategory> getDefVehicleCategoryById(@PathVariable Long id) {
        return defVehicleCategoryService.findById(id);
    }

    @PostMapping
    public DefVehicleCategory createDefVehicleCategory(@RequestBody DefVehicleCategory defVehicleCategory) {
        return defVehicleCategoryService.save(defVehicleCategory);
    }

    @PutMapping("/{id}")
    public DefVehicleCategory updateDefVehicleCategory(@RequestBody DefVehicleCategory defVehicleCategory, @PathVariable Long id) {
        return defVehicleCategoryService.update(defVehicleCategory, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDefVehicleCategory(@PathVariable Long id) {
        defVehicleCategoryService.deleteById(id);
    }
}