package com.example.demo.entity.schemas.hc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "hc", name = "estadoarchivo")
public class EstadoArchivo {
    @Id
    @Column(name = "idestado")
    private String idEstado;
    private String nombre;
    private String deccripcion;

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeccripcion() {
        return deccripcion;
    }

    public void setDeccripcion(String deccripcion) {
        this.deccripcion = deccripcion;
    }
}
