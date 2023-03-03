package com.example.demo.entity.schemas.organizacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity


@Table(name = "",schema = "organizacion")
public class TelefonoInterno {
    @EmbeddedId
    private TelefonoInternoPK id;
    private String area;
    private String salida;
    @Column(name = "numero_conmutador")
    private Integer numeroConmutador;

    public TelefonoInternoPK getId() {
        return id;
    }

    public void setId(TelefonoInternoPK id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public Integer getNumeroConmutador() {
        return numeroConmutador;
    }

    public void setNumeroConmutador(Integer numeroConmutador) {
        this.numeroConmutador = numeroConmutador;
    }
}
