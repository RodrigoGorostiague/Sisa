package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "coberturasocial")
public class CoberturaSocial {
    @EmbeddedId
    private CoberturaSocialPK id;
    private String usuario;
    private String operacion;
    @Column(name = "observaciones")
    private String observacion;

    public CoberturaSocialPK getId() {
        return id;
    }

    public void setId(CoberturaSocialPK id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
