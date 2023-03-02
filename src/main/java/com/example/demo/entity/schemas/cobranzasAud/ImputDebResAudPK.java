package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ImputDebResAudPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    private String usuario;
    private Date fecha;
    private String sucursal;
    private Integer resumen;
    @Column(name = "amb_int")
    private String ambInt;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getResumen() {
        return resumen;
    }

    public void setResumen(Integer resumen) {
        this.resumen = resumen;
    }

    public String getAmbInt() {
        return ambInt;
    }

    public void setAmbInt(String ambInt) {
        this.ambInt = ambInt;
    }
}
