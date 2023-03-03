package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "padronanalisis", schema = "laboratorio")
public class PadronAnalisis {
    @Id
    private Integer codigonumero;
    @Column(name = "codigotexto")
    private String codigoTexto;
    private String descripcion;
    private Integer sector;
    private String titulo;

    public Integer getCodigonumero() {
        return codigonumero;
    }

    public void setCodigonumero(Integer codigonumero) {
        this.codigonumero = codigonumero;
    }

    public String getCodigoTexto() {
        return codigoTexto;
    }

    public void setCodigoTexto(String codigoTexto) {
        this.codigoTexto = codigoTexto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getSector() {
        return sector;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
