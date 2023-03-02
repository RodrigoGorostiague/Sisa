package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class UltimoAccesoPK implements Serializable {
    private String usuario;
    @Column(name = "fecha_ult_acceso")
    private LocalDateTime fechaUltimoAcceso;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaUltimoAcceso() {
        return fechaUltimoAcceso;
    }

    public void setFechaUltimoAcceso(LocalDateTime fechaUltimoAcceso) {
        this.fechaUltimoAcceso = fechaUltimoAcceso;
    }
}
