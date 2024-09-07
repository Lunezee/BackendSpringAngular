package com.example.bibliothequemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bibliothequemanagement.entity.Retour;
import com.example.bibliothequemanagement.service.RetourService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/retours")
public class RetourController {

    @Autowired
    private RetourService retourService;

    @GetMapping("/list")
    public List<Retour> getAllRetours() {
        return retourService.getAllRetours();
    }

    @PostMapping("/add")
    public Retour createRetour(@RequestBody Retour retour) {
        return retourService.createRetour(retour);
    }
    @GetMapping("/{id}")
    public Optional<Retour> getRetourById(@PathVariable Long id) {
        return retourService.getRetourById(id);
    }

    @PutMapping("/update/{id}")
    public Retour updateRetour(@PathVariable Long id, @RequestBody Retour retour) {
        return retourService.updateRetour(id, retour);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRetour(@PathVariable Long id) {
        retourService.deleteRetour(id);
    }
}


