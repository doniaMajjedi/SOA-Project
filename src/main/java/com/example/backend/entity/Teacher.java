package com.example.backend.entity;
import jakarta.persistence.Entity;

@Entity
//table for default will be as our class name
public class Teacher extends Person{

    //constructeur
    public Teacher(Long id,String nom, String prenom, String datedenaissance, String adr,String ville) {
        super(id,nom, prenom, datedenaissance, adr, ville);
    }

}