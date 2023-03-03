package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidoimagenes", schema = "historialinternacion")
public class PedidoImagenes {
    @EmbeddedId
    private PedidoImagenesPK id;
    private String motivo;
    private Integer servicio;
    @Column(name = "tieneinforme")
    private String tieneInforme;

    public PedidoImagenesPK getId() {
        return id;
    }

    public void setId(PedidoImagenesPK id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getServicio() {
        return servicio;
    }

    public void setServicio(Integer servicio) {
        this.servicio = servicio;
    }

    public String getTieneInforme() {
        return tieneInforme;
    }

    public void setTieneInforme(String tieneInforme) {
        this.tieneInforme = tieneInforme;
    }
}
