package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "auditoria", name = "lineaslibreta")
public class LineasLibreta {
    @EmbeddedId
    private LineasLibretaPK id;
    @Column(name = "fechaentrega")
    private Date fechaEntrega;
    private String operaciones;
    @Column(name = "fechamedico")
    private Date fechaMedico;
    private String ocupacion;
    private String operacion;
    private Integer importe;
    @Column(name = "nombreempresa")
    private String nombreEmpresa;

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

    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
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

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
