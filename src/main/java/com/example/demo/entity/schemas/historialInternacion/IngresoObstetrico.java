package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;


@Entity
@Table(schema = "historialinternacion", name = "ingresoobstetrico")
public class IngresoObstetrico {
    @EmbeddedId
    private IngresoObstetricoPK id;
    private Date fum;
    private Date fpp;
    private Integer partos;
    private Integer embarazons;
    private Integer cesareas;
    private Integer abortos;
    @Column(name = "causas_ces")
    private String causasCes;
    @Column(name = "controlembarazo")
    private String controlEmbarazo;
    @Column(name = "controlembarazo_lugar")
    private String controlEmbarazoLugar;
    @Column(name = "semanas_gestacion")
    private Integer semanasGestacion;
    @Column(name = "dias_gestacion")
    private Integer diasGestacion;
    @Column(name = "embarazos_ectopicos")
    private Integer embarazosEctopicos;
    @Column(name = "enf_trofo_gest")
    private Integer enfTrofoGest;
    @Column(name = "cant_consultas_antenatales")
    private Integer cantConsultasAntenatales;

    public IngresoObstetricoPK getId() {
        return id;
    }

    public void setId(IngresoObstetricoPK id) {
        this.id = id;
    }

    public Date getFum() {
        return fum;
    }

    public void setFum(Date fum) {
        this.fum = fum;
    }

    public Date getFpp() {
        return fpp;
    }

    public void setFpp(Date fpp) {
        this.fpp = fpp;
    }

    public Integer getPartos() {
        return partos;
    }

    public void setPartos(Integer partos) {
        this.partos = partos;
    }

    public Integer getEmbarazons() {
        return embarazons;
    }

    public void setEmbarazons(Integer embarazons) {
        this.embarazons = embarazons;
    }

    public Integer getCesareas() {
        return cesareas;
    }

    public void setCesareas(Integer cesareas) {
        this.cesareas = cesareas;
    }

    public Integer getAbortos() {
        return abortos;
    }

    public void setAbortos(Integer abortos) {
        this.abortos = abortos;
    }

    public String getCausasCes() {
        return causasCes;
    }

    public void setCausasCes(String causasCes) {
        this.causasCes = causasCes;
    }

    public String getControlEmbarazo() {
        return controlEmbarazo;
    }

    public void setControlEmbarazo(String controlEmbarazo) {
        this.controlEmbarazo = controlEmbarazo;
    }

    public String getControlEmbarazoLugar() {
        return controlEmbarazoLugar;
    }

    public void setControlEmbarazoLugar(String controlEmbarazoLugar) {
        this.controlEmbarazoLugar = controlEmbarazoLugar;
    }

    public Integer getSemanasGestacion() {
        return semanasGestacion;
    }

    public void setSemanasGestacion(Integer semanasGestacion) {
        this.semanasGestacion = semanasGestacion;
    }

    public Integer getDiasGestacion() {
        return diasGestacion;
    }

    public void setDiasGestacion(Integer diasGestacion) {
        this.diasGestacion = diasGestacion;
    }

    public Integer getEmbarazosEctopicos() {
        return embarazosEctopicos;
    }

    public void setEmbarazosEctopicos(Integer embarazosEctopicos) {
        this.embarazosEctopicos = embarazosEctopicos;
    }

    public Integer getEnfTrofoGest() {
        return enfTrofoGest;
    }

    public void setEnfTrofoGest(Integer enfTrofoGest) {
        this.enfTrofoGest = enfTrofoGest;
    }

    public Integer getCantConsultasAntenatales() {
        return cantConsultasAntenatales;
    }

    public void setCantConsultasAntenatales(Integer cantConsultasAntenatales) {
        this.cantConsultasAntenatales = cantConsultasAntenatales;
    }
}
