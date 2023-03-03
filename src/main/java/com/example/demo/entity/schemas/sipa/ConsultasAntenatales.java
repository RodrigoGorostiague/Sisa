package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultasantenatales", schema = "sipa")
public class ConsultasAntenatales {
    @EmbeddedId
    private ConsultasAntenatalesPK id;
    @Column(name = "edadgestacional")
    private Integer edadGestacional;
    private Double peso;
    private Integer pa1;
    private Integer pa2;
    @Column(name = "alturauterina")
    private Integer alturaUterina;
    private Integer proxcitames;
    @Column(name = "codigouniat")
    private String codigoUniat;

    public ConsultasAntenatalesPK getId() {
        return id;
    }

    public void setId(ConsultasAntenatalesPK id) {
        this.id = id;
    }

    public Integer getEdadGestacional() {
        return edadGestacional;
    }

    public void setEdadGestacional(Integer edadGestacional) {
        this.edadGestacional = edadGestacional;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getPa1() {
        return pa1;
    }

    public void setPa1(Integer pa1) {
        this.pa1 = pa1;
    }

    public Integer getPa2() {
        return pa2;
    }

    public void setPa2(Integer pa2) {
        this.pa2 = pa2;
    }

    public Integer getAlturaUterina() {
        return alturaUterina;
    }

    public void setAlturaUterina(Integer alturaUterina) {
        this.alturaUterina = alturaUterina;
    }

    public Integer getProxcitames() {
        return proxcitames;
    }

    public void setProxcitames(Integer proxcitames) {
        this.proxcitames = proxcitames;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }
}
