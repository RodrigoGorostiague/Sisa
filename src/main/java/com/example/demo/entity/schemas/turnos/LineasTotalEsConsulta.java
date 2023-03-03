package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "lineastotalesconsulta", schema = "turnos")
public class LineasTotalEsConsulta {
    @EmbeddedId
    private LineasTotalEsConsultaPK id;
    private Integer cantidad;

    public LineasTotalEsConsultaPK getId() {
        return id;
    }

    public void setId(LineasTotalEsConsultaPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
