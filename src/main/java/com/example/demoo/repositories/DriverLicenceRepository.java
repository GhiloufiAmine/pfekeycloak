package com.example.demoo.repositories;

import com.example.demoo.domain.DriverLicence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverLicenceRepository extends JpaRepository<DriverLicence, Long> {
}