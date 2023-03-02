package com.example.demo.entity.schemas.electroEncefaloGramas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "electroencefalograma",name = "padronpracticaeeg")
public class PadronPracticaEeg {
    @Id
    private String codigo;
    private String descripcion;
    @Column(name = "observacionesinforme")
    private String observacionesInforme;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacionesInforme() {
        return observacionesInforme;
    }

    public void setObservacionesInforme(String observacionesInforme) {
        this.observacionesInforme = observacionesInforme;
    }
}
