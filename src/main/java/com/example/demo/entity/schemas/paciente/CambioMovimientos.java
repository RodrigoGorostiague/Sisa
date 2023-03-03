package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cambiomovimientos", schema = "paciente")
public class CambioMovimientos {
    @EmbeddedId
    private CambioMovimientosPK id;
    @Column(name = "usuariocambio")
    private String usuarioCambio;

    public CambioMovimientosPK getId() {
        return id;
    }

    public void setId(CambioMovimientosPK id) {
        this.id = id;
    }

    public String getUsuarioCambio() {
        return usuarioCambio;
    }

    public void setUsuarioCambio(String usuarioCambio) {
        this.usuarioCambio = usuarioCambio;
    }
}
