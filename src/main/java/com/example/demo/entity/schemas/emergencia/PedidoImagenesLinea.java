package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidoimageneslinea", schema = "emergencia")
public class PedidoImagenesLinea {
    @EmbeddedId
    private PedidoImagenesLineaPK id;
    private String sector;
    private Integer nroInforme;

    public PedidoImagenesLineaPK getId() {
        return id;
    }

    public void setId(PedidoImagenesLineaPK id) {
        this.id = id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(Integer nroInforme) {
        this.nroInforme = nroInforme;
    }
}
