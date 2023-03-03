package com.example.demo.entity.schemas.laboratorio;

import com.example.demo.entity.schemas.organizacion.Area;
import com.example.demo.entity.schemas.paciente.Paciente;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orden", schema = "laboratorio_2009")
public class Orden {
    @Id
    @Column(name = "nroprotocolo")
    private Integer nroProtocolo;
    @Column(name = "tipopac")
    private String tipoPac;
    @Column(name = "nropac")
    private Integer nroPac;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    @ManyToOne
    @JoinColumn(name = "codigoprofesional", referencedColumnName = "codigopersonal")
    private Personal personal;
    @ManyToOne
    @JoinColumn(name = "codigoprocedencia", referencedColumnName = "codigoarea")
    private Area area;
    @Column(name = "codigoobrasocial")
    private Integer codigoObraSocial;
    @Column(name = "mesesembarazo")
    private Integer mesesEmbarazo;
    @Column(name = "fechaultactualizacion")
    private Date fechaUltActualizacion;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;

    public Integer getNroProtocolo() {
        return nroProtocolo;
    }

    public void setNroProtocolo(Integer nroProtocolo) {
        this.nroProtocolo = nroProtocolo;
    }

    public String getTipoPac() {
        return tipoPac;
    }

    public void setTipoPac(String tipoPac) {
        this.tipoPac = tipoPac;
    }

    public Integer getNroPac() {
        return nroPac;
    }

    public void setNroPac(Integer nroPac) {
        this.nroPac = nroPac;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Integer getCodigoObraSocial() {
        return codigoObraSocial;
    }

    public void setCodigoObraSocial(Integer codigoObraSocial) {
        this.codigoObraSocial = codigoObraSocial;
    }

    public Integer getMesesEmbarazo() {
        return mesesEmbarazo;
    }

    public void setMesesEmbarazo(Integer mesesEmbarazo) {
        this.mesesEmbarazo = mesesEmbarazo;
    }

    public Date getFechaUltActualizacion() {
        return fechaUltActualizacion;
    }

    public void setFechaUltActualizacion(Date fechaUltActualizacion) {
        this.fechaUltActualizacion = fechaUltActualizacion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
