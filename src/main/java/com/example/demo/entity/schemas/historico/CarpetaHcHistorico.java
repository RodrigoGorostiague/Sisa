package com.example.demo.entity.schemas.historico;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "carpetahc", schema = "historico")
public class CarpetaHc {
    @EmbeddedId
    private CarpetaHcPK id;
    private String usuario;
    @Column(name = "estadoviejo")
    private String estadoViejo;

    public CarpetaHcPK getId() {
        return id;
    }

    public void setId(CarpetaHcPK id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstadoViejo() {
        return estadoViejo;
    }

    public void setEstadoViejo(String estadoViejo) {
        this.estadoViejo = estadoViejo;
    }
}
