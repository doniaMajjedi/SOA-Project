package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.CadreAdministratif;

public interface CadreAdministatifService {
    CadreAdministratif createCadre(CadreAdministratif cadreAdministratif);


    List<CadreAdministratif> getAllSCadreAdministatif();

     CadreAdministratif getCadreAdministatifById(Long cadreAdministratifId);

     CadreAdministratif updateCadreAdministatif(Long id,CadreAdministratif cadreAdministratif);

    void deleteCadreAdministratif(Long cadreAdministratifId);
    
}