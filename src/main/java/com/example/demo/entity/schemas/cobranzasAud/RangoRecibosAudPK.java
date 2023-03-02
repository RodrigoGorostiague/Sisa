package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class RangoRecibosAudPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    private String usuario;
    private Integer anio;
    private String sucursal;
    @Column(name = "n_comprob_desde")
    private Integer NComprobDesde;
    @Column(name = "n_comprob_hasta")
    private Integer NComprobHasta;

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

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getNComprobDesde() {
        return NComprobDesde;
    }

    public void setNComprobDesde(Integer NComprobDesde) {
        this.NComprobDesde = NComprobDesde;
    }

    public Integer getNComprobHasta() {
        return NComprobHasta;
    }

    public void setNComprobHasta(Integer NComprobHasta) {
        this.NComprobHasta = NComprobHasta;
    }
}
