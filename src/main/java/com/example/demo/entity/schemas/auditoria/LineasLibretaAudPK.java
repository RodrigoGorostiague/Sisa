package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class LineasLibretaAudPK implements Serializable {
    private Date fecha;
    private String usuario;
    private LocalDateTime hora;
    @Column(name = "numerolibreta")
    private Integer numeroLibreta;
    @Column(name = "fechainiciotramite")
    private Date fechaInicioTramite;
    @Column(name = "codigoempresa")
    private String codigoEmpresa;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

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
