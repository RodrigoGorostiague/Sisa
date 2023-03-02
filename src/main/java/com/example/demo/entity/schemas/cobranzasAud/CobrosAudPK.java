package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class CobrosAudPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    private String usuario;
    @Column(name = "nrocobro")
    private Integer nroCobro;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getNroCobro() {
        return nroCobro;
    }

    public void setNroCobro(Integer nroCobro) {
        this.nroCobro = nroCobro;
    }
}
