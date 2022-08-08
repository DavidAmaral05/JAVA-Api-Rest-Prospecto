package com.restProspecto.repo;

import com.restProspecto.entity.Prospecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface prospectoRepo extends JpaRepository<Prospecto, Integer>{
    
}
