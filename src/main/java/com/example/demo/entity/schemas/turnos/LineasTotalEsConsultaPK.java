package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class LineasTotalEsConsultaPK implements Serializable {
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoespecialidad")
    private Integer codigoEspecialidad;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    private Date fecha;
    @Column(name = "claseconsulta")
    private String claseConsulta;
    @Column(name = "numerogrupo")
    private Integer numeroGrupo;
    @Column(name = "edadinicial")
    private Integer edadInicial;
    @Column(name = "edadfinal")
    private Integer edadFinal;
    private String sexo;

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Integer getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(Integer codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getClaseConsulta() {
        return claseConsulta;
    }

    public void setClaseConsulta(String claseConsulta) {
        this.claseConsulta = claseConsulta;
    }

    public Integer getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(Integer numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public Integer getEdadInicial() {
        return edadInicial;
    }

    public void setEdadInicial(Integer edadInicial) {
        this.edadInicial = edadInicial;
    }

    public Integer getEdadFinal() {
        return edadFinal;
    }

    public void setEdadFinal(Integer edadFinal) {
        this.edadFinal = edadFinal;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
