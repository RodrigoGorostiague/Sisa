package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambulatorio", name = "imcsobrepeso2a15anios")
public class ImcSobrepeso2a15anios {
    @EmbeddedId
    private ImcSobrepeso2a15aniosPK id;
    @Column(name = "imcmas")
    private Integer imcMas;
    @Column(name = "imcfem")
    private Integer imcFem;

    public ImcSobrepeso2a15aniosPK getId() {
        return id;
    }

    public void setId(ImcSobrepeso2a15aniosPK id) {
        this.id = id;
    }

    public Integer getImcMas() {
        return imcMas;
    }

    public void setImcMas(Integer imcMas) {
        this.imcMas = imcMas;
    }

    public Integer getImcFem() {
        return imcFem;
    }

    public void setImcFem(Integer imcFem) {
        this.imcFem = imcFem;
    }
}
