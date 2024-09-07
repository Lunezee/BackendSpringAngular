package com.example.bibliothequemanagement.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bibliothequemanagement.entity.Retour;
import com.example.bibliothequemanagement.repository.RetourRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RetourService {

    @Autowired
    private RetourRepository retourRepository;

    public List<Retour> getAllRetours() {
        return retourRepository.findAll();
    }
    public Optional<Retour> getRetourById(Long id) {
        return retourRepository.findById(id);
    }

    public Retour createRetour(Retour retour) {
        return retourRepository.save(retour);
    }

    public Retour updateRetour(Long id, Retour retour) {
        Retour existingRetour = retourRepository.findById(id).orElseThrow(() -> new RuntimeException("Retour not found"));
        existingRetour.setDescriptionLivre(retour.getDescriptionLivre());
        existingRetour.setNomComplet(retour.getNomComplet());
        existingRetour.setDateRetour(retour.getDateRetour());
        return retourRepository.save(existingRetour);
    }

    public void deleteRetour(Long id) {
        retourRepository.deleteById(id);
    }
}
