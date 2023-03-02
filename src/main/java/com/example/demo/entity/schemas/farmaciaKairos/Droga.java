package com.example.demo.entity.schemas.farmaciaKairos;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "droga", schema = "farmacia_kairos")
public class Droga {
    @Id
    @Column(name = "codigodroga")
    private Integer codigoDroga;
    private String descripcion;
    private String estado;
    private String endovenoso;
    private String suero;
    @ManyToMany
    @JoinTable(name = "drogaporproducto",
            joinColumns = @JoinColumn(name = "codigodroga"),
            inverseJoinColumns = @JoinColumn(name = "codigo")
    )
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Integer getCodigoDroga() {
        return codigoDroga;
    }

    public void setCodigoDroga(Integer codigoDroga) {
        this.codigoDroga = codigoDroga;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndovenoso() {
        return endovenoso;
    }

    public void setEndovenoso(String endovenoso) {
        this.endovenoso = endovenoso;
    }

    public String getSuero() {
        return suero;
    }

    public void setSuero(String suero) {
        this.suero = suero;
    }
}
