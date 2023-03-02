package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "autorizacionconcobsoc", schema = "farmacia")
public class AutorizacionConcObSoc {
    @EmbeddedId
    private AutorizacionConcObSocPK id;
    private String usuario;
    private String estado;

    public AutorizacionConcObSocPK getId() {
        return id;
    }

    public void setId(AutorizacionConcObSocPK id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
