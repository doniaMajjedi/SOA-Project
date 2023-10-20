package com.example.backend.entity;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Students extends Person{
    @Column(name = "student_niveaudetude")
    protected int  niveauEtude;
    //constructeur
    public Students(Long id,String nom, String prenom, String datedenaissance, String adr, String mdp,int niveauEtude) {
        super(id,nom, prenom, datedenaissance, adr, mdp);
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