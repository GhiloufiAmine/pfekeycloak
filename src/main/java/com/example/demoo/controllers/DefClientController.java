package com.example.demoo.controllers;

import com.example.demoo.domain.DefClient;
import com.example.demoo.domain.DefUser;
import com.example.demoo.services.DefClientService;
import com.example.demoo.services.DefUserService;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/client")
public class DefClientController {

    private DefClientService defClientService;
    private DefUserService defUserService;

    @Autowired
    public DefClientController(DefClientService defClientService,
                               DefUserService defUserService) {
        this.defClientService = defClientService;
        this.defUserService = defUserService;
    }

    @GetMapping("/complete-profile")
    public String showProfileForm(Model model, Authentication auth) {
        DefUser user = (DefUser) auth.getPrincipal();
        model.addAttribute("user", user);
        model.addAttribute("client", new DefClient());
        return "complete-profile";
    }

    // @PostMapping("/complete-profile")
    //public String submitProfile(DefClient client, Authentication auth) {
        //DefUser user = (DefUser) auth.getPrincipal();
        //user.setProfileComplete(true);
        //return "redirect:/user/home";
    //}
}