package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "farcronicosnew", schema = "historialambulatorio")
public class FarCronicosNew {
    @EmbeddedId
    private FarCronicosNewPK id;

    public FarCronicosNewPK getId() {
        return id;
    }

    public void setId(FarCronicosNewPK id) {
        this.id = id;
    }
}
