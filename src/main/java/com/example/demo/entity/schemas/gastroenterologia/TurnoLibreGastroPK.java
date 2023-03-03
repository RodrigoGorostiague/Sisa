package com.example.demo.entity.schemas.gastroenterologia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class TurnoLibreGastroPK implements Serializable {
    private String profesional;
    @Column(name = "fechaturno")
    private Date fechaTurno;
    @Column(name = "horaturno")
    private LocalDateTime horaTurno;
    @Column(name = "nroturno")
    private Integer nroTurno;

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public LocalDateTime getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(LocalDateTime horaTurno) {
        this.horaTurno = horaTurno;
    }

    public Integer getNroTurno() {
        return nroTurno;
    }

    public void setNroTurno(Integer nroTurno) {
        this.nroTurno = nroTurno;
    }
}
