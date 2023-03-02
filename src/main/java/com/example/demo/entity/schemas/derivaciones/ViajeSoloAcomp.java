package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "derivaciones", name = "viajesoloacomp")
public class ViajeSoloAcomp {
    @EmbeddedId
    private ViajeSoloAcompPK id;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "apynoacomp")
    private String apellidoyNombreAcomp;
    private String domicilio;
    private String destino;
    private String medio;
    private String observaciones;

    public ViajeSoloAcompPK getId() {
        return id;
    }

    public void setId(ViajeSoloAcompPK id) {
        this.id = id;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getApellidoyNombreAcomp() {
        return apellidoyNombreAcomp;
    }

    public void setApellidoyNombreAcomp(String apellidoyNombreAcomp) {
        this.apellidoyNombreAcomp = apellidoyNombreAcomp;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
