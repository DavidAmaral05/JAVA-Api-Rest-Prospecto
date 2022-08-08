package com.restProspecto.repo;

import com.restProspecto.entity.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface documentoRepo extends JpaRepository<Documento, Integer>{
    
}
