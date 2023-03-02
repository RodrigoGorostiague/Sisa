package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "parametros")
public class Parametros {
    @EmbeddedId
    private ParametrosPK id;
    private String descripcion;
    private String valor;

    public ParametrosPK getId() {
        return id;
    }

    public void setId(ParametrosPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
