package com.example.bibliothequemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bibliothequemanagement.entity.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {}
