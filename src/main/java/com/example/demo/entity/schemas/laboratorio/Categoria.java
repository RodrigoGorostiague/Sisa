package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria", schema = "laboratorio")
public class Categoria {
    @Id
    private Integer categoria;
    private String sexo;
    @Column(name = "rangoedadorigen")
    private Integer rangoEdadOrigen;
    @Column(name = "rangoedaddestino")
    private Integer rangoEdadDestino;
    @Column(name = "rangoedadunidad")
    private String rangoEdadUnidad;
    private String texto;
    @Column(name = "semanasembarazoorigen")
    private Integer semanasEmbarazoOrigen;
    @Column(name = "semanasembarazodestino")
    private Integer semanasEmbarazoDestino;
    private Boolean borrado;

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getRangoEdadOrigen() {
        return rangoEdadOrigen;
    }

    public void setRangoEdadOrigen(Integer rangoEdadOrigen) {
        this.rangoEdadOrigen = rangoEdadOrigen;
    }

    public Integer getRangoEdadDestino() {
        return rangoEdadDestino;
    }

    public void setRangoEdadDestino(Integer rangoEdadDestino) {
        this.rangoEdadDestino = rangoEdadDestino;
    }

    public String getRangoEdadUnidad() {
        return rangoEdadUnidad;
    }

    public void setRangoEdadUnidad(String rangoEdadUnidad) {
        this.rangoEdadUnidad = rangoEdadUnidad;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getSemanasEmbarazoOrigen() {
        return semanasEmbarazoOrigen;
    }

    public void setSemanasEmbarazoOrigen(Integer semanasEmbarazoOrigen) {
        this.semanasEmbarazoOrigen = semanasEmbarazoOrigen;
    }

    public Integer getSemanasEmbarazoDestino() {
        return semanasEmbarazoDestino;
    }

    public void setSemanasEmbarazoDestino(Integer semanasEmbarazoDestino) {
        this.semanasEmbarazoDestino = semanasEmbarazoDestino;
    }

    public Boolean getBorrado() {
        return borrado;
    }

    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }
}
