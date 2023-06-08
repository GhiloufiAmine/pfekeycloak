package com.example.demoo.services;

import com.example.demoo.domain.DefVehicleModel;
import com.example.demoo.repositories.DefVehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DefVehicleModelService {

    private final DefVehicleModelRepository defVehicleModelRepository;

    @Autowired
    public DefVehicleModelService(DefVehicleModelRepository defVehicleModelRepository) {
        this.defVehicleModelRepository = defVehicleModelRepository;
    }

    public List<DefVehicleModel> findAll() {
        return (List<DefVehicleModel>) defVehicleModelRepository.findAll();
    }

    public Optional<DefVehicleModel> findById(Long id) {
        return defVehicleModelRepository.findById(id);
    }

    public DefVehicleModel save(DefVehicleModel defVehicleModel) {
        return defVehicleModelRepository.save(defVehicleModel);
    }

    public void deleteById(Long id) {
        defVehicleModelRepository.deleteById(id);
    }

    public DefVehicleModel update(DefVehicleModel defVehicleModel, Long id) {
    return defVehicleModel;
    }
}