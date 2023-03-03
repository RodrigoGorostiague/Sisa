package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class PracticaTurnoaSigGastroPK implements Serializable {
    private Date fecha;
    @Column(name = "horaconsultorio")
    private LocalDateTime horaConsultorio;
    private String profesional;
    @Column(name = "nroturno")
    private Integer nroTurno;
    @Column(name = "codigopractica")
    private String codigoPractica;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }
}
