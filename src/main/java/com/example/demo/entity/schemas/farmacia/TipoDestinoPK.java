package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class TipoDestinoPK implements Serializable{
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private UnidadesRecepcion unidadesRecepcion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public UnidadesRecepcion getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(UnidadesRecepcion unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }
}
