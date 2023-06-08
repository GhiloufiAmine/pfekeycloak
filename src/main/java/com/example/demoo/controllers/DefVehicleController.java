package com.example.demoo.controllers;

import com.example.demoo.domain.DefVehicle;
import com.example.demoo.services.DefVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicles")
public class DefVehicleController {

    private final DefVehicleService vehicleService;

    @Autowired
    public DefVehicleController(DefVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<DefVehicle> findAll() {
        return vehicleService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DefVehicle> findById(@PathVariable Long id) {
        return vehicleService.findById(id);
    }

    @PostMapping
    public DefVehicle save(@RequestBody DefVehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @PutMapping("/{id}")
    public DefVehicle update(@RequestBody DefVehicle vehicle, @PathVariable Long id) {
        return vehicleService.update(vehicle, id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        vehicleService.deleteById(id);
    }

}