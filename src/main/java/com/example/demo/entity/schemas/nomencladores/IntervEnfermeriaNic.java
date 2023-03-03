package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "intervenfermerianic", schema = "nomencladores")
public class IntervEnfermeriaNic {
    @Id
    private String codigo;
    private String descripcion;
    @Column(name = "descrbreve")
    private String descrBreve;
    private String habilitado;
    @Column(name = "guardiahrs")
    private String guardiaHrs;
    @Column(name = "guardiadbv")
    private String guardiaDbv;

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

    public String getDescrBreve() {
        return descrBreve;
    }

    public void setDescrBreve(String descrBreve) {
        this.descrBreve = descrBreve;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public String getGuardiaHrs() {
        return guardiaHrs;
    }

    public void setGuardiaHrs(String guardiaHrs) {
        this.guardiaHrs = guardiaHrs;
    }

    public String getGuardiaDbv() {
        return guardiaDbv;
    }

    public void setGuardiaDbv(String guardiaDbv) {
        this.guardiaDbv = guardiaDbv;
    }
}
