package com.example.demo.entity.schemas.organizacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "organismo", schema = "organizacion")
public class Organismo {
    @Id
    @Column(name = "codigoorganismo")
    private String codigoOrganismo;
    @Column(name = "nombreorganismo")
    private String nombreOrganismo;
    private String domicilio;
    @Column(name = "codigopostal")
    private String codigoPostal;
    private String telefono;
    private String descripcion;
    @Column(name = "codigopartido")
    private Integer codigoPartido;
    @Column(name = "codigolocalidad")
    private Integer codigoLocalidad;
    private String logo;
    @Column(name = "estadoor")
    private String estadoOr;

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getNombreOrganismo() {
        return nombreOrganismo;
    }

    public void setNombreOrganismo(String nombreOrganismo) {
        this.nombreOrganismo = nombreOrganismo;
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getEstadoOr() {
        return estadoOr;
    }

    public void setEstadoOr(String estadoOr) {
        this.estadoOr = estadoOr;
    }
}
