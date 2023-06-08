package com.example.demoo.services;

import com.example.demoo.domain.DefVehicleCategoryType;
import com.example.demoo.repositories.DefVehicleCategoryTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DefVehicleCategoryTypeService {

    private final DefVehicleCategoryTypeRepository defVehicleCategoryTypeRepository;

    @Autowired
    public DefVehicleCategoryTypeService(DefVehicleCategoryTypeRepository defVehicleCategoryTypeRepository) {
        this.defVehicleCategoryTypeRepository = defVehicleCategoryTypeRepository;
    }

    public List<DefVehicleCategoryType> findAll() {
        return (List<DefVehicleCategoryType>) defVehicleCategoryTypeRepository.findAll();
    }

    public Optional<DefVehicleCategoryType> findById(Long id) {
        return defVehicleCategoryTypeRepository.findById(id);
    }

    public DefVehicleCategoryType save(DefVehicleCategoryType defVehicleCategoryType) {
        return defVehicleCategoryTypeRepository.save(defVehicleCategoryType);
    }

    public void deleteById(Long id) {
        defVehicleCategoryTypeRepository.deleteById(id);
    }

    public DefVehicleCategoryType update(DefVehicleCategoryType defVehicleCategoryType, Long id) {
    return defVehicleCategoryType;
    }
}