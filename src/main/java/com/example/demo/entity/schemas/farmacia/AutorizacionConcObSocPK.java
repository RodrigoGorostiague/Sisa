package com.example.demo.entity.schemas.farmacia;

import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Embeddable
public class AutorizacionConcObSocPK implements Serializable {
    @Column(name = "fechaalta")
    private Date fechaAlta;
    @Column(name = "fechahasta")
    private Date fechaHasta;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
