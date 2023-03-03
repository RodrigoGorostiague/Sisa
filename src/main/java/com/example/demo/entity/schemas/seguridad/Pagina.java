package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagina", schema = "seguridad")
public class Pagina {
    @EmbeddedId
    private PaginaPK id;
    @Column(name = "tdescripcion")
    private String tDescripcion;
    @Column(name = "ctipo")
    private String cTipo;
    @Column(name = "nseguridad")
    private String nSeguridad;

    public PaginaPK getId() {
        return id;
    }

    public void setId(PaginaPK id) {
        this.id = id;
    }

    public String gettDescripcion() {
        return tDescripcion;
    }

    public void settDescripcion(String tDescripcion) {
        this.tDescripcion = tDescripcion;
    }

    public String getcTipo() {
        return cTipo;
    }

    public void setcTipo(String cTipo) {
        this.cTipo = cTipo;
    }

    public String getnSeguridad() {
        return nSeguridad;
    }

    public void setnSeguridad(String nSeguridad) {
        this.nSeguridad = nSeguridad;
    }
}
