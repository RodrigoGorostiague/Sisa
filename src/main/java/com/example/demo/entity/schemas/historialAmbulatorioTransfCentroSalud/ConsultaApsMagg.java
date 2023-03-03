package com.example.demo.entity.schemas.historialAmbulatorioTransfCentroSalud;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "historialambulatoio_transf_csalud")
public class ConsultaApsMagg {
    @EmbeddedId
    private ConsultaApsMaggPK id;
    @Column(name = "tipodoc")
    private String tipoDoc;
    @Column(name = "nrodoc")
    private String nroDoc;
    @Column(name = "apyno")
    private String apellidoNombre;
    @Column(name = "fechanac")
    private Date fechaNac;
    private Date fecha;
    private String objetivo;
    private String subjetivo;
    private String plan;
    private String educacion;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "pasaratabla")
    private Integer pasarTabla;

    public ConsultaApsMaggPK getId() {
        return id;
    }

    public void setId(ConsultaApsMaggPK id) {
        this.id = id;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getSubjetivo() {
        return subjetivo;
    }

    public void setSubjetivo(String subjetivo) {
        this.subjetivo = subjetivo;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getPasarTabla() {
        return pasarTabla;
    }

    public void setPasarTabla(Integer pasarTabla) {
        this.pasarTabla = pasarTabla;
    }
}
