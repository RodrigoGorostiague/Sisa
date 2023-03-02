package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarioimpresion", schema = "auditoria")
public class UsuarioImpresion {
    @EmbeddedId
    private UsuarioImpresionPK id;
    private String operacion;

    public UsuarioImpresionPK getId() {
        return id;
    }

    public void setId(UsuarioImpresionPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
