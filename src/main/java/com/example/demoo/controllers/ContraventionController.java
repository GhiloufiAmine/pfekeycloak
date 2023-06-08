package com.example.demoo.controllers;

import com.example.demoo.domain.Contravention;
import com.example.demoo.services.ContraventionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contraventions")
public class ContraventionController {

    private final ContraventionService contraventionService;

    public ContraventionController(ContraventionService contraventionService) {
        this.contraventionService = contraventionService;
    }

    @GetMapping
    public List<Contravention> getAllContraventions() {
        return contraventionService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Contravention> getContraventionById(@PathVariable Long id) {
        return contraventionService.findById(id);
    }

    @PostMapping
    public Contravention createContravention(@RequestBody Contravention contravention) {
        return contraventionService.save(contravention);
    }

    @PutMapping("/{id}")
    public Contravention updateContravention(@RequestBody Contravention contravention, @PathVariable Long id) {
        return contraventionService.update(contravention, id);
    }

    @DeleteMapping("/{id}")
    public void deleteContravention(@PathVariable Long id) {
        contraventionService.deleteById(id);
    }
}
