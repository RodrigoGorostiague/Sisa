package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class ConstantesVitalesUtiInfPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "hora", referencedColumnName = "hora"),
            @JoinColumn(name = "fecha", referencedColumnName = "fecha"),
            @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion")
    })
    private ConstantesVitales constantesVitales;

    public ConstantesVitales getConstantesVitales() {
        return constantesVitales;
    }

    public void setConstantesVitales(ConstantesVitales constantesVitales) {
        this.constantesVitales = constantesVitales;
    }
}
