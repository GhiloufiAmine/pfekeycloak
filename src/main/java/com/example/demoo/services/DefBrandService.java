package com.example.demoo.services;

import com.example.demoo.domain.DefBrand;
import com.example.demoo.repositories.DefBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DefBrandService {

    private final DefBrandRepository defBrandRepository;

    @Autowired
    public DefBrandService(DefBrandRepository defBrandRepository) {
        this.defBrandRepository = defBrandRepository;
    }

    public List<DefBrand> findAll() {
        return (List<DefBrand>) defBrandRepository.findAll();
    }

    public Optional<DefBrand> findById(Long id) {
        return defBrandRepository.findById(id);
    }

    public DefBrand save(DefBrand defBrand) {
        return defBrandRepository.save(defBrand);
    }

    public void deleteById(Long id) {
        defBrandRepository.deleteById(id);
    }

    public DefBrand update(DefBrand defBrand, Long id) {
    return defBrand;
    }
}