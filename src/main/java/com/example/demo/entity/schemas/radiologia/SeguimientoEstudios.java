package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "seguimientoestudios", schema = "radiologia")
public class SeguimientoEstudios {
    @EmbeddedId
    private SeguimientoEstudiosPK id;
    private String origen;
    private String destino;
    private String observaciones;
    private String responsable;

    public SeguimientoEstudiosPK getId() {
        return id;
    }

    public void setId(SeguimientoEstudiosPK id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
