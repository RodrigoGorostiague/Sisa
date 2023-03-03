package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class DiagPlanTratPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "nroInternacion",referencedColumnName = "nroInternacion"),
            @JoinColumn(name = "fechaing",referencedColumnName = "fechaing"),
            @JoinColumn(name = "horaing",referencedColumnName = "horaing")
    })
    private Ingreso ingreso;

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }
}
