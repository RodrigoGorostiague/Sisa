package com.example.demo.entity.schemas.electroEncefaloGramas;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "electroencefalograma", name = "informeeeg")
public class InformeEeg {
     @EmbeddedId
     private InformeEegPK id;
     private Date fecha;
     @Column(name = "idpaciente")
     private Integer idPaciente;
     @Column(name = "profesionalactuante")
     private String profesionalActuante;
     @Column(name = "fechaorden")
     private Date fechaOrden;
     @Column(name = "tipoprocedencia")
     private String tipoproCedencia;
     @Column(name = "uniatprocedencia")
     private String uniatProcedencia;
     @Column(name = "codigoprocedencia")
     private Integer codigoProcedencia;
     @Column(name = "profesionalsolicitante")
     private String profesionalSolicitante;
     @Column(name = "codigopractica")
     private String codigoPractica;
     @Column(name = "horainicio")
     private LocalDateTime horaInicio;
     @Column(name = "horafin")
     private LocalDateTime horaFin;
     @Column(name = "envigiliahv")
     private String enVigiliaHv;
     @Column(name = "envigiliafotoestim")
     private String enVigiliaFotoestim;
     private String ensue;
     @Column(name = "primerestudio")
     private String primerEstudio;
     @Column(name = "textoinforme")
     private String textoInforme;
     private String medic1;
     private String medic2;
     private String medic3;
     private String medic4;

    public InformeEegPK getId() {
        return id;
    }

    public void setId(InformeEegPK id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getProfesionalActuante() {
        return profesionalActuante;
    }

    public void setProfesionalActuante(String profesionalActuante) {
        this.profesionalActuante = profesionalActuante;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getTipoproCedencia() {
        return tipoproCedencia;
    }

    public void setTipoproCedencia(String tipoproCedencia) {
        this.tipoproCedencia = tipoproCedencia;
    }

    public String getUniatProcedencia() {
        return uniatProcedencia;
    }

    public void setUniatProcedencia(String uniatProcedencia) {
        this.uniatProcedencia = uniatProcedencia;
    }

    public Integer getCodigoProcedencia() {
        return codigoProcedencia;
    }

    public void setCodigoProcedencia(Integer codigoProcedencia) {
        this.codigoProcedencia = codigoProcedencia;
    }

    public String getProfesionalSolicitante() {
        return profesionalSolicitante;
    }

    public void setProfesionalSolicitante(String profesionalSolicitante) {
        this.profesionalSolicitante = profesionalSolicitante;
    }

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getEnVigiliaHv() {
        return enVigiliaHv;
    }

    public void setEnVigiliaHv(String enVigiliaHv) {
        this.enVigiliaHv = enVigiliaHv;
    }

    public String getEnVigiliaFotoestim() {
        return enVigiliaFotoestim;
    }

    public void setEnVigiliaFotoestim(String enVigiliaFotoestim) {
        this.enVigiliaFotoestim = enVigiliaFotoestim;
    }

    public String getEnsue() {
        return ensue;
    }

    public void setEnsue(String ensue) {
        this.ensue = ensue;
    }

    public String getPrimerEstudio() {
        return primerEstudio;
    }

    public void setPrimerEstudio(String primerEstudio) {
        this.primerEstudio = primerEstudio;
    }

    public String getTextoInforme() {
        return textoInforme;
    }

    public void setTextoInforme(String textoInforme) {
        this.textoInforme = textoInforme;
    }

    public String getMedic1() {
        return medic1;
    }

    public void setMedic1(String medic1) {
        this.medic1 = medic1;
    }

    public String getMedic2() {
        return medic2;
    }

    public void setMedic2(String medic2) {
        this.medic2 = medic2;
    }

    public String getMedic3() {
        return medic3;
    }

    public void setMedic3(String medic3) {
        this.medic3 = medic3;
    }

    public String getMedic4() {
        return medic4;
    }

    public void setMedic4(String medic4) {
        this.medic4 = medic4;
    }
}

