package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class AgrupEtarioEstadisticaPK implements Serializable{
    @Column(name = "edaddesde")
    private Integer edadDesde;
    @Column(name = "edadhasta")
    private Integer edadHasta;
    @Column(name = "tipoedad")
    private String tipoEdad;

    public Integer getEdadDesde() {
        return edadDesde;
    }

    public void setEdadDesde(Integer edadDesde) {
        this.edadDesde = edadDesde;
    }

    public Integer getEdadHasta() {
        return edadHasta;
    }

    public void setEdadHasta(Integer edadHasta) {
        this.edadHasta = edadHasta;
    }

    public String getTipoEdad() {
        return tipoEdad;
    }

    public void setTipoEdad(String tipoEdad) {
        this.tipoEdad = tipoEdad;
    }
}
