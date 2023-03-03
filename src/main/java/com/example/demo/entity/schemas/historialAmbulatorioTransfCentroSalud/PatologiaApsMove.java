package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio_transf_csalud", name = "patologiaapsmove")
public class PatologiaApsMove {
    @EmbeddedId
    private PatologiaApsMovePK id;
    @Column(name = "nombrepatologia")
    private String nombrePatologia;

    public PatologiaApsMovePK getId() {
        return id;
    }

    public void setId(PatologiaApsMovePK id) {
        this.id = id;
    }

    public String getNombrePatologia() {
        return nombrePatologia;
    }

    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }
}
