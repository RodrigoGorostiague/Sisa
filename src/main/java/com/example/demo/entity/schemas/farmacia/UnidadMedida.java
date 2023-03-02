package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unidadmedida", schema = "farmacia")
public class UnidadMedida {
    @Id
    @Column(name = "codigounimed")
    private String codigoUniMed;
    private String descripcion;
    private String simbolo;

    public String getCodigoUniMed() {
        return codigoUniMed;
    }

    public void setCodigoUniMed(String codigoUniMed) {
        this.codigoUniMed = codigoUniMed;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
