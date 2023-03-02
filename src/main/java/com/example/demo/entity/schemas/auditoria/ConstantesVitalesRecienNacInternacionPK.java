package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class ConstantesVitalesRecienNacInternacionPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "idpaciente_rn")
    private Integer idPacienteRn;
    @Column(name = "fechacv")
    private Date fehcaCv;
    @Column(name = "horacv")
    private LocalDateTime horaCv;
    private LocalDateTime fecha;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Integer getIdPacienteRn() {
        return idPacienteRn;
    }

    public void setIdPacienteRn(Integer idPacienteRn) {
        this.idPacienteRn = idPacienteRn;
    }

    public Date getFehcaCv() {
        return fehcaCv;
    }

    public void setFehcaCv(Date fehcaCv) {
        this.fehcaCv = fehcaCv;
    }

    public LocalDateTime getHoraCv() {
        return horaCv;
    }

    public void setHoraCv(LocalDateTime horaCv) {
        this.horaCv = horaCv;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
