package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "domicilio", name = "pais")
public class Pais {
    @Id
    @Column(name = "codigopais")
    Integer codigoPais;
    private String nombre;
    @Column(name = "usofrecuente")
    private String usoFrecuente;

    public Integer getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsoFrecuente() {
        return usoFrecuente;
    }

    public void setUsoFrecuente(String usoFrecuente) {
        this.usoFrecuente = usoFrecuente;
    }
}
