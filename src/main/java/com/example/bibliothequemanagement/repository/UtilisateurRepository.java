package com.example.bibliothequemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bibliothequemanagement.entity.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByUsername(String username);

	
}