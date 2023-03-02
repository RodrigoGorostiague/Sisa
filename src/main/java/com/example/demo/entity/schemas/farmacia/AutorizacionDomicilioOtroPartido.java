package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "autorizaciondomiciliootropartido", schema = "farmacia")
public class AutorizacionDomicilioOtroPartido {
    @EmbeddedId
    private AutorizacionDomicilioOtroPartidoPK id;
    private String usuario;
    private String estado;

    public AutorizacionDomicilioOtroPartidoPK getId() {
        return id;
    }

    public void setId(AutorizacionDomicilioOtroPartidoPK id) {
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
