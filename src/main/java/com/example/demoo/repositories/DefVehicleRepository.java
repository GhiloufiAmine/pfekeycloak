package com.example.demoo.repositories;

import com.example.demoo.domain.DefVehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefVehicleRepository extends JpaRepository<DefVehicle, Long> {
}