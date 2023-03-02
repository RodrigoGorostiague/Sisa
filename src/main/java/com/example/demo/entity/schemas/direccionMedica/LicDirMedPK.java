package com.example.demo.entity.schemas.direccionMedica;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class LicDirMedPK implements Serializable {
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "fechainicio")
    private Date fechaInicio;
    @Column(name = "fechafinalizacion")
    private Date fechaFinalizacion;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }
}
