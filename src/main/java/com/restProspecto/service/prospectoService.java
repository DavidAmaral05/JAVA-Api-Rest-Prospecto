package com.restProspecto.service;

import com.restProspecto.entity.Prospecto;
import com.restProspecto.repo.prospectoRepo;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class prospectoService {
    
    @Autowired
    private prospectoRepo prospectorepo;
    
    public Prospecto insertar(Prospecto pros){
        return prospectorepo.save(pros);
    }
    
    public Prospecto actualizar(Prospecto pros){
        return prospectorepo.save(pros);
    }
    
    public List<Prospecto> listar(){
        return prospectorepo.findAll();
    }
    
    public void eliminar(Prospecto pros){
        prospectorepo.delete(pros);
    }
}
