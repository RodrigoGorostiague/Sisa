package com.example.demo.entity.schemas.infectologia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.sql.Date;

@Embeddable
public class MovimientoInfectoPK implements Serializable {
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Date fcha;

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFcha() {
        return fcha;
    }

    public void setFcha(Date fcha) {
        this.fcha = fcha;
    }
}
