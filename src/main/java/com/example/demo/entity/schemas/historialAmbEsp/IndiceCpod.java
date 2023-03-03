package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historiambesp", name = "indicecpod")
public class IndiceCpod {
    @EmbeddedId
    private IndiceCpodPK id;
    private Integer caries;
    private Integer perdidos;
    private Integer obturados;

    public IndiceCpodPK getId() {
        return id;
    }

    public void setId(IndiceCpodPK id) {
        this.id = id;
    }

    public Integer getCaries() {
        return caries;
    }

    public void setCaries(Integer caries) {
        this.caries = caries;
    }

    public Integer getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(Integer perdidos) {
        this.perdidos = perdidos;
    }

    public Integer getObturados() {
        return obturados;
    }

    public void setObturados(Integer obturados) {
        this.obturados = obturados;
    }
}
