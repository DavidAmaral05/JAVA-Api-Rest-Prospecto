package com.restProspecto.controller;

import com.restProspecto.entity.Prospecto;
import com.restProspecto.service.prospectoService;
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
@RequestMapping("/prospectos")
public class prospectoController {
    
    @Autowired
    private prospectoService prospectoservice;
    
    @GetMapping
    public List<Prospecto> listar(){
        return prospectoservice.listar();
    }
    
    @PostMapping
    public Prospecto insertar(@RequestBody Prospecto pros){
        return prospectoservice.insertar(pros);
    }
    
    @PutMapping
    public Prospecto actualizar(@RequestBody Prospecto pros){
        return prospectoservice.actualizar(pros);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Prospecto pros){
        prospectoservice.eliminar(pros);
    }
    
}
