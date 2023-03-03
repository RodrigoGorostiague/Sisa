package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class InformeGastroAudPK implements Serializable {
    private LocalDateTime fecha;
    private String usuario;
    @Column(name = "nroprotocolo")
    private Integer nroProtocolo;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getNroProtocolo() {
        return nroProtocolo;
    }

    public void setNroProtocolo(Integer nroProtocolo) {
        this.nroProtocolo = nroProtocolo;
    }
}
