package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidoimagenescabecera", schema = "internacion")
public class PedidoImagenesCabeceraInter {
    @EmbeddedId
    private PedidoImagenesCabeceraInterPK id;
    private String observaciones;

    public PedidoImagenesCabeceraInterPK getId() {
        return id;
    }

    public void setId(PedidoImagenesCabeceraInterPK id) {
        this.id = id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
