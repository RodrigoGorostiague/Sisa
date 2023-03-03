package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.paciente.Paciente;
import com.example.demo.entity.schemas.turnos.TurnoAsignado;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(schema = "historialambulatorio", name = "consultaturno")
    public class ConsultaTurno {
    @Id
    @Column(name = "nroconsulta")
    private Integer nroConsulta;
    @Column(name = "horaturno")
    private LocalDateTime horaturno;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @ManyToOne
    @JoinColumn(name = "profesionalactuante", referencedColumnName = "codigopersonal")
    private Personal personal;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="numeroturno", referencedColumnName="numeroturno"),
            @JoinColumn(name="diaturno", referencedColumnName="diaturno"),
            @JoinColumn(name="horaconsultorio", referencedColumnName="horaconsultorio"),
            @JoinColumn(name="codigopersonal", referencedColumnName="codigopersonal"),
            @JoinColumn(name="codigouniat", referencedColumnName="codigouniat"),
            @JoinColumn(name="codigoespecialidad", referencedColumnName="codigoespecialidad")
            })
    private TurnoAsignado turnoAsignado;

    public Integer getNroConsulta() {
        return nroConsulta;
    }

    public void setNroConsulta(Integer nroConsulta) {
        this.nroConsulta = nroConsulta;
    }

    public LocalDateTime getHoraturno() {
        return horaturno;
    }

    public void setHoraturno(LocalDateTime horaturno) {
        this.horaturno = horaturno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public TurnoAsignado getTurnoAsignado() {
        return turnoAsignado;
    }

    public void setTurnoAsignado(TurnoAsignado turnoAsignado) {
        this.turnoAsignado = turnoAsignado;
    }
}
