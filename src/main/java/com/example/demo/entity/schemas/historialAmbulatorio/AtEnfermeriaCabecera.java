package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "historialambulatorio", name = "atenfermeriacabecera")
public class AtEnfermeriaCabecera {
    @EmbeddedId
    private AtEnfermeriaCabeceraPK id;
    @ManyToOne
    @JoinColumn(name = "codigoPersonal", referencedColumnName = "codigoPersonal")
    private Personal personal;
    @ManyToOne
    @JoinColumn(name = "unidadatencion", referencedColumnName = "codigouniat")
    private UnidadAtencion uniat;

    public AtEnfermeriaCabeceraPK getId() {
        return id;
    }

    public void setId(AtEnfermeriaCabeceraPK id) {
        this.id = id;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public UnidadAtencion getUniat() {
        return uniat;
    }

    public void setUniat(UnidadAtencion uniat) {
        this.uniat = uniat;
    }
}
