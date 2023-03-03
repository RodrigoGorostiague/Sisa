package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "barriopopular")
public class BarrioPopularAud {
    @EmbeddedId
    private BarrioPopularAudPK id;
    private String operacion;
    private String usuario;

    public BarrioPopularAudPK getId() {
        return id;
    }

    public void setId(BarrioPopularAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
