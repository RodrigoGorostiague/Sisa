package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Embeddable
public class TurnoAsignadoPK implements Serializable {
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
