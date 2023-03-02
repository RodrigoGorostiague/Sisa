package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class RecepcionVacunaPK implements Serializable {
    @Column(name = "fechaoperacion")
    private LocalDateTime fechaOperacion;
    private String usuario;
    @Column(name = "fechaemision")
    private Date fechaEmision;
    @Column(name = "horaemision")
    private LocalDateTime horaEmision;
    @Column(name = "codigoinstitucion")
    private  String codigoInstitucion;

    public LocalDateTime getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(LocalDateTime fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

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
