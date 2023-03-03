package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PaginaPK implements Serializable {
    @Column(name = "naplicacion")
    private String nAplicacion;
    @Column(name = "npagina")
    private String nPagina;

    public String getnAplicacion() {
        return nAplicacion;
    }

    public void setnAplicacion(String nAplicacion) {
        this.nAplicacion = nAplicacion;
    }

    public String getnPagina() {
        return nPagina;
    }

    public void setnPagina(String nPagina) {
        this.nPagina = nPagina;
    }
}
