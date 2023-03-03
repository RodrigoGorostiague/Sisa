package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RehabilitacionPK implements Serializable {
    @Column(name = "codigopractica")
    private String codigoPractica;
    private Integer profesion;

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public Integer getProfesion() {
        return profesion;
    }

    public void setProfesion(Integer profesion) {
        this.profesion = profesion;
    }
}
