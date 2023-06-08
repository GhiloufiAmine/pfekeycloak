package com.example.demoo.services.implementations;

import com.example.demoo.domain.DefClient;
import com.example.demoo.domain.DefUser;
import com.example.demoo.repositories.DefClientRepository;
import com.example.demoo.services.DefClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefClientServiceImplementation implements DefClientService {

    private DefClientRepository defClientRepository;

    @Autowired
    public DefClientServiceImplementation(DefClientRepository defClientRepository) {
        this.defClientRepository = defClientRepository;
    }

    @Override
    public DefClient findDefClientByUser(DefUser user) {
        return null;
    }

    @Override
    public DefClient saveOrUpdateClient(DefClient client) {
        return defClientRepository.save(client);
    }
}