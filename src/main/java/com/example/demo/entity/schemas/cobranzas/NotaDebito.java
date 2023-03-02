package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "cobranzas", name = "nota_debito")
public class NotaDebito {
    @EmbeddedId
    private NotaDebitoPK id;
    private Date fecha;
    @Column(name = "sucresumen")
    private String sucResumen;
    @Column(name = "nroresumen")
    private Integer nroResumen;
    @Column(name = "amb_int")
    private String ambInt;
     @Column(name = "creditoen")
    private String creditoEn;
     private String detalle;
     private String estado;
     @Column(name = "nro_cobro")
     private Integer nroCobro;

    public NotaDebitoPK getId() {
        return id;
    }

    public void setId(NotaDebitoPK id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSucResumen() {
        return sucResumen;
    }

    public void setSucResumen(String sucResumen) {
        this.sucResumen = sucResumen;
    }

    public Integer getNroResumen() {
        return nroResumen;
    }

    public void setNroResumen(Integer nroResumen) {
        this.nroResumen = nroResumen;
    }

    public String getAmbInt() {
        return ambInt;
    }

    public void setAmbInt(String ambInt) {
        this.ambInt = ambInt;
    }

    public String getCreditoEn() {
        return creditoEn;
    }

    public void setCreditoEn(String creditoEn) {
        this.creditoEn = creditoEn;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNroCobro() {
        return nroCobro;
    }

    public void setNroCobro(Integer nroCobro) {
        this.nroCobro = nroCobro;
    }
}
