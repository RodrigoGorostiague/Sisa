package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladortiss28", schema = "historialuti")
public class NomencladorTiss28 {
    @Id
    @Column(name = "codigoint")
    private Integer codigoInt;
    private String decripcion;
    private Integer puntos;
    private Integer item;

    public Integer getCodigoInt() {
        return codigoInt;
    }

    public void setCodigoInt(Integer codigoInt) {
        this.codigoInt = codigoInt;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}
