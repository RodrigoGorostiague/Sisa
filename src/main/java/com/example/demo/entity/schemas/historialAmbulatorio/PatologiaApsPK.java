package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class PatologiaApsPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta"),
            @JoinColumn(name = "uniat", referencedColumnName = "uniat")})
    private ConsultaAps consultaAps;
    @Column(name = "codigopatologia")
    private Integer codigoPatologia;

    public ConsultaAps getConsultaAps() {
        return consultaAps;
    }

    public void setConsultaAps(ConsultaAps consultaAps) {
        this.consultaAps = consultaAps;
    }

    public Integer getCodigoPatologia() {
        return codigoPatologia;
    }

    public void setCodigoPatologia(Integer codigoPatologia) {
        this.codigoPatologia = codigoPatologia;
    }
}
