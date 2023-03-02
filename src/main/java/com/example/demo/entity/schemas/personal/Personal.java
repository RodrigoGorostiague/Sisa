package com.example.demo.entity.schemas.personal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "personal", schema = "personal")
public class Personal {
    @Id
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "apynopersonal")
    private String apellidoNombrePersonal;
    @Column(name = "numeroidentificatorio")
    private Integer numeroIdentificatorio;
    private String habilitado;
    private String observaciones;
    private String fallecido;
    @Column(name = "grupoclasifpersonal")
    private Integer grupoClasifPersonal;
    private Integer profesion;
    private Integer area;
    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;
    @Column(name = "nro_matricula_prov")
    private Integer nroMatriculaProv;
    @Column(name = "tipo_doc")
    private String tipoDoc;
    @Column(name = "nro_doc")
    private Integer nroDoc;
    private String calle;
    private String nro;
    private String apellidos;
    private String nombres;
    private String celular;
    private String mail;

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getApellidoNombrePersonal() {
        return apellidoNombrePersonal;
    }

    public void setApellidoNombrePersonal(String apellidoNombrePersonal) {
        this.apellidoNombrePersonal = apellidoNombrePersonal;
    }

    public Integer getNumeroIdentificatorio() {
        return numeroIdentificatorio;
    }

    public void setNumeroIdentificatorio(Integer numeroIdentificatorio) {
        this.numeroIdentificatorio = numeroIdentificatorio;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFallecido() {
        return fallecido;
    }

    public void setFallecido(String fallecido) {
        this.fallecido = fallecido;
    }

    public Integer getGrupoClasifPersonal() {
        return grupoClasifPersonal;
    }

    public void setGrupoClasifPersonal(Integer grupoClasifPersonal) {
        this.grupoClasifPersonal = grupoClasifPersonal;
    }

    public Integer getProfesion() {
        return profesion;
    }

    public void setProfesion(Integer profesion) {
        this.profesion = profesion;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNroMatriculaProv() {
        return nroMatriculaProv;
    }

    public void setNroMatriculaProv(Integer nroMatriculaProv) {
        this.nroMatriculaProv = nroMatriculaProv;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public Integer getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(Integer nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
