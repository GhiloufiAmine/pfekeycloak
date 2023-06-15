package com.example.demoo.controllers;

import com.example.demoo.domain.DefClient;
//import com.example.demoo.domain.DefUser;
import com.example.demoo.repositories.DefClientRepository;
import com.example.demoo.services.DefClientService;
import com.example.demoo.services.DefUserService;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/api/clients")
public class DefClientController {

    private DefClientService defClientService;
    private DefUserService defUserService;
    private DefClientRepository defClientRepository;

    @Autowired
    public DefClientController(DefClientService defClientService,
                               DefUserService defUserService,
                               DefClientRepository defClientRepository) {
        this.defClientService = defClientService;
        this.defUserService = defUserService;
        this.defClientRepository = defClientRepository;
    }

    //@GetMapping("/complete-profile")
    //public String showProfileForm(Model model, Authentication auth) {
      //  DefUser user = (DefUser) auth.getPrincipal();
      // model.addAttribute("user", user);
      //  model.addAttribute("client", new DefClient());
        //return "complete-profile";
    //}

    // @PostMapping("/complete-profile")
    //public String submitProfile(DefClient client, Authentication auth) {
        //DefUser user = (DefUser) auth.getPrincipal();
        //user.setProfileComplete(true);
        //return "redirect:/user/home";
    //}

    @PostMapping("/admin/clients")
    public ResponseEntity<DefClient> saveClient(DefClient client) {
        return ResponseEntity.ok(defClientRepository.save(client));
    }

    @GetMapping("/user/clients")
    public ResponseEntity<List<DefClient>> getClient() {
        return ResponseEntity.ok(defClientRepository.findAll());
    }
}