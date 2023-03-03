package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidoimagenesuti", schema = "historialuti")
public class PedidoImagenesUti {
    @EmbeddedId
    private PedidoImagenesUtiPK id;
    private String motivo;

    public PedidoImagenesUtiPK getId() {
        return id;
    }

    public void setId(PedidoImagenesUtiPK id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}

