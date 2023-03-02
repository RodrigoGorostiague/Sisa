package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "derivaciones", name = "derivacion")
public class Derivacion {
    @Id
    @Column(name = "nroplanilla")
    private Integer nroPlanilla;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechaemision")
    private Date fechaEmision;
    @Column(name = "fechaorden")
    private Date fechaOrden;
    private String estudio;
    @Column(name = "descripcionestudio")
    private String descripcionEstudio;
    @Column(name = "detalleestudio")
    private String detalleEstudio;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;
    private String profesional;
    @Column(name = "medicoauditor")
    private String medicoAuditor;
    @Column(name = "emitidopor")
    private String emitidoPor;
    private String urgencia;
    private String lugar;
    private String servicio;
    @Column(name = "hclugar")
    private String hcLugar;
    @Column(name = "fechaatencion")
    private Date fechaAtencion;
    @Column(name = "horaatencion")
    private LocalDateTime horaAtencion;
    @Column(name = "atendidopor")
    private String atendidoPor;
    private String documentacion1;
    private String documentacion2;
    private String documentacion3;
    @Column(name = "otradocumentacion")
    private String otraDocumentacion;
    private String recomendacion1;
    private String recomendacion2;
    private String recomendacion3;
    private String recomendacion4;
    @Column(name = "horasayuno")
    private Integer horasAyuno;
    private String observaciones;
    @Column(name = "viajeidaen")
    private String viajeIdaEn;
    @Column(name = "viajevueltaen")
    private String viajeVueltaEn;
    @Column(name = "acargo")
    private String aCargo;
    @Column(name = "costototal")
    private Integer costoTotal;
    @Column(name = "codigoprocedencia")
    private Integer codigoProcedencia;
    private String diagnostico;
    private String estado;
    @Column(name = "motivoanulacion")
    private String motivoAnulacion;

    public Integer getNroPlanilla() {
        return nroPlanilla;
    }

    public void setNroPlanilla(Integer nroPlanilla) {
        this.nroPlanilla = nroPlanilla;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getDescripcionEstudio() {
        return descripcionEstudio;
    }

    public void setDescripcionEstudio(String descripcionEstudio) {
        this.descripcionEstudio = descripcionEstudio;
    }

    public String getDetalleEstudio() {
        return detalleEstudio;
    }

    public void setDetalleEstudio(String detalleEstudio) {
        this.detalleEstudio = detalleEstudio;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public String getTipoProcedencia() {
        return tipoProcedencia;
    }

    public void setTipoProcedencia(String tipoProcedencia) {
        this.tipoProcedencia = tipoProcedencia;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public String getMedicoAuditor() {
        return medicoAuditor;
    }

    public void setMedicoAuditor(String medicoAuditor) {
        this.medicoAuditor = medicoAuditor;
    }

    public String getEmitidoPor() {
        return emitidoPor;
    }

    public void setEmitidoPor(String emitidoPor) {
        this.emitidoPor = emitidoPor;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getHcLugar() {
        return hcLugar;
    }

    public void setHcLugar(String hcLugar) {
        this.hcLugar = hcLugar;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public LocalDateTime getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(LocalDateTime horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getAtendidoPor() {
        return atendidoPor;
    }

    public void setAtendidoPor(String atendidoPor) {
        this.atendidoPor = atendidoPor;
    }

    public String getDocumentacion1() {
        return documentacion1;
    }

    public void setDocumentacion1(String documentacion1) {
        this.documentacion1 = documentacion1;
    }

    public String getDocumentacion2() {
        return documentacion2;
    }

    public void setDocumentacion2(String documentacion2) {
        this.documentacion2 = documentacion2;
    }

    public String getDocumentacion3() {
        return documentacion3;
    }

    public void setDocumentacion3(String documentacion3) {
        this.documentacion3 = documentacion3;
    }

    public String getOtraDocumentacion() {
        return otraDocumentacion;
    }

    public void setOtraDocumentacion(String otraDocumentacion) {
        this.otraDocumentacion = otraDocumentacion;
    }

    public String getRecomendacion1() {
        return recomendacion1;
    }

    public void setRecomendacion1(String recomendacion1) {
        this.recomendacion1 = recomendacion1;
    }

    public String getRecomendacion2() {
        return recomendacion2;
    }

    public void setRecomendacion2(String recomendacion2) {
        this.recomendacion2 = recomendacion2;
    }

    public String getRecomendacion3() {
        return recomendacion3;
    }

    public void setRecomendacion3(String recomendacion3) {
        this.recomendacion3 = recomendacion3;
    }

    public String getRecomendacion4() {
        return recomendacion4;
    }

    public void setRecomendacion4(String recomendacion4) {
        this.recomendacion4 = recomendacion4;
    }

    public Integer getHorasAyuno() {
        return horasAyuno;
    }

    public void setHorasAyuno(Integer horasAyuno) {
        this.horasAyuno = horasAyuno;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getViajeIdaEn() {
        return viajeIdaEn;
    }

    public void setViajeIdaEn(String viajeIdaEn) {
        this.viajeIdaEn = viajeIdaEn;
    }

    public String getViajeVueltaEn() {
        return viajeVueltaEn;
    }

    public void setViajeVueltaEn(String viajeVueltaEn) {
        this.viajeVueltaEn = viajeVueltaEn;
    }

    public String getaCargo() {
        return aCargo;
    }

    public void setaCargo(String aCargo) {
        this.aCargo = aCargo;
    }

    public Integer getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Integer costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Integer getCodigoProcedencia() {
        return codigoProcedencia;
    }

    public void setCodigoProcedencia(Integer codigoProcedencia) {
        this.codigoProcedencia = codigoProcedencia;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
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
}
