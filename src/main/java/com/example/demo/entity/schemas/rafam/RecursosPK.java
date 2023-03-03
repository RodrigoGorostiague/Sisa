package com.example.demo.entity.schemas.rafam;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RecursosPK implements Serializable {
    @Column(name = "anio_presup")
    private Integer anioPresup;
    private Integer tipo;
    private Integer clase;
    private Integer concepto;
    private Integer subconcepto;

    public Integer getAnioPresup() {
        return anioPresup;
    }

    public void setAnioPresup(Integer anioPresup) {
        this.anioPresup = anioPresup;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getClase() {
        return clase;
    }

    public void setClase(Integer clase) {
        this.clase = clase;
    }

    public Integer getConcepto() {
        return concepto;
    }

    public void setConcepto(Integer concepto) {
        this.concepto = concepto;
    }

    public Integer getSubconcepto() {
        return subconcepto;
    }

    public void setSubconcepto(Integer subconcepto) {
        this.subconcepto = subconcepto;
    }
}
