package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "domicilio", name = "localidad")
public class Localidad {
    @EmbeddedId
    private LocalidadPK id;
    private String nombre;
    @Column(name = "codigoprovincia")
    private Integer codigoProvincia;


    public LocalidadPK getId() {
        return id;
    }

    public void setId(LocalidadPK id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(Integer codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }
}
