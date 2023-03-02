package com.example.demo.entity.schemas.electroEncefaloGramas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "electroencefalograma", name = "textopredefeeg")
public class TextoPredefEeg {
    @Id
    private String codigo;
    private String descripcion;
    private String texto;
    private String practica;
    private String profesional;

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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getPractica() {
        return practica;
    }

    public void setPractica(String practica) {
        this.practica = practica;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }
}
