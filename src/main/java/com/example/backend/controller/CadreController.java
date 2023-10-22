package com.example.backend.controller;


import java.util.List;

import com.example.backend.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.backend.entity.CadreAdministratif;
import com.example.backend.service.CadreAdministatifService;

@RestController
@RequestMapping("/cadres")
public class CadreController {
    @Autowired

    private CadreAdministatifService cadreService;

    @PostMapping()
    public ResponseEntity<CadreAdministratif> createCadre(@RequestBody CadreAdministratif cadre){

        CadreAdministratif t = cadreService.createCadre(cadre);
        return new ResponseEntity<>(t, HttpStatus.OK);
    }

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
        CadreAdministratif updated = cadreService.updateCadreAdministatif(cadreId,cadre);
        return new ResponseEntity<>(updated, HttpStatus.OK);
    }

    // Build Delete User REST API
   // Delete operation
   @DeleteMapping("/{id}")
   public String deleteCadreAdministratif(@PathVariable("id")Long cadreId)
   {
       cadreService.deleteCadreAdministratif(cadreId);
       return "Deleted Successfully";
   }

}
