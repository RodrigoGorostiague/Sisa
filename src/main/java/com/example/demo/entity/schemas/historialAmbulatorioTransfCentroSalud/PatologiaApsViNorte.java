package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio_transf_csalud", name = "patologiaapsvinorte")
public class PatologiaApsViNorte {
    @EmbeddedId
    private PatologiaApsViNortePK id;
    @Column(name = "nombrepatologia")
    private String nombrePatologia;

    public PatologiaApsViNortePK getId() {
        return id;
    }

    public void setId(PatologiaApsViNortePK id) {
        this.id = id;
    }

    public String getNombrePatologia() {
        return nombrePatologia;
    }

    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }
}
