package com.example.demo.entity.schemas.facturacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipootrcob", schema = "facturacion")
public class TipoOtrCob {
    @Id
    @Column(name = "idtipootrcob")
    private Integer idTipoOtrCob;
    private String nombre;
    private String descripcion;

    public Integer getIdTipoOtrCob() {
        return idTipoOtrCob;
    }

    public void setIdTipoOtrCob(Integer idTipoOtrCob) {
        this.idTipoOtrCob = idTipoOtrCob;
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
