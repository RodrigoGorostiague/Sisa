package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class HistoriaClinicaAudPK implements Serializable {
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "historiaClinica")
    private Integer historiaClinica;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public Integer getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(Integer historiaClinica) {
        this.historiaClinica = historiaClinica;
    }
}
