package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "cronogramaderivcabecera", schema = "internacion")
public class CronogramaDerivCabecera {
    @Id
    @Column(name = "nrotramitacion")
    private Integer nroTramitacion;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fechaalta")
    private Date fechaAlta;

    public Integer getNroTramitacion() {
        return nroTramitacion;
    }

    public void setNroTramitacion(Integer nroTramitacion) {
        this.nroTramitacion = nroTramitacion;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
