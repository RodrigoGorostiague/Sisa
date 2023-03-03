package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ProtesisIntervencionPK {
    private Date fecha;
    @Column(name = "uniatquirofano")
    private String uniatQuirofano;
    private LocalDateTime hora;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Integer protesis;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUniatQuirofano() {
        return uniatQuirofano;
    }

    public void setUniatQuirofano(String uniatQuirofano) {
        this.uniatQuirofano = uniatQuirofano;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getProtesis() {
        return protesis;
    }

    public void setProtesis(Integer protesis) {
        this.protesis = protesis;
    }
}
