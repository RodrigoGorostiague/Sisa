package com.example.demo.entity.schemas.farmacia;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class UsuariosUnidadesRecepcionPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "codigopersonal", referencedColumnName = "codigopersonal")
    private Personal personal;
    @ManyToOne
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private UnidadesRecepcion unidadesRecepcion;

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public UnidadesRecepcion getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(UnidadesRecepcion unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }
}
