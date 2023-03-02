package com.example.demo.entity.schemas.facturacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoos", schema = "facturacion")
public class TipoOs {
    @Id
    @Column(name = "idtipoos")
    private Integer idTipoOs;
    private String nombre;
    private String descripcion;

    public Integer getIdTipoOs() {
        return idTipoOs;
    }

    public void setIdTipoOs(Integer idTipoOs) {
        this.idTipoOs = idTipoOs;
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
