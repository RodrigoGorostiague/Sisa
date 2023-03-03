package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diagnosticos", schema = "resapro")
public class Diagnosticos {
    @Id
    @Column(name = "id_internacion_local")
    private String idInternacionLocal;
    @Column(name = "cod_estable")
    private String codEstable;
    @Column(name = "cod_diagnostico")
    private String  codDiagnostico;
    private Integer tipo;
    private Integer orden;

    public String getIdInternacionLocal() {
        return idInternacionLocal;
    }

    public void setIdInternacionLocal(String idInternacionLocal) {
        this.idInternacionLocal = idInternacionLocal;
    }

    public String getCodEstable() {
        return codEstable;
    }

    public void setCodEstable(String codEstable) {
        this.codEstable = codEstable;
    }

    public String getCodDiagnostico() {
        return codDiagnostico;
    }

    public void setCodDiagnostico(String codDiagnostico) {
        this.codDiagnostico = codDiagnostico;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
