package com.example.demo.entity.schemas.facturacion;

import com.example.demo.entity.schemas.nomencladores.PadronImagenes;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "solicitudestudiosioma", schema = "facturacion")
public class SolicitudEstudiosIoma {
    @EmbeddedId
    private SolicitudEstudiosIomaPK id;
    private String tipo;
    @OneToOne
    @JoinColumn(name = "codigopractica", referencedColumnName = "codigopractica")
    private PadronImagenes padronImagenes;
    @Column(name = "codigopractica2")
    private String codigoPractica2;
    @Column(name = "codigopractica3")
    private String codigoPractica3;
    @Column(name = "codigopractica4")
    private String codigoPractica4;
    @Column(name = "codigopractica5")
    private String codigoPractica5;
    @Column(name = "codigopractica6")
    private String codigoPractica6;
    @Column(name = "resumenhc")
    private String resumenHc;
    @Column(name = "examenesprevios")
    private String examenesPrevios;
    private String urgente;
    @Column(name = "motivourgencia")
    private String motivoUrgencia;
    @Column(name = "solicitaanestesia")
    private String solicitaAnestesia;
    private String diagnostico;
    private String uniat;
    @Column(name = "fechapasefacturacion")
    private Date fechaPaseFacturacion;

    public SolicitudEstudiosIomaPK getId() {
        return id;
    }

    public void setId(SolicitudEstudiosIomaPK id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public PadronImagenes getPadronImagenes() {
        return padronImagenes;
    }

    public void setPadronImagenes(PadronImagenes padronImagenes) {
        this.padronImagenes = padronImagenes;
    }

    public String getCodigoPractica2() {
        return codigoPractica2;
    }

    public void setCodigoPractica2(String codigoPractica2) {
        this.codigoPractica2 = codigoPractica2;
    }

    public String getCodigoPractica3() {
        return codigoPractica3;
    }

    public void setCodigoPractica3(String codigoPractica3) {
        this.codigoPractica3 = codigoPractica3;
    }

    public String getCodigoPractica4() {
        return codigoPractica4;
    }

    public void setCodigoPractica4(String codigoPractica4) {
        this.codigoPractica4 = codigoPractica4;
    }

    public String getCodigoPractica5() {
        return codigoPractica5;
    }

    public void setCodigoPractica5(String codigoPractica5) {
        this.codigoPractica5 = codigoPractica5;
    }

    public String getCodigoPractica6() {
        return codigoPractica6;
    }

    public void setCodigoPractica6(String codigoPractica6) {
        this.codigoPractica6 = codigoPractica6;
    }

    public String getResumenHc() {
        return resumenHc;
    }

    public void setResumenHc(String resumenHc) {
        this.resumenHc = resumenHc;
    }

    public String getExamenesPrevios() {
        return examenesPrevios;
    }

    public void setExamenesPrevios(String examenesPrevios) {
        this.examenesPrevios = examenesPrevios;
    }

    public String getUrgente() {
        return urgente;
    }

    public void setUrgente(String urgente) {
        this.urgente = urgente;
    }

    public String getMotivoUrgencia() {
        return motivoUrgencia;
    }

    public void setMotivoUrgencia(String motivoUrgencia) {
        this.motivoUrgencia = motivoUrgencia;
    }

    public String getSolicitaAnestesia() {
        return solicitaAnestesia;
    }

    public void setSolicitaAnestesia(String solicitaAnestesia) {
        this.solicitaAnestesia = solicitaAnestesia;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public Date getFechaPaseFacturacion() {
        return fechaPaseFacturacion;
    }

    public void setFechaPaseFacturacion(Date fechaPaseFacturacion) {
        this.fechaPaseFacturacion = fechaPaseFacturacion;
    }
}
