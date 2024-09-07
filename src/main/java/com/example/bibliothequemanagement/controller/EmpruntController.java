package com.example.bibliothequemanagement.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bibliothequemanagement.entity.Emprunt;
import com.example.bibliothequemanagement.service.EmpruntService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/emprunts")
public class EmpruntController {

    @Autowired
    private EmpruntService empruntService;

    @GetMapping("/list")
    public List<Emprunt> getAllEmprunts() {
        return empruntService.getAllEmprunts();
    }
    @GetMapping("/{id}")
    public Optional<Emprunt> getEmpruntById(@PathVariable Long id) {
        return empruntService.getEmpruntById(id);
    }

    @PostMapping("/add")
    public Emprunt createEmprunt(@RequestBody Emprunt emprunt) {
        return empruntService.createEmprunt(emprunt);
    }

    @PutMapping("/update/{id}")
    public Emprunt updateEmprunt(@PathVariable Long id, @RequestBody Emprunt emprunt) {
        return empruntService.updateEmprunt(id, emprunt);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmprunt(@PathVariable Long id) {
        empruntService.deleteEmprunt(id);
    }
}
