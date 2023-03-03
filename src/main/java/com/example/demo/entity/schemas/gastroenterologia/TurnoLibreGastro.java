package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "gastroenterologia", name = "turnolibregastro")
public class TurnoLibreGastro {
    @EmbeddedId
    private TurnoLibreGastroPK id;

    public TurnoLibreGastroPK getId() {
        return id;
    }

    public void setId(TurnoLibreGastroPK id) {
        this.id = id;
    }
}
