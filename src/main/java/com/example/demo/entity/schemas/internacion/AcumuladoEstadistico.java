package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "acumuladoestadistico", schema = "infectologia")
public class AcumuladoEstadistico {
    @EmbeddedId
    private AcumuladoEstadisticoPK id;
    private Integer cantidad;

    public AcumuladoEstadisticoPK getId() {
        return id;
    }

    public void setId(AcumuladoEstadisticoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
