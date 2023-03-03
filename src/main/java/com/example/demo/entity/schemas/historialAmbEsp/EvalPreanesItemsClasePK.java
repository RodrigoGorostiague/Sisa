package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EvalPreanesItemsClasePK implements Serializable {
    @Column(name = "nroconsulta")
    private Integer nroConsulta;
    @Column(name = "codigoitcla")
    private Integer codigoItcla;

    public Integer getNroConsulta() {
        return nroConsulta;
    }

    public void setNroConsulta(Integer nroConsulta) {
        this.nroConsulta = nroConsulta;
    }

    public Integer getCodigoItcla() {
        return codigoItcla;
    }

    public void setCodigoItcla(Integer codigoItcla) {
        this.codigoItcla = codigoItcla;
    }
}
