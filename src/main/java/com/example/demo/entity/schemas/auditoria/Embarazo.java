package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "embarazo")
public class Embarazo {
    @EmbeddedId
    private EmbarazoPK id;
    private String operacion;
    @Column(name = "lugpartoabor")
    private String lugarPartoAbor;
    private Integer hc;
    @Column(name = "gestasprevias")
    private Integer gestasPrevias;

    public EmbarazoPK getId() {
        return id;
    }

    public void setId(EmbarazoPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getLugarPartoAbor() {
        return lugarPartoAbor;
    }

    public void setLugarPartoAbor(String lugarPartoAbor) {
        this.lugarPartoAbor = lugarPartoAbor;
    }

    public Integer getHc() {
        return hc;
    }

    public void setHc(Integer hc) {
        this.hc = hc;
    }

    public Integer getGestasPrevias() {
        return gestasPrevias;
    }

    public void setGestasPrevias(Integer gestasPrevias) {
        this.gestasPrevias = gestasPrevias;
    }
}
