package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "imput_deb_res", schema = "cobranzas_aud")
public class ImputDebResAud {
    @EmbeddedId
    private ImputDebResAudPK id;
    private String operacion;
    private Double debitado;

    public ImputDebResAudPK getId() {
        return id;
    }

    public void setId(ImputDebResAudPK id) {
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
}
