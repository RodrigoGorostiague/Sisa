package com.example.demo.entity.schemas.organizacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unidadatencion", schema = "organizacion")
public class UnidadAtencion {
    @Id
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "nombreua")
    private String nombreUa;
    private String domicilio;
    @Column(name = "codigopostal")
    private String codigoPostal;
    private String telefono;
    private String descripcion;
    @Column(name = "codigozonasanitaria")
    private String codigoZonaSanitaria;
    @Column(name = "codigoorganismo")
    private String codigoOrganismo;
    @Column(name = "codigopartido")
    private Integer codigoPartido;
    @Column(name = "codigolocalidad")
    private Integer codigoLocalidad;
    private String tipo;
    private String mail;
    @Column(name = "codigoefector")
    private String codigoEfector;
    @Column(name = "estadoua")
    private String estadoUa;
    @Column(name = "codigointernosisanacion")
    private Integer codigoInternoSisaNacion;

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public String getNombreUa() {
        return nombreUa;
    }

    public void setNombreUa(String nombreUa) {
        this.nombreUa = nombreUa;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoZonaSanitaria() {
        return codigoZonaSanitaria;
    }

    public void setCodigoZonaSanitaria(String codigoZonaSanitaria) {
        this.codigoZonaSanitaria = codigoZonaSanitaria;
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public Integer getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(Integer codigoPartido) {
        this.codigoPartido = codigoPartido;
    }

    public Integer getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(Integer codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCodigoEfector() {
        return codigoEfector;
    }

    public void setCodigoEfector(String codigoEfector) {
        this.codigoEfector = codigoEfector;
    }

    public String getEstadoUa() {
        return estadoUa;
    }

    public void setEstadoUa(String estadoUa) {
        this.estadoUa = estadoUa;
    }

    public Integer getCodigoInternoSisaNacion() {
        return codigoInternoSisaNacion;
    }

    public void setCodigoInternoSisaNacion(Integer codigoInternoSisaNacion) {
        this.codigoInternoSisaNacion = codigoInternoSisaNacion;
    }
}
