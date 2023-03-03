package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "acumuladoestadisticoaux", schema = "internacion")
public class AcumuladoEstadisticoAux {
    @EmbeddedId
    private AcumuladoEstadisticoAuxPK id;
    private Integer cantidad;
    @Column(name = "codigooms")
    private String codigoOms;

    public AcumuladoEstadisticoAuxPK getId() {
        return id;
    }

    public void setId(AcumuladoEstadisticoAuxPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigoOms() {
        return codigoOms;
    }

    public void setCodigoOms(String codigoOms) {
        this.codigoOms = codigoOms;
    }
}
