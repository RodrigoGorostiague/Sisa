package com.example.demo.entity.schemas.turnos;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ConsultorioSuspendidoPK implements Serializable {
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "numerodia")
    private Integer numeroDia;
    private LocalDateTime hora;
    @Column(name = "fechainicio")
    private Date fechaInicio;
    @Column(name = "fechainisuspension")
    private Date fechaIniSuspension;
    @Column(name = "fechafinsuspension")
    private Date fechaFinSuspension;

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

    public Integer getNumeroDia() {
        return numeroDia;
    }

    public void setNumeroDia(Integer numeroDia) {
        this.numeroDia = numeroDia;
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

    public Date getFechaIniSuspension() {
        return fechaIniSuspension;
    }

    public void setFechaIniSuspension(Date fechaIniSuspension) {
        this.fechaIniSuspension = fechaIniSuspension;
    }

    public Date getFechaFinSuspension() {
        return fechaFinSuspension;
    }

    public void setFechaFinSuspension(Date fechaFinSuspension) {
        this.fechaFinSuspension = fechaFinSuspension;
    }
}
