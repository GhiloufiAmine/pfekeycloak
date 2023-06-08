package com.example.demoo.services;

import com.example.demoo.domain.RedFlag;
import com.example.demoo.repositories.RedFlagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RedFlagService {

    private final RedFlagRepository redFlagRepository;

    @Autowired
    public RedFlagService(RedFlagRepository redFlagRepository) {
        this.redFlagRepository = redFlagRepository;
    }

    public List<RedFlag> findAll() {
        return (List<RedFlag>) redFlagRepository.findAll();
    }

    public Optional<RedFlag> findById(Long id) {
        return redFlagRepository.findById(id);
    }

    public RedFlag save(RedFlag redFlag) {
        return redFlagRepository.save(redFlag);
    }

    public void deleteById(Long id) {
        redFlagRepository.deleteById(id);
    }

    public RedFlag update(RedFlag redFlag, Long id) {
    return redFlag;
    }
}