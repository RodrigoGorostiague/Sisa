package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "practicasinforme", schema = "radiologia")
public class PracticasInforme {
    @EmbeddedId
    private PracticasInformePK id;
    private String observaciones;
    @Column(name = "enviado_dr")
    private LocalDateTime enviadoDr;
    @Column(name = "enviado_cr")
    private LocalDateTime enviadoCr;

    public PracticasInformePK getId() {
        return id;
    }

    public void setId(PracticasInformePK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDateTime getEnviadoDr() {
        return enviadoDr;
    }

    public void setEnviadoDr(LocalDateTime enviadoDr) {
        this.enviadoDr = enviadoDr;
    }

    public LocalDateTime getEnviadoCr() {
        return enviadoCr;
    }

    public void setEnviadoCr(LocalDateTime enviadoCr) {
        this.enviadoCr = enviadoCr;
    }
}
