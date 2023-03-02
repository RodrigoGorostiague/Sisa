package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "domicilio", name = "tipodomicilio")
public class TipoDomicilio {
    @Id
    @Column(name = "idtipodomicilio")
    private String idTipoDomicilio;
    private String nombre;
    private String descripcion;

    public String getIdTipoDomicilio() {
        return idTipoDomicilio;
    }

    public void setIdTipoDomicilio(String idTipoDomicilio) {
        this.idTipoDomicilio = idTipoDomicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
