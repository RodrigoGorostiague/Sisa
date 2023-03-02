package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "domicilio", name = "plannacerzonifbelen")
public class PlanNacerZonIfBelen {
    @EmbeddedId
    private PlanNacerZonIfBelenPK id;
    @Column(name = "codigozona")
    private String codigoZona;

    public PlanNacerZonIfBelenPK getId() {
        return id;
    }

    public void setId(PlanNacerZonIfBelenPK id) {
        this.id = id;
    }

    public String getCodigoZona() {
        return codigoZona;
    }

    public void setCodigoZona(String codigoZona) {
        this.codigoZona = codigoZona;
    }
}
