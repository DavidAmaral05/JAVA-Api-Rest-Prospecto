package com.restProspecto.controller;

import com.restProspecto.entity.Documento;
import com.restProspecto.service.documentoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documentos")

public class documentoController {
        @Autowired
    private documentoService documentoservice;
    
    @GetMapping
    public List<Documento> listar(){
        return documentoservice.listar();
    }
    
    @PostMapping
    public Documento insertar(@RequestBody Documento doc){
        return documentoservice.insertar(doc);
    }
    
    @PutMapping
    public Documento actualizar(@RequestBody Documento doc){
        return documentoservice.actualizar(doc);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Documento doc){
        documentoservice.eliminar(doc);
    }
}
