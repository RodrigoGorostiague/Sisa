package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas", name = "rangorecibos")
public class RangoRecibos {
    @EmbeddedId
    private RangoRecibosPK id;
    private String vigente;

    public RangoRecibosPK getId() {
        return id;
    }

    public void setId(RangoRecibosPK id) {
        this.id = id;
    }

    public String getVigente() {
        return vigente;
    }

    public void setVigente(String vigente) {
        this.vigente = vigente;
    }
}
