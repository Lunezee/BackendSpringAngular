package com.example.bibliothequemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliothequemanagement.entity.Livre;
import com.example.bibliothequemanagement.repository.LivreRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {
    @Autowired
    private LivreRepository livreRepository;

    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }
    public Optional<Livre> getLivreById(Long id) {
        return livreRepository.findById(id);
    }

    public Livre createLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    public Livre updateLivre(Long id, Livre livre) {
        Livre existingLivre = livreRepository.findById(id).orElseThrow(() -> new RuntimeException("Livre not found"));
        existingLivre.setTitre(livre.getTitre());
        existingLivre.setAuteur(livre.getAuteur());
        existingLivre.setDatePublication(livre.getDatePublication());
        existingLivre.setIsbn(livre.getIsbn());
        existingLivre.setGenre(livre.getGenre());
        return livreRepository.save(existingLivre);
    }

    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }
}
