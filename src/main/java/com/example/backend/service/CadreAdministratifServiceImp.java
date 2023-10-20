package com.example.backend.service;

import java.util.Optional;
import java.util.List;

import com.example.backend.Repository.CadreRepository;
import com.example.backend.entity.CadreAdministratif;

public class CadreAdministratifServiceImp implements CadreAdministatifService{
    private CadreRepository cadreRepository;

    @Override
    public List<CadreAdministratif> getAllSCadreAdministatif() {

            return (List<CadreAdministratif>)cadreRepository.findAll();
    }

    @Override
    public CadreAdministratif getCadreAdministatifById(Long cadreId) {
        Optional<CadreAdministratif> optionalCadre = cadreRepository.findById(cadreId);
        return optionalCadre.get();
    }

    @Override
    public CadreAdministratif updateCadreAdministatif(CadreAdministratif cadre) {
        CadreAdministratif c = cadreRepository.findById(cadre.getId()).get();
        c.setNom(cadre.getNom());
        c.setPrenom(cadre.getPrenom());
        c.setDatedenaissance(cadre.getDatedenaissance());
        c.setAdr(cadre.getAdr());
        c.setVille(cadre.getVille());
        CadreAdministratif updatedcadre = cadreRepository.save(c);
        return updatedcadre;
    }

    @Override
    public void deleteCadreAdministratif(Long cadreId) {
        cadreRepository.deleteById(cadreId);
    }
    
}