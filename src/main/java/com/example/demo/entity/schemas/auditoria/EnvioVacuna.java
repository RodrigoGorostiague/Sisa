package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "enviovacuna")
public class EnvioVacuna {
    @EmbeddedId
    private EnvioVacunaPK id;
    private String operacion;
    @Column(name = "codigouniatrecep")
    private String codigoUniatRecep;

    public EnvioVacunaPK getId() {
        return id;
    }

    public void setId(EnvioVacunaPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getCodigoUniatRecep() {
        return codigoUniatRecep;
    }

    public void setCodigoUniatRecep(String codigoUniatRecep) {
        this.codigoUniatRecep = codigoUniatRecep;
    }
}
