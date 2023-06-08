package com.example.demoo.services;

import com.example.demoo.domain.DefVehicleCategory;
import com.example.demoo.repositories.DefVehicleCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DefVehicleCategoryService {

    private final DefVehicleCategoryRepository defVehicleCategoryRepository;

    @Autowired
    public DefVehicleCategoryService(DefVehicleCategoryRepository defVehicleCategoryRepository) {
        this.defVehicleCategoryRepository = defVehicleCategoryRepository;
    }

    public List<DefVehicleCategory> findAll() {
        return (List<DefVehicleCategory>) defVehicleCategoryRepository.findAll();
    }

    public Optional<DefVehicleCategory> findById(Long id) {
        return defVehicleCategoryRepository.findById(id);
    }

    public DefVehicleCategory save(DefVehicleCategory defVehicleCategory) {
        return defVehicleCategoryRepository.save(defVehicleCategory);
    }

    public void deleteById(Long id) {
        defVehicleCategoryRepository.deleteById(id);
    }

    public DefVehicleCategory update(DefVehicleCategory defVehicleCategory, Long id) {
    return defVehicleCategory;
    }
}