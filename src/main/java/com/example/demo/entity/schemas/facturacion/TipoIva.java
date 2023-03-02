package com.example.demo.entity.schemas.facturacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoiva", schema = "facturacion")
public class TipoIva {
    @Id
    @Column(name = "idtipoiva")
    private Integer idTipoIva;
    private String nombre;

    public Integer getIdTipoIva() {
        return idTipoIva;
    }

    public void setIdTipoIva(Integer idTipoIva) {
        this.idTipoIva = idTipoIva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
