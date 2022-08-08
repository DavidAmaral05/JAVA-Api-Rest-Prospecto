package com.restProspecto.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name = "Documento")

public class Documento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDdocumento;
    private String IDProspecto;
    private String Documento;

    public Integer getIDdocumento() {
        return IDdocumento;
    }

    public void setIDdocumento(Integer IDdocumento) {
        this.IDdocumento = IDdocumento;
    }

    public String getIDProspecto() {
        return IDProspecto;
    }

    public void setIDProspecto(String IDProspecto) {
        this.IDProspecto = IDProspecto;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }
            
    
}
