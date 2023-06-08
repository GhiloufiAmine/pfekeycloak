package com.example.demoo.repositories;

import com.example.demoo.domain.DefCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefCompanyRepository extends JpaRepository<DefCompany, Long> {
}