package com.example.demo.entity.schemas.facturacion;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class FormatoNroAfiliadoPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "codigoobrasocial", referencedColumnName = "codigoobrasocial")
    private ObraSocial obraSocial;
    private String formato;

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
