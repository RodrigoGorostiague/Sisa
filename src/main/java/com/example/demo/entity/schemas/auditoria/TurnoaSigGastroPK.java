package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class TurnoaSigGastroPK implements Serializable {
    private LocalDateTime fecha;
    @Column(name = "fechaturno")
    private Date fechaTurno;
    @Column(name = "horaconsultorio")
    private LocalDateTime horaConsultorio;
    private String profesional;
    @Column(name = "nroturno")
    private Integer nroTurno;
    private String usuario;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public LocalDateTime getHoraConsultorio() {
        return horaConsultorio;
    }

    public void setHoraConsultorio(LocalDateTime horaConsultorio) {
        this.horaConsultorio = horaConsultorio;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public Integer getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(Integer nroTurno) {
        this.nroTurno = nroTurno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
