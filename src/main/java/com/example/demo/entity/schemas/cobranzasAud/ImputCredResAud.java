package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas_aud", name = "imput_cred_res")
public class ImputCredResAud {
    @EmbeddedId
    private ImputCredResAudPK id;
    private String operacion;
    private Double acreditado;

    public ImputCredResAudPK getId() {
        return id;
    }

    public void setId(ImputCredResAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Double getAcreditado() {
        return acreditado;
    }

    public void setAcreditado(Double acreditado) {
        this.acreditado = acreditado;
    }
}
