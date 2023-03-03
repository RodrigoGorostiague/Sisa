package com.example.demo.entity.schemas.libretasSanitarias;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa", schema = "libretassanitarias")
public class Empresa {
    @Id
    @Column(name = "codigoempresa")
    private String codigoEmpresa;
    private String nombre;
    private String domicilio;
    private String telefono;
    @Column(name = "codigolocalidad")
    private Integer codigoLocalidad;
    @Column(name = "codigopartido")
    private Integer codigoPartido;
    private String lugar;
    @Column(name = "codigorubro")
    private Integer codigoRubro;

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(Integer codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
    }

    public Integer getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(Integer codigoPartido) {
        this.codigoPartido = codigoPartido;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getCodigoRubro() {
        return codigoRubro;
    }

    public void setCodigoRubro(Integer codigoRubro) {
        this.codigoRubro = codigoRubro;
    }
}
