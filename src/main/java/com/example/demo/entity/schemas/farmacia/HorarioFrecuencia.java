package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "HorarioFrecuencia", schema = "farmacia")
public class HorarioFrecuencia {
    @EmbeddedId
    private HorarioFrecuenciaPK id;
    private Integer orden;

    public HorarioFrecuenciaPK getId() {
        return id;
    }

    public void setId(HorarioFrecuenciaPK id) {
        this.id = id;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
