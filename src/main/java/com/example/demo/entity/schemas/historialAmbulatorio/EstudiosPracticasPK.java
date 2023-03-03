package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class EstudiosPracticasPK implements Serializable {
    @Column(name = "codigopractica")
    private String codigoPractica;
    private String clase;
    @ManyToOne
    @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")
    private ConsultaTurno consultaTurno;

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public ConsultaTurno getConsultaTurno() {
        return consultaTurno;
    }

    public void setConsultaTurno(ConsultaTurno consultaTurno) {
        this.consultaTurno = consultaTurno;
    }
}
