package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "permiso", schema = "seguridad")
public class Permiso {
    @EmbeddedId
    private PermisoPK id;
    @Column(name = "tipo_acceso")
    private String tipoAcceso;

    public PermisoPK getId() {
        return id;
    }

    public void setId(PermisoPK id) {
        this.id = id;
    }

    public String getTipoAcceso() {
        return tipoAcceso;
    }

    public void setTipoAcceso(String tipoAcceso) {
        this.tipoAcceso = tipoAcceso;
    }
}
