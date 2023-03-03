package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class RecienNacidoAudPK implements Serializable {
    @Column(name = "fechaoperacion")
    private LocalDateTime fechaOperacion;
    private String usuario;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechaingresoplanilla")
    private Date fechaIngresoPlanilla;
    @Column(name = "idpacientern")
    private Integer idPacienteRn;

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

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaIngresoPlanilla() {
        return fechaIngresoPlanilla;
    }

    public void setFechaIngresoPlanilla(Date fechaIngresoPlanilla) {
        this.fechaIngresoPlanilla = fechaIngresoPlanilla;
    }

    public Integer getIdPacienteRn() {
        return idPacienteRn;
    }

    public void setIdPacienteRn(Integer idPacienteRn) {
        this.idPacienteRn = idPacienteRn;
    }
}
