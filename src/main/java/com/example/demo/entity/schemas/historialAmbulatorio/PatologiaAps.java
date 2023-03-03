package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio", name = "patologiaaps")
public class PatologiaAps {
    @EmbeddedId
    private PatologiaApsPK id;
    @Column(name = "nombrepatologia")
    private String nombrePatologia;

    public String getNombrePatologia() {
        return nombrePatologia;
    }

    public void setNombrePatologia(String nombrePatologia) {
        this.nombrePatologia = nombrePatologia;
    }

    public PatologiaApsPK getId() {
        return id;
    }

    public void setId(PatologiaApsPK id) {
        this.id = id;
    }
}
