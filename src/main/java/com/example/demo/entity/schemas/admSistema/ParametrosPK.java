package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class ParametrosPK implements Serializable {
    @Column(name = "nombreparametro")
    private String nombreParametro;
    @ManyToOne
    @JoinColumn(name = "idmodulo", referencedColumnName = "idmodulo")
    private Modulo modulo;

    public String getNombreParametro() {
        return nombreParametro;
    }

    public void setNombreParametro(String nombreParametro) {
        this.nombreParametro = nombreParametro;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
