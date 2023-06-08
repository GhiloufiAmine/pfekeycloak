package com.example.demoo.repositories;

import com.example.demoo.domain.DefClient;
import com.example.demoo.domain.DefUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefClientRepository extends JpaRepository<DefClient, Long>{
    DefClient findDefClientByUser(DefUser user);
}