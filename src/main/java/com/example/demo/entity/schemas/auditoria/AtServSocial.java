package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "atservsocial")
public class AtServSocial {
    @EmbeddedId
    private AtServSocialPK id;
    private String operacion;

    public AtServSocialPK getId() {
        return id;
    }

    public void setId(AtServSocialPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
