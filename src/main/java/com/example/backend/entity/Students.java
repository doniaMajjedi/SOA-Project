package com.example.backend.entity;
 
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Students extends Person{
    @Column(name = "student_niveaudetude")
    protected int  niveauEtude;

    //default constructor
    public Students(){}

    //constructeur
    public Students(Long id,String nom, String prenom, Date datedenaissance, String adr, String ville,int niveauEtude) {
        super(id,nom, prenom, datedenaissance, adr, ville);
        this.niveauEtude=niveauEtude;
    }

//getters and setters
    public int getNiveauEtude() {
        return niveauEtude;
    }

    public void setNiveauEtude(int niveauEtude) {
        this.niveauEtude = niveauEtude;
    }

    
    
}