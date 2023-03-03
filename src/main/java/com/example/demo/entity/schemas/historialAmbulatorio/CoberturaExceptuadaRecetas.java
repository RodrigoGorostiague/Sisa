package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.facturacion.ObraSocial;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "coberturaexceptuadarecetas", schema = "historialambulatorio")
public class CoberturaExceptuadaRecetas {
    @Id
    @ManyToOne
    @JoinColumn(name = "codigoobrasocial", referencedColumnName = "codigoobrasocial")
    private ObraSocial obraSocial;

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
}
