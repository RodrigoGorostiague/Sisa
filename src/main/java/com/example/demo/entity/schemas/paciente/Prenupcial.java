package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "prenupcial", schema = "paciente")
public class Prenupcial {
    @EmbeddedId
    private PrenupcialPK id;
    @Column(name = "fechapresentacion")
    private Date fechaPresentacion;
    @Column(name = "fecharetiro")
    private Date fechaRetiro;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    private String transferido;

    public PrenupcialPK getId() {
        return id;
    }

    public void setId(PrenupcialPK id) {
        this.id = id;
    }

    public Date getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(Date fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getTransferido() {
        return transferido;
    }

    public void setTransferido(String transferido) {
        this.transferido = transferido;
    }
}
