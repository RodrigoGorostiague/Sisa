package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas", name = "imput_cobro_fac")
public class ImputCobroFac {
    @EmbeddedId
    private ImputCobroFacPK id;
    private Integer resumen;
    @Column(name = "amb_int")
    private String ambInt;
    private Double cobrado;
    private Double debitado;
    private Double acreditado;
    private String observaciones;

    public ImputCobroFacPK getId() {
        return id;
    }

    public void setId(ImputCobroFacPK id) {
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

    public Double getCobrado() {
        return cobrado;
    }

    public void setCobrado(Double cobrado) {
        this.cobrado = cobrado;
    }

    public Double getDebitado() {
        return debitado;
    }

    public void setDebitado(Double debitado) {
        this.debitado = debitado;
    }

    public Double getAcreditado() {
        return acreditado;
    }

    public void setAcreditado(Double acreditado) {
        this.acreditado = acreditado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
