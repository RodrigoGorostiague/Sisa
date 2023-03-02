package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas", name = "imput_cred_res")
public class ImputCredRes {
    @EmbeddedId
    private ImputCredResPK id;
    private Double acreditado;
    private String observaciones;
     @Column(name = "emitend")
    private String emitEnd;

    public ImputCredResPK getId() {
        return id;
    }

    public void setId(ImputCredResPK id) {
        this.id = id;
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

    public String getEmitEnd() {
        return emitEnd;
    }

    public void setEmitEnd(String emitEnd) {
        this.emitEnd = emitEnd;
    }
}
