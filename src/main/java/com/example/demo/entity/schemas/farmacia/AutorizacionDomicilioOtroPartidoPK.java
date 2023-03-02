package com.api.sisa.entity.schemas.farmacia;

import com.api.sisa.entity.schemas.paciente.Paciente;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Embeddable
public class AutorizacionDomicilioOtroPartidoPK implements Serializable {
    @Column(name = "fechaalta")
    private Date fechaAlta;
    private Date fechaHasta;
    @OneToMany
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private List<Paciente> paciente;

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

    public List<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<Paciente> paciente) {
        this.paciente = paciente;
    }
}
