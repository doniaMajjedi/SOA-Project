package com.example.backend.entity;

public class CadreAdministratif extends Person{

    private String poste;
    private Double salaire;

    public CadreAdministratif(Long id, String nom, String prenom, String datedenaissance, String adr, String ville,String poste,Double salaire) {
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