package com.example.demoo.controllers;

import com.example.demoo.services.DefClientService;
import com.example.demoo.services.DefUserService;
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
}