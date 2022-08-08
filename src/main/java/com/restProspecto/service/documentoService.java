package com.restProspecto.service;

import com.restProspecto.entity.Documento;
import com.restProspecto.repo.documentoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class documentoService {
    
    @Autowired
    private documentoRepo documentorepo;
    
    public Documento insertar(Documento doc){
        return documentorepo.save(doc);
    }
    
    public Documento actualizar(Documento doc){
        return documentorepo.save(doc);
    }
    
    public List<Documento> listar(){
        return documentorepo.findAll();
    }
    
    public void eliminar(Documento doc){
        documentorepo.delete(doc);
    }
}
