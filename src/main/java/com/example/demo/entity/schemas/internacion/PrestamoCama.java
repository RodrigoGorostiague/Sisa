package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestamocama", schema = "internacion")
public class PrestamoCama {
    @EmbeddedId
    private PrestamoCamaPK id;
    private Integer Servicio;
    private Integer origen;

    public PrestamoCamaPK getId() {
        return id;
    }

    public void setId(PrestamoCamaPK id) {
        this.id = id;
    }

    public Integer getServicio() {
        return Servicio;
    }

    public void setServicio(Integer servicio) {
        Servicio = servicio;
    }

    public Integer getOrigen() {
        return origen;
    }

    public void setOrigen(Integer origen) {
        this.origen = origen;
    }
}
