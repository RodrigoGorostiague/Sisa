package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "perfil", schema = "paciente")
public class Perfil {
    @Id
    @OneToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @Column(name = "fechaactualizacion")
    private LocalDateTime fechaActualizacion;
    private String observaciones;
    @Column(name = "idestadocivil")
    private String idEstadoCivil;
    @ManyToOne
    @JoinColumn(name = "idinstruccion", referencedColumnName = "idinstruccion")
    private Instruccion instruccion;
    @ManyToOne
    @JoinColumn(name = "idcondicionactividad", referencedColumnName = "idcondicionactividad")
    private CondicionAtividad condicionAtividad;
    @Column(name = "idconexionagua")
    private String idConexionAgua;
    @Column(name = "idexcreta")
    private String idExcreta;
    @ManyToOne
    @JoinColumn(name = "idplansocial", referencedColumnName = "idplansocial")
    private PlanSocial planSocial;
    private String ocupacion;
    @Column(name = "idtipotrabajo")
    private Integer idTipoTrabajo;
    @Column(name = "idcondactividadpadre")
    private Integer idCondActividadPadre;
    @Column(name = "idtipotrabajopadre")
    private Integer idTipoTrabajoPadre;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(String idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Instruccion getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(Instruccion instruccion) {
        this.instruccion = instruccion;
    }

    public CondicionAtividad getCondicionAtividad() {
        return condicionAtividad;
    }

    public void setCondicionAtividad(CondicionAtividad condicionAtividad) {
        this.condicionAtividad = condicionAtividad;
    }

    public String getIdConexionAgua() {
        return idConexionAgua;
    }

    public void setIdConexionAgua(String idConexionAgua) {
        this.idConexionAgua = idConexionAgua;
    }

    public String getIdExcreta() {
        return idExcreta;
    }

    public void setIdExcreta(String idExcreta) {
        this.idExcreta = idExcreta;
    }

    public PlanSocial getPlanSocial() {
        return planSocial;
    }

    public void setPlanSocial(PlanSocial planSocial) {
        this.planSocial = planSocial;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getIdTipoTrabajo() {
        return idTipoTrabajo;
    }

    public void setIdTipoTrabajo(Integer idTipoTrabajo) {
        this.idTipoTrabajo = idTipoTrabajo;
    }

    public Integer getIdCondActividadPadre() {
        return idCondActividadPadre;
    }

    public void setIdCondActividadPadre(Integer idCondActividadPadre) {
        this.idCondActividadPadre = idCondActividadPadre;
    }

    public Integer getIdTipoTrabajoPadre() {
        return idTipoTrabajoPadre;
    }

    public void setIdTipoTrabajoPadre(Integer idTipoTrabajoPadre) {
        this.idTipoTrabajoPadre = idTipoTrabajoPadre;
    }
}
