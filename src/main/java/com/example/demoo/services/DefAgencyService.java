package com.example.demoo.services;

import com.example.demoo.domain.DefAgency;
import com.example.demoo.repositories.DefAgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DefAgencyService {

    private final DefAgencyRepository defAgencyRepository;

    @Autowired
    public DefAgencyService(DefAgencyRepository defAgencyRepository) {
        this.defAgencyRepository = defAgencyRepository;
    }

    public List<DefAgency> findAll() {
        return (List<DefAgency>) defAgencyRepository.findAll();
    }

    public Optional<DefAgency> findById(Long id) {
        return defAgencyRepository.findById(id);
    }

    public DefAgency save(DefAgency defAgency) {
        return defAgencyRepository.save(defAgency);
    }

    public void deleteById(Long id) {
        defAgencyRepository.deleteById(id);
    }

    public DefAgency update(DefAgency defAgency, Long id) {
    return defAgency;
    }
}