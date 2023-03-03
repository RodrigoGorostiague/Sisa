package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class EpicrisisPaseCabeceraPK implements Serializable {
    @Column(name = "numerointernacion")
    private Integer numeroInternacion;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "tipoMov")
    private String tipomov;

    public Integer getNumeroInternacion() {
        return numeroInternacion;
    }

    public void setNumeroInternacion(Integer numeroInternacion) {
        this.numeroInternacion = numeroInternacion;
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

    public String getTipomov() {
        return tipomov;
    }

    public void setTipomov(String tipomov) {
        this.tipomov = tipomov;
    }
}
