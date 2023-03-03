package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "interpretacion", schema = "laboratorio")
public class Interpretacion {
    @Id
    private Integer interpretacion;
    private String texto;
    private String funcion;

    public Integer getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(Integer interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
}
