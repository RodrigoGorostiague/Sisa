package com.example.demo.entity.schemas.paciente;

import com.example.demo.entity.schemas.facturacion.Parentesco;
import com.example.demo.entity.schemas.facturacion.TipoBeneficiario;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "coberturasocial", schema = "paciente")
public class CoberturaSocial {
    @EmbeddedId
    private CoberturaSocialPK id;
    @Column(name = "numeroafiliado")
    private String numeroAfiliado;
    @ManyToOne
    @JoinColumn(name = "idparentesco", referencedColumnName = "idparentesco")
    private Parentesco parentesco;
    @OneToOne
    @JoinColumn(name = "idtipobeneficiario", referencedColumnName = "idtipobeneficiario")
    private TipoBeneficiario tipoBeneficiario;
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
    private Integer mesultUltimoReciboSueldo;
    @Column(name = "anioultimorecibosueldo")
    private Integer anioUltimoReciboSueldo;
    @Column(name = "fechaprobableparto")
    private Date fechaProbableParto;
    @Column(name = "codigoprestadora")
    private String codigoPrestadora;

    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }

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

    public TipoBeneficiario getTipoBeneficiario() {
        return tipoBeneficiario;
    }

    public void setTipoBeneficiario(TipoBeneficiario tipoBeneficiario) {
        this.tipoBeneficiario = tipoBeneficiario;
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

    public Integer getMesultUltimoReciboSueldo() {
        return mesultUltimoReciboSueldo;
    }

    public void setMesultUltimoReciboSueldo(Integer mesultUltimoReciboSueldo) {
        this.mesultUltimoReciboSueldo = mesultUltimoReciboSueldo;
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
