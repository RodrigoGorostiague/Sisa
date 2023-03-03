package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.*;

@Entity
@Table(name = "probas", schema = "historialambulatorio")
public class Probas {
    @Id
    @ManyToOne
    @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")
    private ConsultaTurno consultaTurno;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @Column(name = "tipologia_probas")
    private String tipologiaProbas;
    @Column(name = "nivel_persistencia")
    private String nivelPersistencia;
    private String observaciones;

    public ConsultaTurno getConsultaTurno() {
        return consultaTurno;
    }
    public void setConsultaTurno(ConsultaTurno consultaTurno) {
        this.consultaTurno = consultaTurno;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getTipologiaProbas() {
        return tipologiaProbas;
    }

    public void setTipologiaProbas(String tipologiaProbas) {
        this.tipologiaProbas = tipologiaProbas;
    }

    public String getNivelPersistencia() {
        return nivelPersistencia;
    }

    public void setNivelPersistencia(String nivelPersistencia) {
        this.nivelPersistencia = nivelPersistencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
