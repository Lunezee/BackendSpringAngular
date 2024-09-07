package com.example.bibliothequemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bibliothequemanagement.entity.Auteur;
import com.example.bibliothequemanagement.repository.AuteurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AuteurService {

    @Autowired
    private AuteurRepository auteurRepository;

    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }
    public Optional<Auteur> getAuteurById(Long id) {
        return auteurRepository.findById(id);
    }

    public Auteur createAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public Auteur updateAuteur(Long id, Auteur updatedAuteur) {
        Auteur auteur = auteurRepository.findById(id).orElseThrow(() -> new RuntimeException("Auteur not found"));
        auteur.setNom(updatedAuteur.getNom());
        auteur.setDateNaissance(updatedAuteur.getDateNaissance());
        auteur.setNationalite(updatedAuteur.getNationalite());
        auteur.setDateNaissance(updatedAuteur.getDateNaissance());
        return auteurRepository.save(auteur);
    }

    public void deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
    }
    
    
//    public Auteur detailAuteur(Long id) {
//    	Auteur auteur = auteurRepository.existsById(id)
//    }
}
