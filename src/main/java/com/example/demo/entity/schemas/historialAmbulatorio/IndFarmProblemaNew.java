package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "indfarmproblemanew", schema = "historialambulatorio")
public class IndFarmProblemaNew {
    @EmbeddedId
    private IndFarmProblemaNewPK id;

    public IndFarmProblemaNewPK getId() {
        return id;
    }

    public void setId(IndFarmProblemaNewPK id) {
        this.id = id;
    }
}
