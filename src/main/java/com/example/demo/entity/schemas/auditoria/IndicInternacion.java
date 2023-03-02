package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "indicinternacion", schema = "auditoria")
public class IndicInternacion {
    @EmbeddedId
    private IndicInternacionPK id;
    private String indicacion;
    private String usuario;
    private String operacion;
    private Integer idIndicacion;

    public IndicInternacionPK getId() {
        return id;
    }

    public void setId(IndicInternacionPK id) {
        this.id = id;
    }

    public String getIndicacion() {
        return indicacion;
    }

    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
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

    public Integer getIdIndicacion() {
        return idIndicacion;
    }

    public void setIdIndicacion(Integer idIndicacion) {
        this.idIndicacion = idIndicacion;
    }
}
