package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lugar", schema = "derivaciones")
public class Lugar {
    @Id
    private String codigo;
    private String descripcion;
    private String domicilio;
    private String localidad;
    private String provincia;
    @Column(name = "codigoPostal")
    private String codigopostal;
    private String telefono;
    @Column(name = "tipoestablecimiento")
    private String tipoEstablecimiento;
    private String vigiente;
    private String local;
    private String internacion;
    private String contacto;
    private String observaciones;
    @Column(name = "zonasanitariabsas")
    private String zonaSanitariaBsAs;

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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoEstablecimiento() {
        return tipoEstablecimiento;
    }

    public void setTipoEstablecimiento(String tipoEstablecimiento) {
        this.tipoEstablecimiento = tipoEstablecimiento;
    }

    public String getVigiente() {
        return vigiente;
    }

    public void setVigiente(String vigiente) {
        this.vigiente = vigiente;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getInternacion() {
        return internacion;
    }

    public void setInternacion(String internacion) {
        this.internacion = internacion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getZonaSanitariaBsAs() {
        return zonaSanitariaBsAs;
    }

    public void setZonaSanitariaBsAs(String zonaSanitariaBsAs) {
        this.zonaSanitariaBsAs = zonaSanitariaBsAs;
    }
}
