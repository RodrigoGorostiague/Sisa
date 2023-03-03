package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.asistencia.PadronEspecialidad;
import com.example.demo.entity.schemas.paciente.Paciente;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "historialambulatorio", name = "consultaaps")
public class ConsultaAps {
    @EmbeddedId
    private ConsultaApsPK id;
    private Date fecha;
    private String objetivo;
    private String subjetivo;
    private String plan;
    private String educacion;
    @ManyToOne
    @JoinColumn(name = "codigoespecialidad", referencedColumnName = "codigoespecialidad")
    private PadronEspecialidad especialidad;
    @ManyToOne
    @JoinColumn(name = "codigopersonal", referencedColumnName = "codigopersonal")
    private Personal personal;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;

    public ConsultaApsPK getId() {
        return id;
    }

    public void setId(ConsultaApsPK id) {
        this.id = id;
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

    public PadronEspecialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(PadronEspecialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
