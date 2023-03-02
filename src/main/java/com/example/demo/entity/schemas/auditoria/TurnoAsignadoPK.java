package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class TurnoAsignadoPK implements Serializable {
    private LocalDateTime fecha;
    private String usuario;
    @Column(name = "numeroturno")
    private Integer numeroTurno;
    @Column(name = "diaturno")
    private Date diaTurno;
    @Column(name = "horaconsultorio")
    private LocalDateTime horaConsultorio;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;

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

    public Integer getNumeroTurno() {
        return numeroTurno;
    }

    public void setNumeroTurno(Integer numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

    public Date getDiaTurno() {
        return diaTurno;
    }

    public void setDiaTurno(Date diaTurno) {
        this.diaTurno = diaTurno;
    }

    public LocalDateTime getHoraConsultorio() {
        return horaConsultorio;
    }

    public void setHoraConsultorio(LocalDateTime horaConsultorio) {
        this.horaConsultorio = horaConsultorio;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }
}
