package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class EnvioVacunaPK implements Serializable {
    @Column(name = "fechaoperacion")
    private LocalDateTime fechaOperacion;
    private String usuario;
    @Column(name = "fechaemision")
    private Date fechaEmision;
    @Column(name = "horaemision")
    private LocalDateTime horaEmision;
    @Column(name = "codigouniat")
    private String codigoUniat;

    public LocalDateTime getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(LocalDateTime fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDateTime getHoraEmision() {
        return horaEmision;
    }

    public void setHoraEmision(LocalDateTime horaEmision) {
        this.horaEmision = horaEmision;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }
}
