package com.example.demo.entity.schemas.historico;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class CoberturaArtHistoricoPK implements Serializable {
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "codigoart")
    private Integer codigoArt;
    @Column(name = "fechaoperacion")
    private LocalDateTime fechaOperacion;
    private String operacion;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getCodigoArt() {
        return codigoArt;
    }

    public void setCodigoArt(Integer codigoArt) {
        this.codigoArt = codigoArt;
    }

    public LocalDateTime getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(LocalDateTime fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
