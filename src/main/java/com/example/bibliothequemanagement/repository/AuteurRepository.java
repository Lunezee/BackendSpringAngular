package com.example.bibliothequemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bibliothequemanagement.entity.Auteur;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {}

