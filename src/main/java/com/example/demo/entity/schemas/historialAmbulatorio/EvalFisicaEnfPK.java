package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class EvalFisicaEnfPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name="idpaciente", referencedColumnName="idpaciente"),
            @JoinColumn(name="fecha", referencedColumnName="fecha"),
            @JoinColumn(name="hora", referencedColumnName="hora")})
    private AtEnfermeriaCabecera atEnfermeriaCabecera;

    public AtEnfermeriaCabecera getAtEnfermeriaCabecera() {
        return atEnfermeriaCabecera;
    }

    public void setAtEnfermeriaCabecera(AtEnfermeriaCabecera atEnfermeriaCabecera) {
        this.atEnfermeriaCabecera = atEnfermeriaCabecera;
    }
}
