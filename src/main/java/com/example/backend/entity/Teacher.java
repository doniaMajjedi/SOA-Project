package com.example.backend.entity;
import java.sql.Date;

import jakarta.persistence.Entity;

@Entity
//table for default will be as our class name
public class Teacher extends Person{

    public Teacher(){
        super();
    };
    //constructeur
    public Teacher(Long id,String nom, String prenom, Date datedenaissance, String adr,String ville) {
        super(id,nom, prenom, datedenaissance, adr, ville);
    }

}