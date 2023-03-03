package com.example.demo.entity.schemas.libretasSanitarias;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "libreta", schema = "libretassanitarias")
public class Libreta {
    @Id
    @Column(name = "numerolibreta")
    private Integer numeroLibreta;
    private Integer idpaciente;
    private String observaciones;
    @Column(name = "fechacursoma")
    private Date fechaCursoMa;
    @Column(name = "fechadosis1att")
    private Date fechaDosis1att;
    @Column(name = "fechadosis2att")
    private Date fechaDosis2att;
    @Column(name = "fechadosis3att")
    private Date fechadosis3att;
    private String estado;
    @Column(name = "motivoanulacion")
    private String motivoAnulacion;
    @Column(name = "fechaanulacion")
    private Date fechaAnulacion;

    public Integer getNumeroLibreta() {
        return numeroLibreta;
    }

    public void setNumeroLibreta(Integer numeroLibreta) {
        this.numeroLibreta = numeroLibreta;
    }

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaCursoMa() {
        return fechaCursoMa;
    }

    public void setFechaCursoMa(Date fechaCursoMa) {
        this.fechaCursoMa = fechaCursoMa;
    }

    public Date getFechaDosis1att() {
        return fechaDosis1att;
    }

    public void setFechaDosis1att(Date fechaDosis1att) {
        this.fechaDosis1att = fechaDosis1att;
    }

    public Date getFechaDosis2att() {
        return fechaDosis2att;
    }

    public void setFechaDosis2att(Date fechaDosis2att) {
        this.fechaDosis2att = fechaDosis2att;
    }

    public Date getFechadosis3att() {
        return fechadosis3att;
    }

    public void setFechadosis3att(Date fechadosis3att) {
        this.fechadosis3att = fechadosis3att;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    public Date getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(Date fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }
}
