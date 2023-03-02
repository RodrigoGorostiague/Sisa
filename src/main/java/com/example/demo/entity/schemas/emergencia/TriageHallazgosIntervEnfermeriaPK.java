package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class TriageHallazgosIntervEnfermeriaPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon"),
            @JoinColumn(name = "estado", referencedColumnName = "estado"),
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "codigoEnf", referencedColumnName = "codigoEnf"),
    })
    private IntervEnfermeriaCabecera intervEnfermeriaCabecera;
    @ManyToOne
    @JoinColumn(name = "idhallazgo", referencedColumnName = "id")
    private TriageHallazgo triageHallazgo;

    public IntervEnfermeriaCabecera getIntervEnfermeriaCabecera() {
        return intervEnfermeriaCabecera;
    }

    public void setIntervEnfermeriaCabecera(IntervEnfermeriaCabecera intervEnfermeriaCabecera) {
        this.intervEnfermeriaCabecera = intervEnfermeriaCabecera;
    }

    public TriageHallazgo getTriageHallazgo() {
        return triageHallazgo;
    }

    public void setTriageHallazgo(TriageHallazgo triageHallazgo) {
        this.triageHallazgo = triageHallazgo;
    }
}
