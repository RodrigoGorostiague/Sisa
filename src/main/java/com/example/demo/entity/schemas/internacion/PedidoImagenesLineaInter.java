package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidoimageneslinea", schema = "internacion")
public class PedidoImagenesLineaInter {
    @EmbeddedId
    private PedidoImagenesLineaInterPK id;
    private String sector;
    @Column(name = "nroinforme")
    private Integer nroInforme;

    public PedidoImagenesLineaInterPK getId() {
        return id;
    }

    public void setId(PedidoImagenesLineaInterPK id) {
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
