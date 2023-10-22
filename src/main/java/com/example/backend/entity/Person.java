package com.example.backend.entity;

import java.sql.Date;


import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="User")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Person{

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    //for define inside the column
    @Column(name = "Firstname")
    protected String  nom;
    @Column(name = "Lastname")
    protected String prenom;
    @Column(name = "Birthday")
    protected Date datedenaissance;
    @Column(name = "Mail")
    protected String adr;
    @Column(name = "Adress")
    protected String ville;

    //constructor
        public Person(Long id,String nom, String prenom, Date datedenaissance, String adr, String ville) {
            this.id=id;
            this.nom = nom;
            this.prenom = prenom;
            this.datedenaissance = datedenaissance;
            this.adr = adr;
            this.ville = ville;
    }


    public Person() {

    }
}