package com.example.demo.entity.schemas.domicilio;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "domicilio", name = "provinciaargentina")
public class ProvinciaArgentina {
    @Id
    @Column(name = "codigoprovincia")
    private Integer codigoProvincia;
    private String nombre;
    @OneToMany(mappedBy = "id.provinciaArgentina")
    private List<Partido> partidos;

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public Integer getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(Integer codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
