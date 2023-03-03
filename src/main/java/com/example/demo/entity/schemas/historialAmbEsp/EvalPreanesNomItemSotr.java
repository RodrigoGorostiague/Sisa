package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambesp", name = "evalpreanes_nom_itemsotr")
public class EvalPreanesNomItemSotr {
    @Id
    @Column(name = "codigoitotr")
    private Integer codigoItotr;
    private String descripcion;
    private Integer orden;

    public Integer getCodigoItotr() {
        return codigoItotr;
    }

    public void setCodigoItotr(Integer codigoItotr) {
        this.codigoItotr = codigoItotr;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
