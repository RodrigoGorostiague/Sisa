package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio_transf_csalud", name = "patologiaapsvela")
public class PatologiaApsVela {
    @EmbeddedId
    private PatologiaApsVelaPK id;
    @Column(name = "nombrepatologia")
    private String nombrePatologia;

    public PatologiaApsVelaPK getId() {
        return id;
    }

    public void setId(PatologiaApsVelaPK id) {
        this.id = id;
    }

    public String getNombrePatologia() {
        return nombrePatologia;
    }

    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }
}
