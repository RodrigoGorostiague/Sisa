package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class ValidacionEvolucionDiariaPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion"),
            @JoinColumn(name = "fechaevol", referencedColumnName = "fechaevol"),
            @JoinColumn(name = "horaevol", referencedColumnName = "horaevol"),
            @JoinColumn(name = "codigopersonal", referencedColumnName = "codigopersonal")
    })
    private EvolucionDiaria evolucionDiaria;
    @Column(name = "codigopersonalvalida")
    private String codigoPersonalvalida;

    public EvolucionDiaria getEvolucionDiaria() {
        return evolucionDiaria;
    }

    public void setEvolucionDiaria(EvolucionDiaria evolucionDiaria) {
        this.evolucionDiaria = evolucionDiaria;
    }

    public String getCodigoPersonalvalida() {
        return codigoPersonalvalida;
    }

    public void setCodigoPersonalvalida(String codigoPersonalvalida) {
        this.codigoPersonalvalida = codigoPersonalvalida;
    }
}

