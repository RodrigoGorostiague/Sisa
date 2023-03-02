package com.example.demo.entity.schemas.hc;

import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(schema = "hc", name = "historiaclinica")
public class HistoriaClinica {
    @Id
    @Column(name = "historiaclinica")
    private Integer historiaClinica;
    @Column(name = "fechaalta")
    private LocalDateTime fechaAlta;
    private String observaciones;
    @OneToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;

    public Integer getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(Integer historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
