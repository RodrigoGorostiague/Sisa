package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.asistencia.PadronEspecialidad;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class GuardiaDerivacionCexPK implements Serializable {
    @Column(name = "nrocon")
    private Integer nroCon;
    private String uniat;
    @ManyToOne
    @JoinColumn(name = "especialidad", referencedColumnName = "codigoespecialidad")
    private PadronEspecialidad especialidad;

    public Integer getNroCon() {
        return nroCon;
    }

    public void setNroCon(Integer nroCon) {
        this.nroCon = nroCon;
    }

    public String getUniat() {
        return uniat;
    }

    public void setUniat(String uniat) {
        this.uniat = uniat;
    }

    public PadronEspecialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(PadronEspecialidad especialidad) {
        this.especialidad = especialidad;
    }
}
