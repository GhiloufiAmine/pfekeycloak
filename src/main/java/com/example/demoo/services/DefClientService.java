package com.example.demoo.services;

import com.example.demoo.domain.DefClient;
import com.example.demoo.domain.DefUser;
import org.springframework.stereotype.Service;

@Service
public interface DefClientService {
    DefClient findDefClientByUser(DefUser user);

    DefClient saveOrUpdateClient(DefClient client);
}