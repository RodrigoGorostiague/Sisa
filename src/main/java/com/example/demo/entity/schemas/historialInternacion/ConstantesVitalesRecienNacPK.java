package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.internacion.Internacion;
import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ConstantesVitalesRecienNacPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion")
    private Internacion internacion;
    @ManyToOne
    @JoinColumn(name = "idpaciente_rn", referencedColumnName = "idpaciente")
    private Paciente paciente;
    private Date fecha;
    private LocalDateTime hora;

    public Internacion getInternacion() {
        return internacion;
    }

    public void setInternacion(Internacion internacion) {
        this.internacion = internacion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}
