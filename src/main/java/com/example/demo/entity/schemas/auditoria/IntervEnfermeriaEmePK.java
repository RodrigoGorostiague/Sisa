package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class IntervEnfermeriaEmePK implements Serializable {
    @Column(name = "fechaoperacion")
    private LocalDateTime fechaOperacion;
    private String usuario;
    @Column(name = "nrocon")
    private Integer nroCon;
    private String uniat;
    @Column(name = "idpaciente")
    private Integer idPaciente;

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

    public Integer getNroCon() {
        return nroCon;
    }

    public void setNroCon(Integer nroCon) {
        this.nroCon = nroCon;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
