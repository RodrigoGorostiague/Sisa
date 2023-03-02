package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas_aud", name = "imput_cobro_res")
public class ImputCobroResAud {
    @EmbeddedId
    private ImputCobroResAudPK id;
    private String operacion;
    private Double debitado;
    private Double acreditado;
    private Double cobrado;

    public ImputCobroResAudPK getId() {
        return id;
    }

    public void setId(ImputCobroResAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
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

    public Double getCobrado() {
        return cobrado;
    }

    public void setCobrado(Double cobrado) {
        this.cobrado = cobrado;
    }
}
