package com.example.demoo.controllers;

import com.example.demoo.domain.DefVehicleCategoryType;
import com.example.demoo.services.DefVehicleCategoryTypeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/def-vehicle-category-types")
public class DefVehicleCategoryTypeController {

    private final DefVehicleCategoryTypeService defVehicleCategoryTypeService;

    @Autowired
    public DefVehicleCategoryTypeController(DefVehicleCategoryTypeService defVehicleCategoryTypeService) {
        this.defVehicleCategoryTypeService = defVehicleCategoryTypeService;
    }

    @GetMapping
    public List<DefVehicleCategoryType> getAllDefVehicleCategoryTypes() {
        return defVehicleCategoryTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DefVehicleCategoryType> getDefVehicleCategoryTypeById(@PathVariable Long id) {
        return defVehicleCategoryTypeService.findById(id);
    }

    @PostMapping
    public DefVehicleCategoryType createDefVehicleCategoryType(@RequestBody DefVehicleCategoryType defVehicleCategoryType) {
        return defVehicleCategoryTypeService.save(defVehicleCategoryType);
    }

    @PutMapping("/{id}")
    public DefVehicleCategoryType updateDefVehicleCategoryType(@RequestBody DefVehicleCategoryType defVehicleCategoryType, @PathVariable Long id) {
        return defVehicleCategoryTypeService.update(defVehicleCategoryType, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDefVehicleCategoryType(@PathVariable Long id) {
        defVehicleCategoryTypeService.deleteById(id);
    }
}