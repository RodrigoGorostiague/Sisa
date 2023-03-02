package com.example.demo.entity.schemas.farmaciaKairos;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "producto", schema = "farmacia_kairos")
public class Producto {
    @Id
    private Integer codigo;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "laboratorio", referencedColumnName = "codigolab")
    private Laboratorio laboratorio;
    private String estado;
    @OneToMany(mappedBy = "id.producto")
    private List<Presentacion> presentacion;

    public List<Presentacion> getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(List<Presentacion> presentacion) {
        this.presentacion = presentacion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
