package com.example.bibliothequemanagement.controller;


import com.example.bibliothequemanagement.entity.Utilisateur;
import com.example.bibliothequemanagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Utilisateur login(@RequestBody Utilisateur utilisateur) {
        return loginService.authenticate(utilisateur.getUsername(), utilisateur.getPassword());
    }

    @PostMapping("/register")
    public Utilisateur register(@RequestBody Utilisateur utilisateur) {
        return loginService.save(utilisateur);
    }
}
