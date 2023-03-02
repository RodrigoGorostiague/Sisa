package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "cierrasistema")
public class CierraSistema {
    @EmbeddedId
    private CierraSistemaPK id;
    private String observaciones;

    public CierraSistemaPK getId() {
        return id;
    }

    public void setId(CierraSistemaPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
