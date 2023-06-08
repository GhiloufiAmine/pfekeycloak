package com.example.demoo.controllers;

import com.example.demoo.domain.DefVehicleModel;
import com.example.demoo.services.DefVehicleModelService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/def-vehicle-models")
public class DefVehicleModelController {

    private final DefVehicleModelService defVehicleModelService;

    @Autowired
    public DefVehicleModelController(DefVehicleModelService defVehicleModelService) {
        this.defVehicleModelService = defVehicleModelService;
    }

    @GetMapping
    public List<DefVehicleModel> getAllDefVehicleModels() {
        return defVehicleModelService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DefVehicleModel> getDefVehicleModelById(@PathVariable Long id) {
        return defVehicleModelService.findById(id);
    }

    @PostMapping
    public DefVehicleModel createDefVehicleModel(@RequestBody DefVehicleModel defVehicleModel) {
        return defVehicleModelService.save(defVehicleModel);
    }

    @PutMapping("/{id}")
    public DefVehicleModel updateDefVehicleModel(@RequestBody DefVehicleModel defVehicleModel, @PathVariable Long id) {
        return defVehicleModelService.update(defVehicleModel, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDefVehicleModel(@PathVariable Long id) {
        defVehicleModelService.deleteById(id);
    }
}