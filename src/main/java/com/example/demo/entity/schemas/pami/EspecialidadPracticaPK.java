package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class EspecialidadPracticaPK implements Serializable {
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    @Column(name = "id_practica_pami")
    private String idPracticaPami;

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getIdPracticaPami() {
        return idPracticaPami;
    }

    public void setIdPracticaPami(String idPracticaPami) {
        this.idPracticaPami = idPracticaPami;
    }
}
