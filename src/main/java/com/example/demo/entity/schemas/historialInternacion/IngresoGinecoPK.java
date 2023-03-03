package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.*;
@Embeddable
public class IngresoGinecoPK {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion"),
            @JoinColumn(name = "fechaing", referencedColumnName = "fechaing"),
            @JoinColumn(name = "horaing", referencedColumnName = "horaing")
    })
    private Ingreso ingreso;

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }
}
