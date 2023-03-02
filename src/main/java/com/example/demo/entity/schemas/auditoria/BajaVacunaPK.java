package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class BajaVacunaPK implements Serializable {
    @Column(name = "fechaoperacion")
    private LocalDateTime fechaOperacion;
    private String usuario;
    @Column(name = "codigoUniat")
    private String codigouniat;
    @Column(name = "codigovacuna")
    private String codigoVacuna;
    @Column(name = "numlote")
    private String numeroLote;
    @Column(name = "fechabaja")
    private Date fechaBaja;

    public LocalDateTime getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(LocalDateTime fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCodigouniat() {
        return codigouniat;
    }

    public void setCodigouniat(String codigouniat) {
        this.codigouniat = codigouniat;
    }

    public String getCodigoVacuna() {
        return codigoVacuna;
    }

    public void setCodigoVacuna(String codigoVacuna) {
        this.codigoVacuna = codigoVacuna;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}
