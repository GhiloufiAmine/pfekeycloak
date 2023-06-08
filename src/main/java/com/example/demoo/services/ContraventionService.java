package com.example.demoo.services;

import com.example.demoo.domain.Contravention;
import com.example.demoo.repositories.ContraventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ContraventionService {

    private final ContraventionRepository contraventionRepository;

    @Autowired
    public ContraventionService(ContraventionRepository contraventionRepository) {
        this.contraventionRepository = contraventionRepository;
    }

    public List<Contravention> findAll() {
        return (List<Contravention>) contraventionRepository.findAll();
    }

    public Optional<Contravention> findById(Long id) {
        return contraventionRepository.findById(id);
    }

    public Contravention save(Contravention contravention) {
        return contraventionRepository.save(contravention);
    }

    public void deleteById(Long id) {
        contraventionRepository.deleteById(id);
    }

    public Contravention update(Contravention contravention, Long id) {
        return contravention;
    }
}