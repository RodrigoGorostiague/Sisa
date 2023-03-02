package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios_unidades_recepcion", schema = "farmacia")
public class UsuariosUnidadesRecepcion {
    @EmbeddedId
    private UsuariosUnidadesRecepcionPK id;

    public UsuariosUnidadesRecepcionPK getId() {
        return id;
    }

    public void setId(UsuariosUnidadesRecepcionPK id) {
        this.id = id;
    }
}
