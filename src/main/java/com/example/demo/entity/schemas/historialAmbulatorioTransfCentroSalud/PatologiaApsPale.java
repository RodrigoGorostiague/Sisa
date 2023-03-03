package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio_transf_csalud")
public class PatologiaApsPale {
    @EmbeddedId
    private PatologiaApsPalePK id;
    @Column(name = "nombrepatologia")
    private String nombrePatologia;

    public PatologiaApsPalePK getId() {
        return id;
    }

    public void setId(PatologiaApsPalePK id) {
        this.id = id;
    }

    public String getNombrePatologia() {
        return nombrePatologia;
    }

    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }
}
