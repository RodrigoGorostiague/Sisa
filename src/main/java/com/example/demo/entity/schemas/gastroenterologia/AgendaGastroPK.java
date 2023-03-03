package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class AgendaGastroPK implements Serializable {
    private String profesional;
    @Column(name = "diasemana")
    private Integer diaSemana;
    @Column(name = "horacomienzo")
    private LocalDateTime horaComienzo;
    @Column(name = "fechainiciovigencia")
    private Date fechaInicioVigencia;

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public Integer getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(Integer diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalDateTime getHoraComienzo() {
        return horaComienzo;
    }

    public void setHoraComienzo(LocalDateTime horaComienzo) {
        this.horaComienzo = horaComienzo;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }
}
