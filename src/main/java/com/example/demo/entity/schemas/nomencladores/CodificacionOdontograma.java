package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "codificacionodontograma", schema = "nomencladores")
public class CodificacionOdontograma {
    @Id
    private String codigo;
    private String descripcion;
    private String dibujo;
    private String color;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDibujo() {
        return dibujo;
    }

    public void setDibujo(String dibujo) {
        this.dibujo = dibujo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
