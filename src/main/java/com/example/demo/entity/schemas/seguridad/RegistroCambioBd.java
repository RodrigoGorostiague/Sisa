package com.example.demo.entity.schemas.seguridad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "registrocambiobd", schema = "seguridad")
public class RegistroCambioBd {
    @Id
    @Column(name = "nregistro")
    private Integer nRegistro;
    @Column(name = "ffecha")
    private LocalDateTime fFecha;
    @Column(name = "dnombrearchivo")
    private String dNombreArchivo;
    @Column(name = "dversionaplicacion")
    private String dVersionAplicacion;
    @Column(name = "dregistro")
    private String dRegistro;

    public Integer getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(Integer nRegistro) {
        this.nRegistro = nRegistro;
    }

    public LocalDateTime getfFecha() {
        return fFecha;
    }

    public void setfFecha(LocalDateTime fFecha) {
        this.fFecha = fFecha;
    }

    public String getdNombreArchivo() {
        return dNombreArchivo;
    }

    public void setdNombreArchivo(String dNombreArchivo) {
        this.dNombreArchivo = dNombreArchivo;
    }

    public String getdVersionAplicacion() {
        return dVersionAplicacion;
    }

    public void setdVersionAplicacion(String dVersionAplicacion) {
        this.dVersionAplicacion = dVersionAplicacion;
    }

    public String getdRegistro() {
        return dRegistro;
    }

    public void setdRegistro(String dRegistro) {
        this.dRegistro = dRegistro;
    }
}
