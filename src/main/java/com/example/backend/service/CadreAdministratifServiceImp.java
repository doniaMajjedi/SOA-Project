package com.example.backend.service;

import java.util.Optional;
import java.util.List;

import com.example.backend.Repository.CadreRepository;
import com.example.backend.entity.CadreAdministratif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadreAdministratifServiceImp implements CadreAdministatifService{
    @Autowired
    private CadreRepository cadreRepository;

    @Override
    public CadreAdministratif createCadre(CadreAdministratif cadreAdministratif) {
        return cadreRepository.save(cadreAdministratif);
    }

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
    public CadreAdministratif updateCadreAdministatif(Long id,CadreAdministratif cadre) {
        Optional<CadreAdministratif> oc = cadreRepository.findById(id);
        if(oc.isPresent()) {
            CadreAdministratif c=oc.get();
            c.setId(id);
            c.setNom(cadre.getNom());
            c.setPrenom(cadre.getPrenom());
            c.setDatedenaissance(cadre.getDatedenaissance());
            c.setAdr(cadre.getAdr());
            c.setVille(cadre.getVille());
            c.setPoste(cadre.getPoste());
            c.setSalaire(cadre.getSalaire());
            CadreAdministratif updatedcadre = cadreRepository.save(c);
            return updatedcadre;
        }
        return null;
    }

    @Override
    public void deleteCadreAdministratif(Long cadreId) {
        cadreRepository.deleteById(cadreId);
    }
    
}