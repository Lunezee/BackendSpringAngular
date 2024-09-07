package com.example.bibliothequemanagement.entity;

import jakarta.persistence.*;
import java.sql.Date;



@Entity
@Table(name = "retours")
public class Retour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description_livre")
    private String descriptionLivre;

    @Column(name = "nom_complet")
    private String nomComplet; // Nom complet de l'utilisateur

    @Column(name = "date_retour")
    private Date dateRetour;

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptionLivre() {
        return descriptionLivre;
    }

    public void setDescriptionLivre(String descriptionLivre) {
        this.descriptionLivre = descriptionLivre;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }
}
