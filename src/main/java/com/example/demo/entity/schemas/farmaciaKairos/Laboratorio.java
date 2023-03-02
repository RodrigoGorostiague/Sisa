package com.example.demo.entity.schemas.farmaciaKairos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "laboratorio", schema = "farmacia_kairos")
public class Laboratorio {
    @Id
    @Column(name = "codigolab")
    private Integer codigoLab;
    private String nombre;
    private String estado;

    public Integer getCodigoLab() {
        return codigoLab;
    }

    public void setCodigoLab(Integer codigoLab) {
        this.codigoLab = codigoLab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
