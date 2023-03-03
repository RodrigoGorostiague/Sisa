package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "adicciones")
public class AdiccionesAud {
    @EmbeddedId
    private AdiccionesAudPK id;
    private String operaciones;
    @Column(name = "lugpartoabor")
    private String lugPartoAbor;
    private Integer hc;
    @Column(name = "gestasprevias")
    private Integer gestasPrevias;

    public AdiccionesAudPK getId() {
        return id;
    }

    public void setId(AdiccionesAudPK id) {
        this.id = id;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
    }

    public String getLugPartoAbor() {
        return lugPartoAbor;
    }

    public void setLugPartoAbor(String lugPartoAbor) {
        this.lugPartoAbor = lugPartoAbor;
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
