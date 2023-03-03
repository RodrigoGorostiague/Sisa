package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "pacsegsalmen")
public class PacSegSalMenAud {
    @EmbeddedId
    private PacSegSalMenAudPK id;
    private String operacion;
    private String usuario;

    public PacSegSalMenAudPK getId() {
        return id;
    }

    public void setId(PacSegSalMenAudPK id) {
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
