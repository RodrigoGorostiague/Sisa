package com.example.demo.entity.schemas.hc;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class CarpetaHcPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "historiaclinica", referencedColumnName = "historiaclinica")
    private HistoriaClinica historiaClinica;
    @ManyToOne
    @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    private UnidadAtencion unidadAtencion;

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public UnidadAtencion getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(UnidadAtencion unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }
}
