package com.example.demoo.controllers;

import com.example.demoo.domain.DefAgency;
import com.example.demoo.services.DefAgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/agencies")
public class DefAgencyController {

    private final DefAgencyService defAgencyService;

    @GetMapping("/")
    public String home() {
        return "agency/home";
    }


    @Autowired
    public DefAgencyController(DefAgencyService defAgencyService) {
        this.defAgencyService = defAgencyService;
    }

    @GetMapping
    public List<DefAgency> getAllDefAgencies() {
        return defAgencyService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DefAgency> getDefAgencyById(@PathVariable Long id) {
        return defAgencyService.findById(id);
    }

    @PostMapping
    public DefAgency createDefAgency(@RequestBody DefAgency defAgency) {
        return defAgencyService.save(defAgency);
    }

    @PutMapping("/{id}")
    public DefAgency updateDefAgency(@RequestBody DefAgency defAgency, @PathVariable Long id) {
        return defAgencyService.update(defAgency, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDefAgency(@PathVariable Long id) {
        defAgencyService.deleteById(id);
    }
}