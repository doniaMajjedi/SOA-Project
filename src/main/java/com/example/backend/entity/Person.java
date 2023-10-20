package com.example.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Person {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    //for define inside the column
    @Column(name = "Person_Firstname")
    protected String  nom;
    @Column(name = "Person_Lastname")
    protected String prenom;
    @Column(name = "Person_Birthday")
    protected String datedenaissance;
    @Column(name = "Person_Mail")
    protected String adr;
    @Column(name = "Person_ville")
    protected String ville;

    //constructor
        public Person(Long id,String nom, String prenom, String datedenaissance, String adr, String ville) {
            this.id=id;
            this.nom = nom;
            this.prenom = prenom;
            this.datedenaissance = datedenaissance;
            this.adr = adr;
            this.ville = ville;
    }

    //getters and setters
    public Long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getDatedenaissance() {
        return datedenaissance;
    }
    public String getAdr() {
        return adr;
    }
    public String getVille() {
        return ville;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setDatedenaissance(String datedenaissance) {
        this.datedenaissance = datedenaissance;
    }
    public void setAdr(String adr) {
        this.adr = adr;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    
}