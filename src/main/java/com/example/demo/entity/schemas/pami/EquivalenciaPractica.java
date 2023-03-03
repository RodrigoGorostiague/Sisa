package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "equivalencia_practica", schema = "pami_nuevo")
public class EquivalenciaPractica {
    @EmbeddedId
    private EquivalenciaPracticaPK id;
    @Column(name = "descripcion_practica")
    private String descripcion_practica;
    private Integer modulo;
    @Column(name = "descripcion_modulo")
    private  String descripcionModulo;
    private Date vigencia;
    @Column(name = "finvigencia")
    private Date finVigencia;
    @Column(name = "nivel_autorizacion")
    private String nivelAutorizacion;

    public EquivalenciaPracticaPK getId() {
        return id;
    }

    public void setId(EquivalenciaPracticaPK id) {
        this.id = id;
    }

    public String getDescripcion_practica() {
        return descripcion_practica;
    }

    public void setDescripcion_practica(String descripcion_practica) {
        this.descripcion_practica = descripcion_practica;
    }

    public Integer getModulo() {
        return modulo;
    }

    public void setModulo(Integer modulo) {
        this.modulo = modulo;
    }

    public String getDescripcionModulo() {
        return descripcionModulo;
    }

    public void setDescripcionModulo(String descripcionModulo) {
        this.descripcionModulo = descripcionModulo;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public Date getFinVigencia() {
        return finVigencia;
    }

    public void setFinVigencia(Date finVigencia) {
        this.finVigencia = finVigencia;
    }

    public String getNivelAutorizacion() {
        return nivelAutorizacion;
    }

    public void setNivelAutorizacion(String nivelAutorizacion) {
        this.nivelAutorizacion = nivelAutorizacion;
    }
}
