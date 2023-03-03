package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class EvolucionDiariaObstetriciaPK implements Serializable{
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion"),
            @JoinColumn(name = "fechaevol", referencedColumnName = "fechaevol"),
            @JoinColumn(name = "horaevol", referencedColumnName = "horaevol"),
            @JoinColumn(name = "codigopersonal", referencedColumnName = "codigopersonal")
    })
    private EvolucionDiaria evolucionDiaria;

    public EvolucionDiaria getEvolucionDiaria() {
        return evolucionDiaria;
    }

    public void setEvolucionDiaria(EvolucionDiaria evolucionDiaria) {
        this.evolucionDiaria = evolucionDiaria;
    }
}
