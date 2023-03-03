package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "indfarmproblema", schema = "historialambulatorio")
public class IndFarmProblema {
    @EmbeddedId
    private IndFarmProblemaPK id;

    public IndFarmProblemaPK getId() {
        return id;
    }

    public void setId(IndFarmProblemaPK id) {
        this.id = id;
    }
}
