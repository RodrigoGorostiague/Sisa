package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class ConsultaApsPK implements Serializable {
    @Column(name = "nroconsulta")
    private Integer nroConsulta;
    @ManyToOne
    @JoinColumn(name = "uniat", referencedColumnName = "codigouniat")
    private UnidadAtencion uniat;

    public UnidadAtencion getUniat() {
        return uniat;
    }

    public void setUniat(UnidadAtencion uniat) {
        this.uniat = uniat;
    }

    public Integer getNroConsulta() {
        return nroConsulta;
    }

    public void setNroConsulta(Integer nroConsulta) {
        this.nroConsulta = nroConsulta;
    }
}
