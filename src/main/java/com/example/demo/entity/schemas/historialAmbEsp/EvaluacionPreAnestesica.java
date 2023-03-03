package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "historialambesp")
public class EvaluacionPreAnestesica {
    @Id
    @Column(name = "nroconsulta")
    private Integer nroConsulta;
    private String diagnostico;
    private String comentario;
    private String urgencia;
    @Column(name = "clasif_mallampati")
    private String clasifMalLampati;
    @Column(name = "dist_tiromentoniana")
    private String distTiromentoniana;
    private String intubacion;
    @Column(name = "apertura_bucal")
    private String aperturaBucal;
    @Column(name = "consentinf")
    private String consentInf;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Date fecha;
    private String comentarios;

    public Integer getNroConsulta() {
        return nroConsulta;
    }

    public void setNroConsulta(Integer nroConsulta) {
        this.nroConsulta = nroConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getClasifMalLampati() {
        return clasifMalLampati;
    }

    public void setClasifMalLampati(String clasifMalLampati) {
        this.clasifMalLampati = clasifMalLampati;
    }

    public String getDistTiromentoniana() {
        return distTiromentoniana;
    }

    public void setDistTiromentoniana(String distTiromentoniana) {
        this.distTiromentoniana = distTiromentoniana;
    }

    public String getIntubacion() {
        return intubacion;
    }

    public void setIntubacion(String intubacion) {
        this.intubacion = intubacion;
    }

    public String getAperturaBucal() {
        return aperturaBucal;
    }

    public void setAperturaBucal(String aperturaBucal) {
        this.aperturaBucal = aperturaBucal;
    }

    public String getConsentInf() {
        return consentInf;
    }

    public void setConsentInf(String consentInf) {
        this.consentInf = consentInf;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
