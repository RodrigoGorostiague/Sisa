package com.example.demo.entity.schemas.facturacionNew;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sucursal", schema = "facturacion_new")
public class Sucursal {
    @Id
    private String  codigo;
    private String nombre;
    private String uniat;
    private String tipo;
    @Column(name = "ultnro_fac")
    private Integer ultNroFac;
    @Column(name = "ultnro_prefac")
    private Integer ultNroPreFac;
    @Column(name = "ultnro_presup")
    private Integer ultNroPreSup;
    @Column(name = "transf_factura")
    private String transfFactura;
    private String observaciones;
    private String habilitada;
    @Column(name = "ultnro_compaux")
    private Integer ultNroCompaux;
    @Column(name = "ultnro_resumen")
    private Integer ultNroResumen;
    @Column(name = "bloqueado_fac")
    private String bloqueadoFac;
    @Column(name = "bloqueado_prefac")
    private String bloqueadoPreFac;
    @Column(name = "bloqueado_presup")
    private String bloqueadoPreSup;
    @Column(name = "bloqueado_compaux")
    private String bloqueadoCompAux;
    @Column(name = "bloqueado_resumen")
    private String bloqueadoResumen;
    @Column(name = "comprobaux")
    private String comprobAux;
    @Column(name = "ultnro_nc")
    private Integer ultnroNc;
    @Column(name = "ultnro_nd")
    private Integer ultnroNd;
    @Column(name = "bloqueado_nc")
    private String bloqueadoNc;
    @Column(name = "bloqueado_nd")
    private String bloqueadoNd;
    @Column(name = "caeafip")
    private String caeAfip;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getUltNroFac() {
        return ultNroFac;
    }

    public void setUltNroFac(Integer ultNroFac) {
        this.ultNroFac = ultNroFac;
    }

    public Integer getUltNroPreFac() {
        return ultNroPreFac;
    }

    public void setUltNroPreFac(Integer ultNroPreFac) {
        this.ultNroPreFac = ultNroPreFac;
    }

    public Integer getUltNroPreSup() {
        return ultNroPreSup;
    }

    public void setUltNroPreSup(Integer ultNroPreSup) {
        this.ultNroPreSup = ultNroPreSup;
    }

    public String getTransfFactura() {
        return transfFactura;
    }

    public void setTransfFactura(String transfFactura) {
        this.transfFactura = transfFactura;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getHabilitada() {
        return habilitada;
    }

    public void setHabilitada(String habilitada) {
        this.habilitada = habilitada;
    }

    public Integer getUltNroCompaux() {
        return ultNroCompaux;
    }

    public void setUltNroCompaux(Integer ultNroCompaux) {
        this.ultNroCompaux = ultNroCompaux;
    }

    public Integer getUltNroResumen() {
        return ultNroResumen;
    }

    public void setUltNroResumen(Integer ultNroResumen) {
        this.ultNroResumen = ultNroResumen;
    }

    public String getBloqueadoFac() {
        return bloqueadoFac;
    }

    public void setBloqueadoFac(String bloqueadoFac) {
        this.bloqueadoFac = bloqueadoFac;
    }

    public String getBloqueadoPreFac() {
        return bloqueadoPreFac;
    }

    public void setBloqueadoPreFac(String bloqueadoPreFac) {
        this.bloqueadoPreFac = bloqueadoPreFac;
    }

    public String getBloqueadoPreSup() {
        return bloqueadoPreSup;
    }

    public void setBloqueadoPreSup(String bloqueadoPreSup) {
        this.bloqueadoPreSup = bloqueadoPreSup;
    }

    public String getBloqueadoCompAux() {
        return bloqueadoCompAux;
    }

    public void setBloqueadoCompAux(String bloqueadoCompAux) {
        this.bloqueadoCompAux = bloqueadoCompAux;
    }

    public String getBloqueadoResumen() {
        return bloqueadoResumen;
    }

    public void setBloqueadoResumen(String bloqueadoResumen) {
        this.bloqueadoResumen = bloqueadoResumen;
    }

    public String getComprobAux() {
        return comprobAux;
    }

    public void setComprobAux(String comprobAux) {
        this.comprobAux = comprobAux;
    }

    public Integer getUltnroNc() {
        return ultnroNc;
    }

    public void setUltnroNc(Integer ultnroNc) {
        this.ultnroNc = ultnroNc;
    }

    public Integer getUltnroNd() {
        return ultnroNd;
    }

    public void setUltnroNd(Integer ultnroNd) {
        this.ultnroNd = ultnroNd;
    }

    public String getBloqueadoNc() {
        return bloqueadoNc;
    }

    public void setBloqueadoNc(String bloqueadoNc) {
        this.bloqueadoNc = bloqueadoNc;
    }

    public String getBloqueadoNd() {
        return bloqueadoNd;
    }

    public void setBloqueadoNd(String bloqueadoNd) {
        this.bloqueadoNd = bloqueadoNd;
    }

    public String getCaeAfip() {
        return caeAfip;
    }

    public void setCaeAfip(String caeAfip) {
        this.caeAfip = caeAfip;
    }
}
