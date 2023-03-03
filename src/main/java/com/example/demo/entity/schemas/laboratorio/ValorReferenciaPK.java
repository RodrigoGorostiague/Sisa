package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ValorReferenciaPK implements Serializable {
    private Integer determinacion;
    private Integer categoria;
    private Integer version;

    public Integer getDeterminacion() {
        return determinacion;
    }

    public void setDeterminacion(Integer determinacion) {
        this.determinacion = determinacion;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
