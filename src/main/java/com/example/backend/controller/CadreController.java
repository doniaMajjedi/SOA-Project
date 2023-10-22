package com.example.backend.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.CadreAdministratif;
import com.example.backend.service.CadreAdministatifService;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class CadreController {

    private CadreAdministatifService cadreService;

    // build get user by id REST API
    @GetMapping("{id}")
    public ResponseEntity<CadreAdministratif> getCadreAdministatifById(@PathVariable("id") Long cadreId){
        
        CadreAdministratif cadres = cadreService.getCadreAdministatifById(cadreId);
        return new ResponseEntity<>(cadres, HttpStatus.OK);
    }

    // Build Get All Users REST API
    @GetMapping
    public ResponseEntity<List<CadreAdministratif>> getAllSCadreAdministatif(){

        List<CadreAdministratif> cadres = cadreService.getAllSCadreAdministatif();
        return new ResponseEntity<>(cadres, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("{id}")
    public ResponseEntity<CadreAdministratif> updateCadreAdministatif(@PathVariable("id") Long cadreId,@RequestBody CadreAdministratif cadre){
        CadreAdministratif updated = cadreService.updateCadreAdministatif(cadre);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    // Build Delete User REST API
   // Delete operation
   @DeleteMapping("/departments/{id}")
   public String deleteCadreAdministratif(@PathVariable("id")Long cadreId)
   {
       cadreService.deleteCadreAdministratif(cadreId);
       return "Deleted Successfully";
   }

}
