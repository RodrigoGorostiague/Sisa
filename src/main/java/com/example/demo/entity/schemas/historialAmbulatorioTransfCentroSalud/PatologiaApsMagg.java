package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio_transf_csalud", name = "patologiaapsmagg")
public class PatologiaApsMagg {
    @EmbeddedId
    private PatologiaApsMaggPK id;
    @Column(name = "nombrepatologia")
    private String nombrePatologia;

    public PatologiaApsMaggPK getId() {
        return id;
    }

    public void setId(PatologiaApsMaggPK id) {
        this.id = id;
    }

    public String getNombrePatologia() {
        return nombrePatologia;
    }

    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }
}
