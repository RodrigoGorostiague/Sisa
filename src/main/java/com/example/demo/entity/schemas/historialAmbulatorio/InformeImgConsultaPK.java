package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class InformeImgConsultaPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")
    private ConsultaTurno consultaTurno;
    private String sector;
    @Column(name = "nroinfrme")
    private Integer nroInforme;

    public ConsultaTurno getConsultaTurno() {
        return consultaTurno;
    }

    public void setConsultaTurno(ConsultaTurno consultaTurno) {
        this.consultaTurno = consultaTurno;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(Integer nroInforme) {
        this.nroInforme = nroInforme;
    }
}
