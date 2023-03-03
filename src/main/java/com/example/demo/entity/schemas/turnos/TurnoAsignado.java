package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "turnoasignado", schema = "turnos")
public class TurnoAsignado {
    @EmbeddedId
    private TurnoAsignadoPK id;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "codigoobrasocial")
    private Integer codigoObraSocial;
    @Column(name = "numeroafiliadoos")
    private String numeroAfiliadoOs;
    private Integer importe;
    private String confirmado;
    private String observaciones;
    @Column(name = "idestadoatencion")
    private String idEstadoAtencion;
    @Column(name = "uniatinterconsulta")
    private String uniatInterconsulta;
    @Column(name = "profinterconsulta")
    private String profInterconsulta;
    private String certificado;
    @Column(name = "codigoseguro")
    private  Integer codigoSeguro;
    @Column(name = "numeropoliza")
    private Integer numeroPoliza;
    @Column(name = "codigoart")
    private Integer codigoArt;
    @Column(name = "codigomediootorgamiento")
    private String codigoMedioOtorgamiento;
    @Column(name = "codigotipoturno")
    private String codigoTipoTurno;
    @Column(name = "apyno")
    private String apellidonombre;
    private Integer edad;
    private String sexo;
    @Column(name = "tipoedad")
    private String tipoEdad;
    @Column(name = "profesionalactuante")
    private String profesionalActuante;
    @Column(name = "fechaatencion")
    private Date fechaAtencion;
    @Column(name = "codigopartidoresidencia")
    private Integer codigoPartidoResidencia;
    @Column(name = "codigolocalidadresidencia")
    private Integer codigoLocalidadResidencia;
    @Column(name = "codigocupo")
    private String codigoCupo;
    @Column(name = "codigotipoatencion")
    private String codigoTipoAtencion;
    private Integer consultorio;
    private String interconsulta;
    @Column(name = "uasolicitante")
    private String uaSolicitante;
    @Column(name = "horaturno")
    private LocalDateTime horaTurno;
    @Column(name = "consultoriogenera")
    private String consultorioGenera;
    @Column(name = "celularcontacto")
    private String celularContacto;
    @Column(name = "horallamado")
    private LocalDateTime horaLlamado;
    @Column(name = "horaconfirmado")
    private LocalDateTime horaConfirmado;
    private String motivoausente;

    public TurnoAsignadoPK getId() {
        return id;
    }

    public void setId(TurnoAsignadoPK id) {
        this.id = id;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getCodigoObraSocial() {
        return codigoObraSocial;
    }

    public void setCodigoObraSocial(Integer codigoObraSocial) {
        this.codigoObraSocial = codigoObraSocial;
    }

    public String getNumeroAfiliadoOs() {
        return numeroAfiliadoOs;
    }

    public void setNumeroAfiliadoOs(String numeroAfiliadoOs) {
        this.numeroAfiliadoOs = numeroAfiliadoOs;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public String getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(String confirmado) {
        this.confirmado = confirmado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIdEstadoAtencion() {
        return idEstadoAtencion;
    }

    public void setIdEstadoAtencion(String idEstadoAtencion) {
        this.idEstadoAtencion = idEstadoAtencion;
    }

    public String getUniatInterconsulta() {
        return uniatInterconsulta;
    }

    public void setUniatInterconsulta(String uniatInterconsulta) {
        this.uniatInterconsulta = uniatInterconsulta;
    }

    public String getProfInterconsulta() {
        return profInterconsulta;
    }

    public void setProfInterconsulta(String profInterconsulta) {
        this.profInterconsulta = profInterconsulta;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public Integer getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(Integer codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Integer getCodigoArt() {
        return codigoArt;
    }

    public void setCodigoArt(Integer codigoArt) {
        this.codigoArt = codigoArt;
    }

    public String getCodigoMedioOtorgamiento() {
        return codigoMedioOtorgamiento;
    }

    public void setCodigoMedioOtorgamiento(String codigoMedioOtorgamiento) {
        this.codigoMedioOtorgamiento = codigoMedioOtorgamiento;
    }

    public String getCodigoTipoTurno() {
        return codigoTipoTurno;
    }

    public void setCodigoTipoTurno(String codigoTipoTurno) {
        this.codigoTipoTurno = codigoTipoTurno;
    }

    public String getApellidonombre() {
        return apellidonombre;
    }

    public void setApellidonombre(String apellidonombre) {
        this.apellidonombre = apellidonombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoEdad() {
        return tipoEdad;
    }

    public void setTipoEdad(String tipoEdad) {
        this.tipoEdad = tipoEdad;
    }

    public String getProfesionalActuante() {
        return profesionalActuante;
    }

    public void setProfesionalActuante(String profesionalActuante) {
        this.profesionalActuante = profesionalActuante;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Integer getCodigoPartidoResidencia() {
        return codigoPartidoResidencia;
    }

    public void setCodigoPartidoResidencia(Integer codigoPartidoResidencia) {
        this.codigoPartidoResidencia = codigoPartidoResidencia;
    }

    public Integer getCodigoLocalidadResidencia() {
        return codigoLocalidadResidencia;
    }

    public void setCodigoLocalidadResidencia(Integer codigoLocalidadResidencia) {
        this.codigoLocalidadResidencia = codigoLocalidadResidencia;
    }

    public String getCodigoCupo() {
        return codigoCupo;
    }

    public void setCodigoCupo(String codigoCupo) {
        this.codigoCupo = codigoCupo;
    }

    public String getCodigoTipoAtencion() {
        return codigoTipoAtencion;
    }

    public void setCodigoTipoAtencion(String codigoTipoAtencion) {
        this.codigoTipoAtencion = codigoTipoAtencion;
    }

    public Integer getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Integer consultorio) {
        this.consultorio = consultorio;
    }

    public String getInterconsulta() {
        return interconsulta;
    }

    public void setInterconsulta(String interconsulta) {
        this.interconsulta = interconsulta;
    }

    public String getUaSolicitante() {
        return uaSolicitante;
    }

    public void setUaSolicitante(String uaSolicitante) {
        this.uaSolicitante = uaSolicitante;
    }

    public LocalDateTime getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(LocalDateTime horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getConsultorioGenera() {
        return consultorioGenera;
    }

    public void setConsultorioGenera(String consultorioGenera) {
        this.consultorioGenera = consultorioGenera;
    }

    public String getCelularContacto() {
        return celularContacto;
    }

    public void setCelularContacto(String celularContacto) {
        this.celularContacto = celularContacto;
    }

    public LocalDateTime getHoraLlamado() {
        return horaLlamado;
    }

    public void setHoraLlamado(LocalDateTime horaLlamado) {
        this.horaLlamado = horaLlamado;
    }

    public LocalDateTime getHoraConfirmado() {
        return horaConfirmado;
    }

    public void setHoraConfirmado(LocalDateTime horaConfirmado) {
        this.horaConfirmado = horaConfirmado;
    }

    public String getMotivoausente() {
        return motivoausente;
    }

    public void setMotivoausente(String motivoausente) {
        this.motivoausente = motivoausente;
    }
}
