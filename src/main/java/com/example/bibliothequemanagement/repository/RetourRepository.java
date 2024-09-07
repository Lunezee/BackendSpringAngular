package com.example.bibliothequemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bibliothequemanagement.entity.Retour;

public interface RetourRepository extends JpaRepository<Retour, Long> {
}
