package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "informacionimportante", schema = "historialambulatorio")
public class InformacionImportante {
    @EmbeddedId
    private InformacionImportantePK id;
    private  String infimportante;

    public InformacionImportantePK getId() {
        return id;
    }

    public void setId(InformacionImportantePK id) {
        this.id = id;
    }

    public String getInfimportante() {
        return infimportante;
    }

    public void setInfimportante(String infimportante) {
        this.infimportante = infimportante;
    }
}
