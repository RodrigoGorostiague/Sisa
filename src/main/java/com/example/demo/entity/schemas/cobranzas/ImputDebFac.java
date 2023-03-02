package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas", name = "imput_deb_fac")
public class ImputDebFac {
    @EmbeddedId
    private ImputDebFacPK id;
    private Integer resumen;
    @Column(name = "amb_int")
    private String ambInt;
    private Double debitado;
    private String observaciones;

    public ImputDebFacPK getId() {
        return id;
    }

    public void setId(ImputDebFacPK id) {
        this.id = id;
    }

    public Integer getResumen() {
        return resumen;
    }

    public void setResumen(Integer resumen) {
        this.resumen = resumen;
    }

    public String getAmbInt() {
        return ambInt;
    }

    public void setAmbInt(String ambInt) {
        this.ambInt = ambInt;
    }

    public Double getDebitado() {
        return debitado;
    }

    public void setDebitado(Double debitado) {
        this.debitado = debitado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
