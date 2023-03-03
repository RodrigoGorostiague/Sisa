package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio_transf_csalud", name = "patologiaapssany")
public class PatologiaApsSany {
    @EmbeddedId
    private PatologiaApsSanyPK id;
    @Column(name = "nombrepatologia")
    private String nombrePatologia;

    public PatologiaApsSanyPK getId() {
        return id;
    }

    public void setId(PatologiaApsSanyPK id) {
        this.id = id;
    }

    public String getNombrePatologia() {
        return nombrePatologia;
    }

    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }
}
