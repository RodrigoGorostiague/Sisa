package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "excepciones_equivalencia_practica", schema = "pami")
public class ExcepcionesEquivalenciaPractica {
    @EmbeddedId
    private ExcepcionesEquivalenciaPracticaPK id;
    @Column(name = "descripcion_practica")
    private String descripcionPractica;
    private Integer modulo;
    @Column(name = "descripcio_modulo")
    private String descripcioModulo;
    private Date vigencia;
    @Column(name = "finvigencia")
    private Date finVigencia;

    public ExcepcionesEquivalenciaPracticaPK getId() {
        return id;
    }

    public void setId(ExcepcionesEquivalenciaPracticaPK id) {
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

    public String getDescripcioModulo() {
        return descripcioModulo;
    }

    public void setDescripcioModulo(String descripcioModulo) {
        this.descripcioModulo = descripcioModulo;
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
}
