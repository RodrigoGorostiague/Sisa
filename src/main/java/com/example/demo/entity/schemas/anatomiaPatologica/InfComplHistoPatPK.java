package com.example.demo.entity.schemas.anatomiaPatologica;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class InfComplHistoPatPK implements Serializable {
    @Column(name = "nroinforme")
    private Integer nroInforme;
    private Date fecha;

    public Integer getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(Integer nroInforme) {
        this.nroInforme = nroInforme;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
