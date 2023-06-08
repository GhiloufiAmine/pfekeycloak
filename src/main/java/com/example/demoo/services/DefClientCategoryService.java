package com.example.demoo.services;

import com.example.demoo.domain.DefClientCategory;
import com.example.demoo.repositories.DefClientCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DefClientCategoryService {

    private final DefClientCategoryRepository defClientCategoryRepository;

    @Autowired
    public DefClientCategoryService(DefClientCategoryRepository defClientCategoryRepository) {
        this.defClientCategoryRepository = defClientCategoryRepository;
    }

    public List<DefClientCategory> findAll() {
        return (List<DefClientCategory>) defClientCategoryRepository.findAll();
    }

    public Optional<DefClientCategory> findById(Long id) {
        return defClientCategoryRepository.findById(id);
    }

    public DefClientCategory save(DefClientCategory defClientCategory) {
        return defClientCategoryRepository.save(defClientCategory);
    }

    public void deleteById(Long id) {
        defClientCategoryRepository.deleteById(id);
    }

    public DefClientCategory update(DefClientCategory defClientCategory, Long id) {
    return defClientCategory;
    }
}