package com.api.sisa.entity.schemas.historico;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "coberturasocial",schema = "historico")
public class CoberturaSocial {
    @EmbeddedId
    private CoberturaSocialPK id;
    @Column(name = "numeroafiliado")
    private String  numeroAfiliado;
    @Column(name = "idparentesco")
    private String idParentesco;
    @Column(name = "idtipobeneficiario")
    private String idTipoBeneficiario;
    @Column(name = "fechaemision")
    private Date fechaEmision;
    @Column(name = "fechavencimiento")
    private Date fechaVencimiento;
    @Column(name = "cuitempleador")
    private String cuitEmpleador;
    @Column(name = "razonsocialempleador")
    private String razonSocialEmpleador;
    @Column(name = "domicilioempleador")
    private String domicilioEmpleador;
    @Column(name = "mesultimorecibosueldo")
    private Integer mesUltimoReciboSueldo;
    @Column(name = "anioultimorecibosueldo")
    private Integer anioUltimoReciboSueldo;
    @Column(name = "fechaprobableparto")
    private Date fechaProbableParto;
    @Column(name = "codigoprestadora")
    private String codigoPrestadora;

    public CoberturaSocialPK getId() {
        return id;
    }

    public void setId(CoberturaSocialPK id) {
        this.id = id;
    }

    public String getNumeroAfiliado() {
        return numeroAfiliado;
    }

    public void setNumeroAfiliado(String numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }

    public String getIdParentesco() {
        return idParentesco;
    }

    public void setIdParentesco(String idParentesco) {
        this.idParentesco = idParentesco;
    }

    public String getIdTipoBeneficiario() {
        return idTipoBeneficiario;
    }

    public void setIdTipoBeneficiario(String idTipoBeneficiario) {
        this.idTipoBeneficiario = idTipoBeneficiario;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCuitEmpleador() {
        return cuitEmpleador;
    }

    public void setCuitEmpleador(String cuitEmpleador) {
        this.cuitEmpleador = cuitEmpleador;
    }

    public String getRazonSocialEmpleador() {
        return razonSocialEmpleador;
    }

    public void setRazonSocialEmpleador(String razonSocialEmpleador) {
        this.razonSocialEmpleador = razonSocialEmpleador;
    }

    public String getDomicilioEmpleador() {
        return domicilioEmpleador;
    }

    public void setDomicilioEmpleador(String domicilioEmpleador) {
        this.domicilioEmpleador = domicilioEmpleador;
    }

    public Integer getMesUltimoReciboSueldo() {
        return mesUltimoReciboSueldo;
    }

    public void setMesUltimoReciboSueldo(Integer mesUltimoReciboSueldo) {
        this.mesUltimoReciboSueldo = mesUltimoReciboSueldo;
    }

    public Integer getAnioUltimoReciboSueldo() {
        return anioUltimoReciboSueldo;
    }

    public void setAnioUltimoReciboSueldo(Integer anioUltimoReciboSueldo) {
        this.anioUltimoReciboSueldo = anioUltimoReciboSueldo;
    }

    public Date getFechaProbableParto() {
        return fechaProbableParto;
    }

    public void setFechaProbableParto(Date fechaProbableParto) {
        this.fechaProbableParto = fechaProbableParto;
    }

    public String getCodigoPrestadora() {
        return codigoPrestadora;
    }

    public void setCodigoPrestadora(String codigoPrestadora) {
        this.codigoPrestadora = codigoPrestadora;
    }
}
