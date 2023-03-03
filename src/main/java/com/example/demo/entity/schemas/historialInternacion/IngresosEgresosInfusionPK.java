package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class IngresosEgresosInfusionPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion"),
            @JoinColumn(name = "fecha_ingegr", referencedColumnName = "fechaing"),
            @JoinColumn(name = "hora_ingegr", referencedColumnName = "horaing")
    })
    private IngresosEgresos ingresosEgresos;
    @ManyToOne
    @JoinColumn(name = "idprescripcioninfusion", referencedColumnName = "id")
    private Infusion infusion;

    public IngresosEgresos getIngresosEgresos() {
        return ingresosEgresos;
    }

    public void setIngresosEgresos(IngresosEgresos ingresosEgresos) {
        this.ingresosEgresos = ingresosEgresos;
    }

    public Infusion getInfusion() {
        return infusion;
    }

    public void setInfusion(Infusion infusion) {
        this.infusion = infusion;
    }
}
