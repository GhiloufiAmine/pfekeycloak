package com.example.demoo.services;

import com.example.demoo.domain.DefVehicle;
import com.example.demoo.repositories.DefVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DefVehicleService {

    private final DefVehicleRepository defVehicleRepository;

    @Autowired
    public DefVehicleService(DefVehicleRepository defVehicleRepository) {
        this.defVehicleRepository = defVehicleRepository;
    }

    public List<DefVehicle> findAll() {
        return (List<DefVehicle>) defVehicleRepository.findAll();
    }

    public Optional<DefVehicle> findById(Long id) {
        return defVehicleRepository.findById(id);
    }

    public DefVehicle save(DefVehicle defVehicle) {
        return defVehicleRepository.save(defVehicle);
    }

    public void deleteById(Long id) {
        defVehicleRepository.deleteById(id);
    }

    public DefVehicle update(DefVehicle Vehicle, Long id) {
    return Vehicle;
    }
}