package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class Especialidad21PK implements Serializable {
    @Column(name = "numerovigencia")
    private Integer numeroVigencia;
    private Date fecha;
    @Column(name = "codigooms")
    private Integer codigoOms;
    @Column(name = "tipoconsulta")
    private String tipoConsulta;

    public Integer getNumeroVigencia() {
        return numeroVigencia;
    }

    public void setNumeroVigencia(Integer numeroVigencia) {
        this.numeroVigencia = numeroVigencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCodigoOms() {
        return codigoOms;
    }

    public void setCodigoOms(Integer codigoOms) {
        this.codigoOms = codigoOms;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
}
