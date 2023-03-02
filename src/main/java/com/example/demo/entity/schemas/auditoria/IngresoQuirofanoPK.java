package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class IngresoQuirofanoPK implements Serializable {
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechaing")
    private Date fechaIng;
    @Column(name = "horaing")
    private LocalDateTime horaIng;
    @Column(name = "fechaoperacion")
    private LocalDateTime fechaOperacion;
    private String usuario;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }

    public LocalDateTime getHoraIng() {
        return horaIng;
    }

    public void setHoraIng(LocalDateTime horaIng) {
        this.horaIng = horaIng;
    }

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
}
