package com.example.demo.entity.schemas.asistencia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "asistencia", name = "agrupamientoespecialidad")
public class AgrupamientoEspecialidad {
    @Id
    @Column(name = "codigoagrupamiento")
    private String codigoAgrupamiento;
    private String descripcion;

    public String getCodigoAgrupamiento() {
        return codigoAgrupamiento;
    }

    public void setCodigoAgrupamiento(String codigoAgrupamiento) {
        this.codigoAgrupamiento = codigoAgrupamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
