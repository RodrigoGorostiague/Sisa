package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarioasignadual", schema = "turnos")
public class UsuarioAsignaDual {
    @EmbeddedId
    private UsuarioAsignaDualPK id;

    public UsuarioAsignaDualPK getId() {
        return id;
    }

    public void setId(UsuarioAsignaDualPK id) {
        this.id = id;
    }
}
