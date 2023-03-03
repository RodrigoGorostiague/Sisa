package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EspecialidadComoPracticaPK implements Serializable {
    @Column(name = "id_practica_pami")
    private String idPracticaPami;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;

    public String getIdPracticaPami() {
        return idPracticaPami;
    }

    public void setIdPracticaPami(String idPracticaPami) {
        this.idPracticaPami = idPracticaPami;
    }

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }
}
