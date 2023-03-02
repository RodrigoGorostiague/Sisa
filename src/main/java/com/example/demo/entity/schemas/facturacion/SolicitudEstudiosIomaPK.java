package com.example.demo.entity.schemas.facturacion;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class SolicitudEstudiosIomaPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @Column(name = "nroconsulta")
    private Integer nroConsulta;
    @ManyToOne
    @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    private UnidadAtencion unidadAtencion;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Integer getNroConsulta() {
        return nroConsulta;
    }

    public void setNroConsulta(Integer nroConsulta) {
        this.nroConsulta = nroConsulta;
    }

    public UnidadAtencion getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(UnidadAtencion unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }
}
