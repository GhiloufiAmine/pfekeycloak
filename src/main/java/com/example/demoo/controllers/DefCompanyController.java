package com.example.demoo.controllers;

import com.example.demoo.domain.DefCompany;
import com.example.demoo.services.DefCompanyService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/def-companies")
public class DefCompanyController {

    private final DefCompanyService defCompanyService;

    @Autowired
    public DefCompanyController(DefCompanyService defCompanyService) {
        this.defCompanyService = defCompanyService;
    }

    @GetMapping
    public List<DefCompany> getAllDefCompanies() {
        return defCompanyService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DefCompany> getDefCompanyById(@PathVariable Long id) {
        return defCompanyService.findById(id);
    }

    @PostMapping
    public DefCompany createDefCompany(@RequestBody DefCompany defCompany) {
        return defCompanyService.save(defCompany);
    }

    @PutMapping("/{id}")
    public DefCompany updateDefCompany(@RequestBody DefCompany defCompany, @PathVariable Long id) {
        return defCompanyService.update(defCompany, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDefCompany(@PathVariable Long id) {
        defCompanyService.deleteById(id);
    }
}