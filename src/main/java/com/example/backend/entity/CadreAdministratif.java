package com.example.backend.entity;

import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
public class CadreAdministratif extends Person{

    private String poste;
    private Double salaire;

    public CadreAdministratif(){}

    public CadreAdministratif(Long id, String nom, String prenom, Date datedenaissance, String adr, String ville,String poste,Double salaire) {
        super(id, nom, prenom, datedenaissance, adr, ville);
        this.poste=poste;
        this.salaire=salaire;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }  
}