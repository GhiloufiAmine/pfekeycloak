package com.example.demoo.repositories;

import com.example.demoo.domain.RedFlag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RedFlagRepository extends JpaRepository<RedFlag, Long> {
}