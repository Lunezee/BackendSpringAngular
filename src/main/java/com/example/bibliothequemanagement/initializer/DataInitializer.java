package com.example.bibliothequemanagement.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.bibliothequemanagement.entity.Auteur;
import com.example.bibliothequemanagement.service.AuteurService;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private AuteurService auteurService;

    @Override
    public void run(String... args) throws Exception {
        // Vérifiez d'abord s'il y a des auteurs existants
        if (auteurService.getAllAuteurs().isEmpty()) {
            // Créez et ajoutez un auteur si la liste est vide
            Auteur auteur1 = new Auteur();
            auteur1.setNom("Hugo");
            auteur1.setDateNaissance(LocalDate.of(1802, 2, 26));
            auteur1.setNationalite("Française");
            auteurService.createAuteur(auteur1);

            // Ajout d'un deuxième auteur
            Auteur auteur2 = new Auteur();
            auteur2.setNom("Dumas");
            auteur2.setDateNaissance(LocalDate.of(1802, 7, 24));
            auteur2.setNationalite("Française");
            auteurService.createAuteur(auteur2);
        }
    }
}

