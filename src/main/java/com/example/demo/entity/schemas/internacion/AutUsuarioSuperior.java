package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autusuariosuperior", schema = "internacion")
public class AutUsuarioSuperior {
    @Id
    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
