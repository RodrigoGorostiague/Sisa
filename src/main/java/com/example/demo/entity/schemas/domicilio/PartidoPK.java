package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class PartidoPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "codigoprovincia", referencedColumnName = "codigoprovincia")
    private ProvinciaArgentina provinciaArgentina;
    @Column(name = "codigopartido")
    private Integer codigoPartido;

    public ProvinciaArgentina getProvinciaArgentina() {
        return provinciaArgentina;
    }

    public void setProvinciaArgentina(ProvinciaArgentina provinciaArgentina) {
        this.provinciaArgentina = provinciaArgentina;
    }

    public Integer getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(Integer codigoPartido) {
        this.codigoPartido = codigoPartido;
    }
}
