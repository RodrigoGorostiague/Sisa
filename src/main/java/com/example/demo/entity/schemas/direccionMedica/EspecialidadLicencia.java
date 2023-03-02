package com.example.demo.entity.schemas.direccionMedica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "direccionmedica", name = "especialidadlicencia")
public class EspecialidadLicencia {
    @Id
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    private String nombre;
    @Column(name = "nombrecorto")
    private String nombreCorto;

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }
}
