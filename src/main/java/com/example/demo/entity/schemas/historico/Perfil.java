package com.example.demo.entity.schemas.historico;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "perfil", schema = "historialuti")
public class Perfil {
    @EmbeddedId
    private PerfilPK id;
    private String observaciones;
    @Column(name = "idestadocivil")
    private String idEstadoCivil;
    @Column(name = "idinstruccion")
    private Integer idInstruccion;
    @Column(name = "idcondicionactividad")
    private Integer idCondicionActividad;
    @Column(name = "idconexionagua")
    private String idConexionAgua;
    @Column(name = "idexcreta")
    private String idExcreta;
    @Column(name = "idplansocial")
    private String idPlanSocial;
    @Column(name = "idtipotrabajo")
    private Integer idTipoTrabajo;
    private String ocupacion;
    @Column(name = "idcondactividadpadre")
    private Integer idCondActividadPadre;
    @Column(name = "idtipotrabajopadre")
    private Integer idTipoTrabajoPadre;

    public PerfilPK getId() {
        return id;
    }

    public void setId(PerfilPK id) {
        this.id = id;
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

    public Integer getIdInstruccion() {
        return idInstruccion;
    }

    public void setIdInstruccion(Integer idInstruccion) {
        this.idInstruccion = idInstruccion;
    }

    public Integer getIdCondicionActividad() {
        return idCondicionActividad;
    }

    public void setIdCondicionActividad(Integer idCondicionActividad) {
        this.idCondicionActividad = idCondicionActividad;
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

    public String getIdPlanSocial() {
        return idPlanSocial;
    }

    public void setIdPlanSocial(String idPlanSocial) {
        this.idPlanSocial = idPlanSocial;
    }

    public Integer getIdTipoTrabajo() {
        return idTipoTrabajo;
    }

    public void setIdTipoTrabajo(Integer idTipoTrabajo) {
        this.idTipoTrabajo = idTipoTrabajo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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
