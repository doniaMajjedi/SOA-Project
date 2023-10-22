package com.example.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.CadreAdministratif;

@Repository
public interface CadreRepository extends JpaRepository<CadreAdministratif, Long>{
    
}