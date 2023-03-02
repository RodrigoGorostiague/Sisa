package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clase", schema = "farmacia")
public class Clase {
    @Id
    @Column(name = "codigoclase")
    private Integer codigoClase;
    private Integer inc;
    private Integer ppr;
    private Integer ppar;
    private String descripcion;

    public Integer getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(Integer codigoClase) {
        this.codigoClase = codigoClase;
    }

    public Integer getInc() {
        return inc;
    }

    public void setInc(Integer inc) {
        this.inc = inc;
    }

    public Integer getPpr() {
        return ppr;
    }

    public void setPpr(Integer ppr) {
        this.ppr = ppr;
    }

    public Integer getPpar() {
        return ppar;
    }

    public void setPpar(Integer ppar) {
        this.ppar = ppar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
