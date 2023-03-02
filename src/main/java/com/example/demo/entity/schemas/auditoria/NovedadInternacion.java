package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "novedadinternacion")
public class NovedadInternacion {
    @EmbeddedId
    private NovedadInternacionPK id;
    private String usuario;
    private String operacion;
    @Column(name = "tiponov")
    private String tipoNov;

    public NovedadInternacionPK getId() {
        return id;
    }

    public void setId(NovedadInternacionPK id) {
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

    public String getTipoNov() {
        return tipoNov;
    }

    public void setTipoNov(String tipoNov) {
        this.tipoNov = tipoNov;
    }
}
