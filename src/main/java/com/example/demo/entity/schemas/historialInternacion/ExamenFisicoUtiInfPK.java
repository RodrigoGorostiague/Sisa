package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class ExamenFisicoUtiInfPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion"),
            @JoinColumn(name = "fechaing", referencedColumnName = "fechaing"),
            @JoinColumn(name = "horaing", referencedColumnName = "horaing")
    })
    private ExamenFisicoGral examenFisicoGral;

    public ExamenFisicoGral getExamenFisicoGral() {
        return examenFisicoGral;
    }

    public void setExamenFisicoGral(ExamenFisicoGral examenFisicoGral) {
        this.examenFisicoGral = examenFisicoGral;
    }
}
