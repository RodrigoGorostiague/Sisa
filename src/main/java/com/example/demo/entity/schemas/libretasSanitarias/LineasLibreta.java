package com.example.demo.entity.schemas.libretasSanitarias;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "lineaslibreta", schema = "libretassanitarias")
public class LineasLibreta {
    @EmbeddedId
    private LineasLibretaPK id;
    @Column(name = "fechaentrega")
    private Date fechaEntrega;
    private String observaciones;
    @Column(name = "fechamedico")
    private Date fechaMedico;
    private String ocupacion;
    private Integer importe;
    @Column(name = "numerorecibo")
    private String numeroRecibo;
    private String estado;
    @Column(name = "motivoanulacion")
    private String motivoAnulacion;
    private String comprobante;
    @Column(name = "acargohospital")
    private String acargoHospital;
    @Column(name = "acargoempresa")
    private String acargoEmpresa;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "num_turismo")
    private String numTurismo;
    @Column(name = "num_tuae")
    private String numTuae;
    @Column(name = "acargopaciente")
    private String acargoPaciente;
    @Column(name = "nrodisposicion")
    private String nroDisposicion;
    private String porcentaje;

    public LineasLibretaPK getId() {
        return id;
    }

    public void setId(LineasLibretaPK id) {
        this.id = id;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaMedico() {
        return fechaMedico;
    }

    public void setFechaMedico(Date fechaMedico) {
        this.fechaMedico = fechaMedico;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public String getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(String numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
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

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getAcargoHospital() {
        return acargoHospital;
    }

    public void setAcargoHospital(String acargoHospital) {
        this.acargoHospital = acargoHospital;
    }

    public String getAcargoEmpresa() {
        return acargoEmpresa;
    }

    public void setAcargoEmpresa(String acargoEmpresa) {
        this.acargoEmpresa = acargoEmpresa;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getNumTurismo() {
        return numTurismo;
    }

    public void setNumTurismo(String numTurismo) {
        this.numTurismo = numTurismo;
    }

    public String getNumTuae() {
        return numTuae;
    }

    public void setNumTuae(String numTuae) {
        this.numTuae = numTuae;
    }

    public String getAcargoPaciente() {
        return acargoPaciente;
    }

    public void setAcargoPaciente(String acargoPaciente) {
        this.acargoPaciente = acargoPaciente;
    }

    public String getNroDisposicion() {
        return nroDisposicion;
    }

    public void setNroDisposicion(String nroDisposicion) {
        this.nroDisposicion = nroDisposicion;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
}
