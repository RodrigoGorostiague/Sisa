package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AutUsuariosOtAnt {
    @Id
    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
