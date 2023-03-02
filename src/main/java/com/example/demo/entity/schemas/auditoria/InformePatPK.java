package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class InformePatPK implements Serializable {
    private LocalDateTime fecha;
    private String usuario;
    @Column(name = "idpaciente")
    private String idPacinte;
    @Column(name = "nroinforme")
    private String nroInforme;
    private String estudio;

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

    public String getIdPacinte() {
        return idPacinte;
    }

    public void setIdPacinte(String idPacinte) {
        this.idPacinte = idPacinte;
    }

    public String getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(String nroInforme) {
        this.nroInforme = nroInforme;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
