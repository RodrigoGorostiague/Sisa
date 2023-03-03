package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "agrupetarioestadistica", schema = "vacunacion")
public class AgrupEtarioEstadistica {
    @EmbeddedId
    private AgrupEtarioEstadisticaPK id;
    private String descripcion;

    public AgrupEtarioEstadisticaPK getId() {
        return id;
    }

    public void setId(AgrupEtarioEstadisticaPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
