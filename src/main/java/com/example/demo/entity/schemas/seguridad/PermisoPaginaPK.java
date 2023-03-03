package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PermisoPaginaPK implements Serializable {
    @Column(name = "naplicacion")
    private String nAplicacion;
    @Column(name = "npagina")
    private String nPagina;
    @Column(name = "id_rolf")
    private Integer idRolf;

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

    public Integer getIdRolf() {
        return idRolf;
    }

    public void setIdRolf(Integer idRolf) {
        this.idRolf = idRolf;
    }
}
