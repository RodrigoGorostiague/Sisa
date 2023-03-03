package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NomencladorLaboratorioNuevoPK implements Serializable {
    @Column(name = "codigopn")
    private String codigoPn;
    @Column(name = "codigo_sihos")
    private String codigoSihos;

    public String getCodigoPn() {
        return codigoPn;
    }

    public void setCodigoPn(String codigoPn) {
        this.codigoPn = codigoPn;
    }

    public String getCodigoSihos() {
        return codigoSihos;
    }

    public void setCodigoSihos(String codigoSihos) {
        this.codigoSihos = codigoSihos;
    }
}
