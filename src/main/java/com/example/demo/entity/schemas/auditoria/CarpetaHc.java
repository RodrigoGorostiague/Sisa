package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "carpetahc")
public class CarpetaHc {
    @EmbeddedId
    private CarpetaHcPK id;
    private String usuario;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    private String operacion;

    public CarpetaHcPK getId() {
        return id;
    }

    public void setId(CarpetaHcPK id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
