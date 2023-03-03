package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "old_equivalencia_practica", schema = "pami_nuevo")
public class OldEquivalenciaPractica {
    @EmbeddedId
    private OldEquivalenciaPracticaPK id;
    @Column(name = "descripcion_practica")
    private String descripcionPractica;
    private Integer modulo;
    @Column(name = "descripcion_modulo")
    private String descripcionModulo;
    private Date vigencia;
    @Column(name = "finvigencia")
    private Date finVigencia;
    @Column(name = "nivel_autorizacion")
    private String nivelAutorizacion;

    public OldEquivalenciaPracticaPK getId() {
        return id;
    }

    public void setId(OldEquivalenciaPracticaPK id) {
        this.id = id;
    }

    public String getDescripcionPractica() {
        return descripcionPractica;
    }

    public void setDescripcionPractica(String descripcionPractica) {
        this.descripcionPractica = descripcionPractica;
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
