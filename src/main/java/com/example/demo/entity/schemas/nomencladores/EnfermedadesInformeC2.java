package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enfermedadesinformec2", schema = "nomencladores")
public class EnfermedadesInformeC2 {
    @Id
    private String codigo;
    private String descipcion;
    @Column(name = "tipolistado")
    private String tipoListado;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public String getTipoListado() {
        return tipoListado;
    }

    public void setTipoListado(String tipoListado) {
        this.tipoListado = tipoListado;
    }
}
