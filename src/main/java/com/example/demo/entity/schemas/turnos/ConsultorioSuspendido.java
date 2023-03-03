package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultoriosuspendido", schema = "turnos")
public class ConsultorioSuspendido {
    @EmbeddedId
    private ConsultorioSuspendidoPK id;
    private String motivo;

    public ConsultorioSuspendidoPK getId() {
        return id;
    }

    public void setId(ConsultorioSuspendidoPK id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
