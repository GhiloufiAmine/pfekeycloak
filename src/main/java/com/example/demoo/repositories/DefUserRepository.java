package com.example.demoo.repositories;

import com.example.demoo.domain.DefUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefUserRepository extends JpaRepository<DefUser, Long> {

    DefUser findDefUserByUsername(String username);
    DefUser findDefUserByEmail(String email);

}