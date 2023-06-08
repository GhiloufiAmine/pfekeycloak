package com.example.demoo.controllers;

import com.example.demoo.domain.DefClientCategory;
import com.example.demoo.services.DefClientCategoryService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/def-client-categories")
public class DefClientCategoryController {

    private final DefClientCategoryService defClientCategoryService;

    @Autowired
    public DefClientCategoryController(DefClientCategoryService defClientCategoryService) {
        this.defClientCategoryService = defClientCategoryService;
    }

    @GetMapping
    public List<DefClientCategory> getAllDefClientCategories() {
        return defClientCategoryService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DefClientCategory> getDefClientCategoryById(@PathVariable Long id) {
        return defClientCategoryService.findById(id);
    }

    @PostMapping
    public DefClientCategory createDefClientCategory(@RequestBody DefClientCategory defClientCategory) {
        return defClientCategoryService.save(defClientCategory);
    }

    @PutMapping("/{id}")
    public DefClientCategory updateDefClientCategory(@RequestBody DefClientCategory defClientCategory, @PathVariable Long id) {
        return defClientCategoryService.update(defClientCategory, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDefClientCategory(@PathVariable Long id) {
        defClientCategoryService.deleteById(id);
    }
}