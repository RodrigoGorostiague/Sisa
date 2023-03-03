package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ReservaQuirofanoPK implements Serializable {
    private Date fecha;
    private String quirofano;
    @Column(name = "idpaciente")
    private Integer idPaciente;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getQuirofano() {
        return quirofano;
    }

    public void setQuirofano(String quirofano) {
        this.quirofano = quirofano;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
