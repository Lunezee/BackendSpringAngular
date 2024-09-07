package com.example.bibliothequemanagement.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bibliothequemanagement.entity.Emprunt;
import com.example.bibliothequemanagement.repository.EmpruntRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmpruntService {

    @Autowired
    private EmpruntRepository empruntRepository;

    public List<Emprunt> getAllEmprunts() {
        return empruntRepository.findAll();
    }

    public Optional<Emprunt> getEmpruntById(Long id) {
        return empruntRepository.findById(id);
    }

    public Emprunt createEmprunt(Emprunt emprunt) {
        return empruntRepository.save(emprunt);
    }

    public Emprunt updateEmprunt(Long id, Emprunt emprunt) {
        Emprunt existingEmprunt = empruntRepository.findById(id).orElseThrow(() -> new RuntimeException("Emprunt not found"));
        existingEmprunt.setNomUtilisateur(emprunt.getNomUtilisateur());
        existingEmprunt.setTitreLivre(emprunt.getTitreLivre());
        existingEmprunt.setDateEmprunt(emprunt.getDateEmprunt());
        existingEmprunt.setDateRetour(emprunt.getDateRetour());
        return empruntRepository.save(existingEmprunt);
    }

    public void deleteEmprunt(Long id) {
        empruntRepository.deleteById(id);
    }
}
