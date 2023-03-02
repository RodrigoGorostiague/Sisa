package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "padronimagenes",schema = "nomencladores")
public class PadronImagenes {
    @Id
    @Column(name = "codigopractica")
    private String codigoPractica;
    private String descripcion;
    private String sector;
    @Column(name = "codigooms")
    private Integer codigoOms;
    @Column(name = "unidadesrad")
    private Integer unidadEsRad;
    private String habilitado;
    @Column(name = "usaplaca")
    private String usaplaca;
    private String recomendaciones;
    @Column(name = "derutinaguardia")
    private String deRutinaGuardia;
    @Column(name = "derutinaguardiadbv")
    private String deRutinaGuardiaDbv;

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getCodigoOms() {
        return codigoOms;
    }

    public void setCodigoOms(Integer codigoOms) {
        this.codigoOms = codigoOms;
    }

    public Integer getUnidadEsRad() {
        return unidadEsRad;
    }

    public void setUnidadEsRad(Integer unidadEsRad) {
        this.unidadEsRad = unidadEsRad;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public String getUsaplaca() {
        return usaplaca;
    }

    public void setUsaplaca(String usaplaca) {
        this.usaplaca = usaplaca;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getDeRutinaGuardia() {
        return deRutinaGuardia;
    }

    public void setDeRutinaGuardia(String deRutinaGuardia) {
        this.deRutinaGuardia = deRutinaGuardia;
    }

    public String getDeRutinaGuardiaDbv() {
        return deRutinaGuardiaDbv;
    }

    public void setDeRutinaGuardiaDbv(String deRutinaGuardiaDbv) {
        this.deRutinaGuardiaDbv = deRutinaGuardiaDbv;
    }
}
