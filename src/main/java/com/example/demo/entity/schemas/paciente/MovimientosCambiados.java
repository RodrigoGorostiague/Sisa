package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimientoscambiados", schema = "paciente")
public class MovimientosCambiados {
    @EmbeddedId
    private MovimientosCambiadosPK id;
    @Column(name = "idpacienteviejo")
    private Integer idPacienteViejo;
    @Column(name = "idpacientenuevo")
    private Integer idPacienteNuevo;

    public MovimientosCambiadosPK getId() {
        return id;
    }

    public void setId(MovimientosCambiadosPK id) {
        this.id = id;
    }

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
}
