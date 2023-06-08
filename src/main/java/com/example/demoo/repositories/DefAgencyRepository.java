package com.example.demoo.repositories;

import com.example.demoo.domain.DefAgency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefAgencyRepository extends JpaRepository<DefAgency, Long> {
}