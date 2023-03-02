package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas", name = "imput_deb_res")
public class ImputDebRes {
    @EmbeddedId
    private ImputDebResPK id;
    private Double debitado;
    private String observaciones;
    @Column(name = "emitenc")
    private String emitEnc;

    public ImputDebResPK getId() {
        return id;
    }

    public void setId(ImputDebResPK id) {
        this.id = id;
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

    public String getEmitEnc() {
        return emitEnc;
    }

    public void setEmitEnc(String emitEnc) {
        this.emitEnc = emitEnc;
    }
}
