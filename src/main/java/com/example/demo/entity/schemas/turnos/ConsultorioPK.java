package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ConsultorioPK implements Serializable{
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    private Integer numerodia;
    private LocalDateTime hora;
    @Column(name = "fechainicio")
    private Date fechaInicio;

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

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public Integer getNumerodia() {
        return numerodia;
    }

    public void setNumerodia(Integer numerodia) {
        this.numerodia = numerodia;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
