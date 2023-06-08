package com.example.demoo.controllers;

import com.example.demoo.domain.RedFlag;
import com.example.demoo.services.RedFlagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/redflags")
public class RedFlagController {

    private final RedFlagService redFlagService;

    @Autowired
    public RedFlagController(RedFlagService redFlagService) {
        this.redFlagService = redFlagService;
    }

    @GetMapping
    public List<RedFlag> findAll() {
        return redFlagService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<RedFlag> findById(@PathVariable Long id) {
        return redFlagService.findById(id);
    }

    @PostMapping
    public RedFlag save(@RequestBody RedFlag redFlag) {
        return redFlagService.save(redFlag);
    }

    @PutMapping("/{id}")
    public RedFlag update(@RequestBody RedFlag redFlag, @PathVariable Long id) {
        return redFlagService.update(redFlag, id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        redFlagService.deleteById(id);
    }
}