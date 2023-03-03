package com.example.demo.entity.schemas.libretasSanitarias;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class LineasLibretaPK implements Serializable {
    @Column(name = "numerolibreta")
    private Integer numeroLibreta;
    @Column(name = "fechainiciotramite")
    private Date fechaInicioTramite;
    @Column(name = "codigoempresa")
    private String codigoEmpresa;

    public Integer getNumeroLibreta() {
        return numeroLibreta;
    }

    public void setNumeroLibreta(Integer numeroLibreta) {
        this.numeroLibreta = numeroLibreta;
    }

    public Date getFechaInicioTramite() {
        return fechaInicioTramite;
    }

    public void setFechaInicioTramite(Date fechaInicioTramite) {
        this.fechaInicioTramite = fechaInicioTramite;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
}
