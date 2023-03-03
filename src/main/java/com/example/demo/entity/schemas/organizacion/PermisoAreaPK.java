package com.example.demo.entity.schemas.organizacion;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PermisoAreaPK implements Serializable {
    private Integer codigoarea;
    private String codigo;

    public Integer getCodigoarea() {
        return codigoarea;
    }

    public void setCodigoarea(Integer codigoarea) {
        this.codigoarea = codigoarea;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
