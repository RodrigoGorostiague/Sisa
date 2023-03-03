package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class ValidacionIngresoPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion"),
            @JoinColumn(name = "fechaing", referencedColumnName = "fechaing"),
            @JoinColumn(name = "horaing", referencedColumnName = "horaing")
    })
    private Ingreso ingreso;
    @ManyToOne
    @JoinColumn(name = "codigopersonalvalida", referencedColumnName = "codigopersonal")
    private Personal personal;

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
