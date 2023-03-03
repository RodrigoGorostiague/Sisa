package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class CambioMovimientosPK implements Serializable {
    @Column(name = "idpacienteviejo")
    private Integer idPacienteViejo;
    @Column(name = "idpacientenuevo")
    private Integer idPacienteNuevo;
    @Column(name = "fechacambio")
    private Date fechaCambio;
    @Column(name = "horacambio")
    private LocalDateTime horaCambio;

    public Integer getIdPacienteViejo() {
        return idPacienteViejo;
    }

    public void setIdPacienteViejo(Integer idPacienteViejo) {
        this.idPacienteViejo = idPacienteViejo;
    }

    public Integer getIdPacienteNuevo() {
        return idPacienteNuevo;
    }

    public void setIdPacienteNuevo(Integer idPacienteNuevo) {
        this.idPacienteNuevo = idPacienteNuevo;
    }

    public Date getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(Date fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public LocalDateTime getHoraCambio() {
        return horaCambio;
    }

    public void setHoraCambio(LocalDateTime horaCambio) {
        this.horaCambio = horaCambio;
    }
}
