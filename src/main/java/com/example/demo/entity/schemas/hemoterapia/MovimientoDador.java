package com.example.demo.entity.schemas.hemoterapia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "movimientodador", schema = "hemoterapia")
public class MovimientoDador {
    @Id
    @Column(name = "nrodonacion")
    private String  nroDonacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "tiposerologia")
    private String tipoSerologia;
    private String abo;
    private String rh;
    @Column(name = "fenoTipo")
    private String fenotipo;
    @Column(name = "tipodonante")
    private String tipoDonante;
    @Column(name = "hcdestino")
    private String hcDestino;
    @Column(name = "malaredvenosa")
    private String malaRedVenosa;
    private String lipotimia;
    @Column(name = "nodono")
    private String noDono;
    @Column(name = "autoexclusion")
    private String autoExclusion;
    private String observacion;
    @Column(name = "medulaosea")
    private String medulaOsea;
    private String colecta;

    public String getNroDonacion() {
        return nroDonacion;
    }

    public void setNroDonacion(String nroDonacion) {
        this.nroDonacion = nroDonacion;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getTipoSerologia() {
        return tipoSerologia;
    }

    public void setTipoSerologia(String tipoSerologia) {
        this.tipoSerologia = tipoSerologia;
    }

    public String getAbo() {
        return abo;
    }

    public void setAbo(String abo) {
        this.abo = abo;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getFenotipo() {
        return fenotipo;
    }

    public void setFenotipo(String fenotipo) {
        this.fenotipo = fenotipo;
    }

    public String getTipoDonante() {
        return tipoDonante;
    }

    public void setTipoDonante(String tipoDonante) {
        this.tipoDonante = tipoDonante;
    }

    public String getHcDestino() {
        return hcDestino;
    }

    public void setHcDestino(String hcDestino) {
        this.hcDestino = hcDestino;
    }

    public String getMalaRedVenosa() {
        return malaRedVenosa;
    }

    public void setMalaRedVenosa(String malaRedVenosa) {
        this.malaRedVenosa = malaRedVenosa;
    }

    public String getLipotimia() {
        return lipotimia;
    }

    public void setLipotimia(String lipotimia) {
        this.lipotimia = lipotimia;
    }

    public String getNoDono() {
        return noDono;
    }

    public void setNoDono(String noDono) {
        this.noDono = noDono;
    }

    public String getAutoExclusion() {
        return autoExclusion;
    }

    public void setAutoExclusion(String autoExclusion) {
        this.autoExclusion = autoExclusion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getMedulaOsea() {
        return medulaOsea;
    }

    public void setMedulaOsea(String medulaOsea) {
        this.medulaOsea = medulaOsea;
    }

    public String getColecta() {
        return colecta;
    }

    public void setColecta(String colecta) {
        this.colecta = colecta;
    }
}
