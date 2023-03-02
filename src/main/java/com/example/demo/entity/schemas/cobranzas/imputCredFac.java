package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranzas", name = "imput_cred_fac")
public class imputCredFac {
    @EmbeddedId
    private imputCredFacPk id;
    private Integer resumen;
    @Column(name = "amb_int")
    private String ambInt;
    private Double acreditado;
    private String observaciones;

    public imputCredFacPk getId() {
        return id;
    }

    public void setId(imputCredFacPk id) {
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
