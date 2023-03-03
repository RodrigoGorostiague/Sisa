package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "establecimientos", schema = "resapro")
public class Establecimientos {
    @Id
    @Column(name = "codestable")
    private String codEstable;
    @Column(name = "codpartido")
    private String codPartido;
    private String descestable;
    @Column(name = "nivelcomplej")
    private String nivelComplej;
    private String dependencia;
    @Column(name = "apyndirector")
    private String apellidoNombreDirector;
    @Column(name = "fecha_modi")
    private Date fechaModi;
    private String region;
    private String telefono;
    private String email;
    @Column(name = "desclocalidad")
    private String descLocalidad;
    @Column(name = "locali_id")
    private String localiId;
    private String codigo;
    private String domicilio;
    @Column(name = "codpostal")
    private String codigoPostal;
    private String camas;
    @Column(name = "opreacion_modi")
    private String opreacionModi;
    @Column(name = "codigo_sisa")
    private String codigoSisa;
    @Column(name = "sisa_habilitado")
    private String sisaHabilitado;
    @Column(name = "codigo_uniat")
    private String codigoUniat;

    public String getCodEstable() {
        return codEstable;
    }

    public void setCodEstable(String codEstable) {
        this.codEstable = codEstable;
    }

    public String getCodPartido() {
        return codPartido;
    }

    public void setCodPartido(String codPartido) {
        this.codPartido = codPartido;
    }

    public String getDescestable() {
        return descestable;
    }

    public void setDescestable(String descestable) {
        this.descestable = descestable;
    }

    public String getNivelComplej() {
        return nivelComplej;
    }

    public void setNivelComplej(String nivelComplej) {
        this.nivelComplej = nivelComplej;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getApellidoNombreDirector() {
        return apellidoNombreDirector;
    }

    public void setApellidoNombreDirector(String apellidoNombreDirector) {
        this.apellidoNombreDirector = apellidoNombreDirector;
    }

    public Date getFechaModi() {
        return fechaModi;
    }

    public void setFechaModi(Date fechaModi) {
        this.fechaModi = fechaModi;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescLocalidad() {
        return descLocalidad;
    }

    public void setDescLocalidad(String descLocalidad) {
        this.descLocalidad = descLocalidad;
    }

    public String getLocaliId() {
        return localiId;
    }

    public void setLocaliId(String localiId) {
        this.localiId = localiId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCamas() {
        return camas;
    }

    public void setCamas(String camas) {
        this.camas = camas;
    }

    public String getOpreacionModi() {
        return opreacionModi;
    }

    public void setOpreacionModi(String opreacionModi) {
        this.opreacionModi = opreacionModi;
    }

    public String getCodigoSisa() {
        return codigoSisa;
    }

    public void setCodigoSisa(String codigoSisa) {
        this.codigoSisa = codigoSisa;
    }

    public String getSisaHabilitado() {
        return sisaHabilitado;
    }

    public void setSisaHabilitado(String sisaHabilitado) {
        this.sisaHabilitado = sisaHabilitado;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }
}
