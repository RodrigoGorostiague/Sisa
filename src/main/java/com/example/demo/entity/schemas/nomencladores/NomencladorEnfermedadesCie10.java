package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladorenfermedadescie10", schema = "nomencladores")
public class NomencladorEnfermedadesCie10 {
    @Id
    private String codigo;
    private String descripcion;
    private String capitulo;
    @Column(name = "emedbv")
    private String emeDbv;
    @Column(name = "descripcionbreve")
    private String descripcionBreve;

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

    public String getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public String getEmeDbv() {
        return emeDbv;
    }

    public void setEmeDbv(String emeDbv) {
        this.emeDbv = emeDbv;
    }

    public String getDescripcionBreve() {
        return descripcionBreve;
    }

    public void setDescripcionBreve(String descripcionBreve) {
        this.descripcionBreve = descripcionBreve;
    }
}
