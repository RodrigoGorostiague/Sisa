package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class AQuienEntregaPK implements Serializable {
    @OneToMany
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private List<UnidadesRecepcion> unidadesRecepcion;
    @Column(name = "entrega_a_ur")
    private String entregaAUr;

    public List<UnidadesRecepcion> getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(List<UnidadesRecepcion> unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }

    public String getEntregaAUr() {
        return entregaAUr;
    }

    public void setEntregaAUr(String entregaAUr) {
        this.entregaAUr = entregaAUr;
    }
}
