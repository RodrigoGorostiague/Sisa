package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "cobranzas", name = "devol_cobro")
public class DevolCobro {
    @Id
    @Column(name = "nro_devol")
    private Integer nroDevol;
    private String sucursal;
    @Column(name = "nro_cobro")
    private Integer nroCobro;
    private  Double importe;
    private Date fecha;
    private String decripcion;
    @Column(name = "t_comprob")
    private String TComprob;
    @Column(name = "n_comprob")
    private Integer NComprob;

    public Integer getNroDevol() {
        return nroDevol;
    }

    public void setNroDevol(Integer nroDevol) {
        this.nroDevol = nroDevol;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getNroCobro() {
        return nroCobro;
    }

    public void setNroCobro(Integer nroCobro) {
        this.nroCobro = nroCobro;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public String getTComprob() {
        return TComprob;
    }

    public void setTComprob(String TComprob) {
        this.TComprob = TComprob;
    }

    public Integer getNComprob() {
        return NComprob;
    }

    public void setNComprob(Integer NComprob) {
        this.NComprob = NComprob;
    }
}
