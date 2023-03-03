package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoturno", schema = "turnos")
public class TipoTurno {
    @Id
    @Column(name = "codigotipoturno")
    private String codigoTipoTurno;
    @Column(name = "nombretipoturno")
    private String nombreTipoTurno;

    public String getCodigoTipoTurno() {
        return codigoTipoTurno;
    }

    public void setCodigoTipoTurno(String codigoTipoTurno) {
        this.codigoTipoTurno = codigoTipoTurno;
    }

    public String getNombreTipoTurno() {
        return nombreTipoTurno;
    }

    public void setNombreTipoTurno(String nombreTipoTurno) {
        this.nombreTipoTurno = nombreTipoTurno;
    }
}
