package com.example.backend.service;

import java.util.List;

import com.example.backend.entity.CadreAdministratif;

public interface CadreAdministatifService {

     List<CadreAdministratif> getAllSCadreAdministatif();

     CadreAdministratif getCadreAdministatifById(Long cadreAdministratifId);

     CadreAdministratif updateCadreAdministatif(CadreAdministratif cadreAdministratif);

    void deleteCadreAdministratif(Long cadreAdministratifId);
    
}