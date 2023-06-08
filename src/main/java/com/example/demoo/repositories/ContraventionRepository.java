package com.example.demoo.repositories;

import com.example.demoo.domain.Contravention;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContraventionRepository extends JpaRepository<Contravention, Long> {
}