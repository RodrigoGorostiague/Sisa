package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "reciennacido")
public class RecienNacidoAud {
    @EmbeddedId
    private RecienNacidoAudPK id;
    private String operacion;
    @Column(name = "lugpartoabor")
    private String lugPartoAbor;
    private Integer hc;
    @Column(name = "gestasprevias")
    private Integer gestasPrevias;

    public RecienNacidoAudPK getId() {
        return id;
    }

    public void setId(RecienNacidoAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
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
