package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "enviovacunaencabezado", schema = "vacunacion")
public class EnvioVacunaEncabezado {
    @EmbeddedId
    private EnvioVacunaEncabezadoPK id;
    private String observacion;
    private String transferido;

    public EnvioVacunaEncabezadoPK getId() {
        return id;
    }

    public void setId(EnvioVacunaEncabezadoPK id) {
        this.id = id;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getTransferido() {
        return transferido;
    }

    public void setTransferido(String transferido) {
        this.transferido = transferido;
    }
}
