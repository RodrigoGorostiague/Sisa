package com.example.demo.entity.schemas.emergencia;
import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class IntervEnfermeriaCabeceraPK implements Serializable {
    @Column(name = "nrocon")
    private Integer nroCon;
    @ManyToOne
    @JoinColumn(name = "uniat", referencedColumnName = "codigouniat")
    private UnidadAtencion unidadAtencion;
    @ManyToOne
    @JoinColumn(name = "codigoenf", referencedColumnName = "codigopersonal")
    private Personal personal;
    private String estado;

    public Integer getNroCon() {
        return nroCon;
    }

    public void setNroCon(Integer nroCon) {
        this.nroCon = nroCon;
    }

    public UnidadAtencion getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(UnidadAtencion unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
