package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ExclusionPracticasPK implements Serializable {
    @Column(name = "cod_pract_desde")
    private String codPractDesde;
    @Column(name = "cod_pract_hasta")
    private String codPractHasta;

    public String getCodPractDesde() {
        return codPractDesde;
    }

    public void setCodPractDesde(String codPractDesde) {
        this.codPractDesde = codPractDesde;
    }

    public String getCodPractHasta() {
        return codPractHasta;
    }

    public void setCodPractHasta(String codPractHasta) {
        this.codPractHasta = codPractHasta;
    }
}
