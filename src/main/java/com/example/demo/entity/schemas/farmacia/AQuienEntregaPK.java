package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class AQuienEntregaPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private UnidadesRecepcion unidadesRecepcion;
    @Column(name = "entrega_a_ur")
    private String entregaAUr;

    public UnidadesRecepcion getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(UnidadesRecepcion unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }

    public String getEntregaAUr() {
        return entregaAUr;
    }

    public void setEntregaAUr(String entregaAUr) {
        this.entregaAUr = entregaAUr;
    }
}
