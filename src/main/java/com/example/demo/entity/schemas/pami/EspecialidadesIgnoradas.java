package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "especialidades_ignoradas", schema = "pami_nuevo")
public class EspecialidadesIgnoradas {
    @Id
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }
}
