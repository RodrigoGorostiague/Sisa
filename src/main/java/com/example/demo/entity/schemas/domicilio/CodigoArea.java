package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "domicilio", name = "codigoarea")
public class CodigoArea {
    @Id
    @Column(name = "codarea")
    private Integer codArea;
    private String localidad;
    @Column(name = "codigoprovincia")
    private Integer codigoProvincia;

    public Integer getCodArea() {
        return codArea;
    }

    public void setCodArea(Integer codArea) {
        this.codArea = codArea;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Integer getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(Integer codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }
}
