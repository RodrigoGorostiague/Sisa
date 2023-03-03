package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mapeovacunas_nomivac", schema = "vacunacion")
public class MapeoVacunasNomivac {
    @EmbeddedId
    private MapeoVacunasNomivacPK id;
    @Column(name = "codigodosis_sisa")
    private String codigoDosisSisa;

    public MapeoVacunasNomivacPK getId() {
        return id;
    }

    public void setId(MapeoVacunasNomivacPK id) {
        this.id = id;
    }

    public String getCodigoDosisSisa() {
        return codigoDosisSisa;
    }

    public void setCodigoDosisSisa(String codigoDosisSisa) {
        this.codigoDosisSisa = codigoDosisSisa;
    }
}
