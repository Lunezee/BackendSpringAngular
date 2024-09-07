package com.example.bibliothequemanagement.service;
 

import com.example.bibliothequemanagement.entity.Utilisateur;
import com.example.bibliothequemanagement.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public Utilisateur authenticate(String username, String password) {
        Utilisateur utilisateur = utilisateurRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
        if (utilisateur.getPassword().equals(password)) {
            return utilisateur;
        } else {
            throw new RuntimeException("Mot de passe incorrect");
        }
    }

    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }
}
