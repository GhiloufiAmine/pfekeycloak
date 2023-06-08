package com.example.demoo.controllers;

import com.example.demoo.domain.DefBrand;
import com.example.demoo.services.DefBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/def-brands")
public class DefBrandController {

    private final DefBrandService defBrandService;

    @Autowired
    public DefBrandController(DefBrandService defBrandService) {
        this.defBrandService = defBrandService;
    }

    @GetMapping
    public List<DefBrand> getAllDefBrands() {
        return defBrandService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DefBrand> getDefBrandById(@PathVariable Long id) {
        return defBrandService.findById(id);
    }

    @PostMapping
    public DefBrand createDefBrand(@RequestBody DefBrand defBrand) {
        return defBrandService.save(defBrand);
    }

    @PutMapping("/{id}")
    public DefBrand updateDefBrand(@RequestBody DefBrand defBrand, @PathVariable Long id) {
        return defBrandService.update(defBrand, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDefBrand(@PathVariable Long id) {
        defBrandService.deleteById(id);
    }
}