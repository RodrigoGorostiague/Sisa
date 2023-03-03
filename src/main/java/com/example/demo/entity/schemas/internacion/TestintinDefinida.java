package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "testintindefinida", schema = "internacion")
public class TestintinDefinida {
    @Id
    @Column(name = "codigoservicio")
    private Integer codigoServicio;
    @Column(name = "edadminima")
    private Integer edadMinima;
    @Column(name = "edadmaxima")
    private Integer edadMaxima;
    @Column(name = "tipoedad")
    private String tipoEdad;
    private String sexo;
    private String descripcion;

    public Integer getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(Integer codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Integer getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(Integer edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public String getTipoEdad() {
        return tipoEdad;
    }

    public void setTipoEdad(String tipoEdad) {
        this.tipoEdad = tipoEdad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
