package com.example.demoo.controllers;

import com.example.demoo.domain.DefClient;
import com.example.demoo.domain.DefUser;
import com.example.demoo.services.DefClientService;
import com.example.demoo.services.DefUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/clients")
public class DefClientController {

    private DefClientService defClientService;
    private DefUserService defUserService;

    @Autowired
    public DefClientController(DefClientService defClientService,
                               DefUserService defUserService) {
        this.defClientService = defClientService;
        this.defUserService = defUserService;
    }

    @GetMapping("/profile")
    public ResponseEntity<DefClient> getProfile() {
        DefUser user = defUserService.getLoggedInUser();
        DefClient client = defClientService.findDefClientByUser(user);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @PostMapping("/profile")
    public ResponseEntity<DefClient> updateProfile(@RequestBody DefClient client) {
        DefUser user = defUserService.getLoggedInUser();
        client.setUser(user);
        defClientService.saveOrUpdateClient(client);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
}