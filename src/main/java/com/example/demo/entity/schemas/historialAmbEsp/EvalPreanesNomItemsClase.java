package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambesp", name = "evalpreanes_nom_itemsclase")
public class EvalPreanesNomItemsClase {
    @Id
    private Integer codigoItcla;
    private String descripcion;
    private Integer puntos;
    private Integer fila;
    private Integer col;
    @Column(name = "desctipo")
    private String descTipo;

    public Integer getCodigoItcla() {
        return codigoItcla;
    }

    public void setCodigoItcla(Integer codigoItcla) {
        this.codigoItcla = codigoItcla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public String getDescTipo() {
        return descTipo;
    }

    public void setDescTipo(String descTipo) {
        this.descTipo = descTipo;
    }
}
