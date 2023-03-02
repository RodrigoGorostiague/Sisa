package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "admsistema", name = "modulo")
public class Modulo {
    @Id
    @Column(name = "idmodulo")
    private String idModulo;
    private String nombre;
    @Column(name = "descripcionlarga")
    private String descripcionLarga;
    private String accion;
    private Integer orden;
    @OneToMany(mappedBy = "id.modulo")
    private List<Parametros> parametros;
    @OneToMany(mappedBy = "modulo")
    private List<Menu> menus;
    @OneToMany(mappedBy = "id.idModulo")
    private List<CierraSistema> cierraSistemas;
    @OneToMany(mappedBy = "id.idModulos")
    private List<ModuloTabla> moduloTablas;
    @OneToMany(mappedBy = "modulos")
    private List<UsuariosSinBusqPac> usuariosSinBusqPacs;

    public List<UsuariosSinBusqPac> getUsuariosSinBusqPacs() {
        return usuariosSinBusqPacs;
    }

    public void setUsuariosSinBusqPacs(List<UsuariosSinBusqPac> usuariosSinBusqPacs) {
        this.usuariosSinBusqPacs = usuariosSinBusqPacs;
    }

    public List<ModuloTabla> getModuloTablas() {
        return moduloTablas;
    }

    public void setModuloTablas(List<ModuloTabla> moduloTablas) {
        this.moduloTablas = moduloTablas;
    }

    public List<CierraSistema> getCierraSistemas() {
        return cierraSistemas;
    }

    public void setCierraSistemas(List<CierraSistema> cierraSistemas) {
        this.cierraSistemas = cierraSistemas;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Parametros> getParametros() {
        return parametros;
    }

    public void setParametros(List<Parametros> parametros) {
        this.parametros = parametros;
    }

    public String getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(String idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
