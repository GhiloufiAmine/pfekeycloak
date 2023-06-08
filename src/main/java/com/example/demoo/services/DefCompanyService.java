package com.example.demoo.services;

import com.example.demoo.domain.DefCompany;
import com.example.demoo.repositories.DefCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DefCompanyService {

    private final DefCompanyRepository defCompanyRepository;

    @Autowired
    public DefCompanyService(DefCompanyRepository defCompanyRepository) {
        this.defCompanyRepository = defCompanyRepository;
    }

    public List<DefCompany> findAll() {
        return (List<DefCompany>) defCompanyRepository.findAll();
    }

    public Optional<DefCompany> findById(Long id) {
        return defCompanyRepository.findById(id);
    }

    public DefCompany save(DefCompany defCompany) {
        return defCompanyRepository.save(defCompany);
    }

    public void deleteById(Long id) {
        defCompanyRepository.deleteById(id);
    }

    public DefCompany update(DefCompany defCompany, Long id) {
    return defCompany;
    }
}