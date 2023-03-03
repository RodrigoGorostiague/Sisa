package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "diagnosticoemergencias", schema = "nomencladores")
public class DiagnosticoEmergencias {
    @Id
    private String codigo;
    private String descripcion;
    @Column(name = "codigoaparato")
    private String codigoAparato;
    @Column(name = "ninosadultos")
    private String ninosAdultos;

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

    public String getCodigoAparato() {
        return codigoAparato;
    }

    public void setCodigoAparato(String codigoAparato) {
        this.codigoAparato = codigoAparato;
    }

    public String getNinosAdultos() {
        return ninosAdultos;
    }

    public void setNinosAdultos(String ninosAdultos) {
        this.ninosAdultos = ninosAdultos;
    }
}
