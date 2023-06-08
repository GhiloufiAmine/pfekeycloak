package com.example.demoo.services;

import com.example.demoo.domain.DriverLicence;
import com.example.demoo.repositories.DriverLicenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DriverLicenceService {

    private final DriverLicenceRepository driverLicenceRepository;

    @Autowired
    public DriverLicenceService(DriverLicenceRepository driverLicenceRepository) {
        this.driverLicenceRepository = driverLicenceRepository;
    }

    public List<DriverLicence> findAll() {
        return (List<DriverLicence>) driverLicenceRepository.findAll();
    }

    public Optional<DriverLicence> findById(Long id) {
        return driverLicenceRepository.findById(id);
    }

    public DriverLicence save(DriverLicence driverLicence) {
        return driverLicenceRepository.save(driverLicence);
    }

    public void deleteById(Long id) {
        driverLicenceRepository.deleteById(id);
    }

    public DriverLicence update(DriverLicence licence, Long id) {
    return licence;
    }
}