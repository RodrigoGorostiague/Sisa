package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "consultorio", schema = "turnos")
public class Consultorio {
    @EmbeddedId
    private ConsultorioPK id;
    private Integer consultorio;
    @Column(name = "codigotipoatencion")
    private String codigoTipoAtencion;
    private Integer duracion;
    private String observacion;
    @Column(name = "fechafin")
    private Date fechaFin;
    private String genera;
    private String eliminado;
    private String modo;
    @Column(name = "permiteasignarturnodiavencido")
    private  String permiteAsignarTurnoDiaVencido;
    @Column(name = "permiteasignacionturnolibreprofesional")
    private String permiteAsignacionTurnoLibreProfesional;
    @Column(name = "limiteturconobsoc")
    private Integer limiteTurConObSoc;
    @Column(name = "atiendeotrloc")
    private String atiendeOtrLoc;

    public ConsultorioPK getId() {
        return id;
    }

    public void setId(ConsultorioPK id) {
        this.id = id;
    }

    public Integer getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Integer consultorio) {
        this.consultorio = consultorio;
    }

    public String getCodigoTipoAtencion() {
        return codigoTipoAtencion;
    }

    public void setCodigoTipoAtencion(String codigoTipoAtencion) {
        this.codigoTipoAtencion = codigoTipoAtencion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getGenera() {
        return genera;
    }

    public void setGenera(String genera) {
        this.genera = genera;
    }

    public String getEliminado() {
        return eliminado;
    }

    public void setEliminado(String eliminado) {
        this.eliminado = eliminado;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getPermiteAsignarTurnoDiaVencido() {
        return permiteAsignarTurnoDiaVencido;
    }

    public void setPermiteAsignarTurnoDiaVencido(String permiteAsignarTurnoDiaVencido) {
        this.permiteAsignarTurnoDiaVencido = permiteAsignarTurnoDiaVencido;
    }

    public String getPermiteAsignacionTurnoLibreProfesional() {
        return permiteAsignacionTurnoLibreProfesional;
    }

    public void setPermiteAsignacionTurnoLibreProfesional(String permiteAsignacionTurnoLibreProfesional) {
        this.permiteAsignacionTurnoLibreProfesional = permiteAsignacionTurnoLibreProfesional;
    }

    public Integer getLimiteTurConObSoc() {
        return limiteTurConObSoc;
    }

    public void setLimiteTurConObSoc(Integer limiteTurConObSoc) {
        this.limiteTurConObSoc = limiteTurConObSoc;
    }

    public String getAtiendeOtrLoc() {
        return atiendeOtrLoc;
    }

    public void setAtiendeOtrLoc(String atiendeOtrLoc) {
        this.atiendeOtrLoc = atiendeOtrLoc;
    }
}
