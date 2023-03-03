package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "enviovacunalinea", schema = "vacunacion")
public class EnvioVacunaLinea {
    @EmbeddedId
    private EnvioVacunaLineaPK id;
    @Column(name = "codigovacuna")
    private String codigoVacuna;
    private Integer cantidad;
    @Column(name = "numlote")
    private String numLote;

    public EnvioVacunaLineaPK getId() {
        return id;
    }

    public void setId(EnvioVacunaLineaPK id) {
        this.id = id;
    }

    public String getCodigoVacuna() {
        return codigoVacuna;
    }

    public void setCodigoVacuna(String codigoVacuna) {
        this.codigoVacuna = codigoVacuna;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }
}
