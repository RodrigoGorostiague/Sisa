package com.example.demo.entity.schemas.sisaNacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mapeodepartamento", schema = "sisanacion")
public class MapeoDepartamento {
    @EmbeddedId
    private MapeoDepartamentoPK id;
    @Column(name = "idnacion")
    private Integer idNacion;

    public MapeoDepartamentoPK getId() {
        return id;
    }

    public void setId(MapeoDepartamentoPK id) {
        this.id = id;
    }

    public Integer getIdNacion() {
        return idNacion;
    }

    public void setIdNacion(Integer idNacion) {
        this.idNacion = idNacion;
    }
}
