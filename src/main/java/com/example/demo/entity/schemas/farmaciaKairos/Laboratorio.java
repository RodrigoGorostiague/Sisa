package com.example.demo.entity.schemas.farmaciaKairos;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "laboratorio", schema = "farmacia_kairos")
public class Laboratorio {
    @Id
    @Column(name = "codigolab")
    private Integer codigoLab;
    private String nombre;
    private String estado;
    @OneToMany(mappedBy = "laboratorio")
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Integer getCodigoLab() {
        return codigoLab;
    }

    public void setCodigoLab(Integer codigoLab) {
        this.codigoLab = codigoLab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
