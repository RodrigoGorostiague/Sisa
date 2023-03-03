package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "ingresoquirofano", schema = "quirofano")
public class IngresoQuirofano {
    @EmbeddedId
    private IngresoQuirofanoPK id;
    @Column(name = "codigopersonal_cirujano")
    private String codigoPersonalCirujano;
    @Column(name = "suspension_fecha")
    private LocalDateTime suspensionFecha;
    @Column(name = "suspension_motivo")
    private String suspensionMotivo;

    public IngresoQuirofanoPK getId() {
        return id;
    }

    public void setId(IngresoQuirofanoPK id) {
        this.id = id;
    }

    public String getCodigoPersonalCirujano() {
        return codigoPersonalCirujano;
    }

    public void setCodigoPersonalCirujano(String codigoPersonalCirujano) {
        this.codigoPersonalCirujano = codigoPersonalCirujano;
    }

    public LocalDateTime getSuspensionFecha() {
        return suspensionFecha;
    }

    public void setSuspensionFecha(LocalDateTime suspensionFecha) {
        this.suspensionFecha = suspensionFecha;
    }

    public String getSuspensionMotivo() {
        return suspensionMotivo;
    }

    public void setSuspensionMotivo(String suspensionMotivo) {
        this.suspensionMotivo = suspensionMotivo;
    }
}
