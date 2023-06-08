package com.example.demoo.controllers;

import com.example.demoo.domain.DriverLicence;
import com.example.demoo.services.DriverLicenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/licences")
public class DriverLicenceController {

    private final DriverLicenceService licenceService;

    @Autowired
    public DriverLicenceController(DriverLicenceService licenceService) {
        this.licenceService = licenceService;
    }

    @GetMapping
    public List<DriverLicence> findAll() {
        return licenceService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DriverLicence> findById(@PathVariable Long id) {
        return licenceService.findById(id);
    }

    @PostMapping
    public DriverLicence save(@RequestBody DriverLicence licence) {
        return licenceService.save(licence);
    }

    @PutMapping("/{id}")
    public DriverLicence update(@RequestBody DriverLicence licence, @PathVariable Long id) {
        return licenceService.update(licence, id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        licenceService.deleteById(id);
    }
}