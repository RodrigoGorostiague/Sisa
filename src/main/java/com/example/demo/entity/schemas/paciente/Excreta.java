package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "excreta", schema = "paciente")
public class Excreta {
    @Id
    @Column(name = "idexcreta")
    private String idExcreta;
    private String nombre;
    private String descripcion;

    public String getIdExcreta() {
        return idExcreta;
    }

    public void setIdExcreta(String idExcreta) {
        this.idExcreta = idExcreta;
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
