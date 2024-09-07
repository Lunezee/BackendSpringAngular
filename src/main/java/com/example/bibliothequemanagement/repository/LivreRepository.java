package com.example.bibliothequemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bibliothequemanagement.entity.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {}

