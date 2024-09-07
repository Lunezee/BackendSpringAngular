package com.example.bibliothequemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bibliothequemanagement.entity.Auteur;
import com.example.bibliothequemanagement.service.AuteurService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auteurs")
public class AuteurController {
    @Autowired
    private AuteurService auteurService;

    @GetMapping("/list")
    public List<Auteur> getAllAuteurs() {
        return auteurService.getAllAuteurs();
    }



    
    @PostMapping("/add")
    public String createAuteur(@RequestBody Auteur auteur) {
    	Auteur myauteur= auteurService.createAuteur(auteur);
        return "Auteur cree avec succes";
    }
    @GetMapping("/{id}")
    public Optional<Auteur> getAuteurById(@PathVariable Long id) {
        return auteurService.getAuteurById(id);
    }
    
    @PutMapping("/update/{id}")
    public Auteur updateAuteur(@PathVariable Long id, @RequestBody Auteur auteur) {
        return auteurService.updateAuteur(id, auteur);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAuteur(@PathVariable Long id) {
        auteurService.deleteAuteur(id);
    }
}

