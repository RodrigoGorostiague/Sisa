package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.asistencia.PadronEspecialidad;
import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class RefContraRefPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")
    private ConsultaTurno consultaTurno;
    @ManyToOne
    @JoinColumn(name = "especialidadintercons", referencedColumnName = "codigoespecialidad")
    private PadronEspecialidad padronEspecialidad;
    @ManyToOne
    @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    private UnidadAtencion unidadAtencion;

    public ConsultaTurno getConsultaTurno() {
        return consultaTurno;
    }

    public void setConsultaTurno(ConsultaTurno consultaTurno) {
        this.consultaTurno = consultaTurno;
    }

    public PadronEspecialidad getPadronEspecialidad() {
        return padronEspecialidad;
    }

    public void setPadronEspecialidad(PadronEspecialidad padronEspecialidad) {
        this.padronEspecialidad = padronEspecialidad;
    }

    public UnidadAtencion getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(UnidadAtencion unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }
}
