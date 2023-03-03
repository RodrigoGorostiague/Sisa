package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Embeddable
public class EvolucionRehabUtiPK implements Serializable{
    @Column(name = "nrouti")
    private Integer nroUti;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "codigopersonal")
    private String codigoPersonal;

    public Integer getNroUti() {
        return nroUti;
    }

    public void setNroUti(Integer nroUti) {
        this.nroUti = nroUti;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }
}
