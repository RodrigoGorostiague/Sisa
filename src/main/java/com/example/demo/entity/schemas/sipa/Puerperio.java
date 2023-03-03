package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "puerperio", schema = "sipa")
public class Puerperio {
    @EmbeddedId
    private PuerperioPK id;
    private Double temperatura;
    private Integer pa1;
    private Integer pa2;
    private Integer pulso;
    private String involuter;
    private String loquios;

    public PuerperioPK getId() {
        return id;
    }

    public void setId(PuerperioPK id) {
        this.id = id;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
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

    public Integer getPulso() {
        return pulso;
    }

    public void setPulso(Integer pulso) {
        this.pulso = pulso;
    }

    public String getInvoluter() {
        return involuter;
    }

    public void setInvoluter(String involuter) {
        this.involuter = involuter;
    }

    public String getLoquios() {
        return loquios;
    }

    public void setLoquios(String loquios) {
        this.loquios = loquios;
    }
}
