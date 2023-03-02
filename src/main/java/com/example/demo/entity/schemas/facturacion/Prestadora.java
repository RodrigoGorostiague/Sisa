package com.example.demo.entity.schemas.facturacion;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "prestadora", schema = "facturacion")
public class Prestadora {
    @Id
    @Column(name = "codigoprestadora")
    private String codigoPrestadora;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "codigoobrasocial", referencedColumnName = "codigoobrasocial")
    private ObraSocial obraSocial;

    public String getCodigoPrestadora() {
        return codigoPrestadora;
    }

    public void setCodigoPrestadora(String codigoPrestadora) {
        this.codigoPrestadora = codigoPrestadora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
}
