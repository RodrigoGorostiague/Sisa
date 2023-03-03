package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class RecepcionBolsaSangrePK implements Serializable {
    @Column(name = "fechaemision")
    private Date fechaEmision;
    @Column(name = "horaemision")
    private LocalDateTime horaEmision;
    @Column(name = "codigoinstitucion")
    private String codigoInstitucion;

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDateTime getHoraEmision() {
        return horaEmision;
    }

    public void setHoraEmision(LocalDateTime horaEmision) {
        this.horaEmision = horaEmision;
    }

    public String getCodigoInstitucion() {
        return codigoInstitucion;
    }

    public void setCodigoInstitucion(String codigoInstitucion) {
        this.codigoInstitucion = codigoInstitucion;
    }
}
