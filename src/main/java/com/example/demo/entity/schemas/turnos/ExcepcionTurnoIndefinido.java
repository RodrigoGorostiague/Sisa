package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "excepcionturnoindefinido", schema = "turnos")
public class ExcepcionTurnoIndefinido {
    @EmbeddedId
    private ExcepcionTurnoIndefinidoPK id;
    private String motivo;

    public ExcepcionTurnoIndefinidoPK getId() {
        return id;
    }

    public void setId(ExcepcionTurnoIndefinidoPK id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
