package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class EvolProblemaAudPK implements Serializable {
    @Column(name = "fechahora")
    private LocalDateTime fechaHora;
    @Column(name = "nroconsulta")
    private Integer nroConsulta;
    @Column(name = "codigociap2")
    private String codigoCiap2;
    @Column(name = "problemaanterior")
    private String problemaAnterior;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Integer getNroConsulta() {
        return nroConsulta;
    }

    public void setNroConsulta(Integer nroConsulta) {
        this.nroConsulta = nroConsulta;
    }

    public String getCodigoCiap2() {
        return codigoCiap2;
    }

    public void setCodigoCiap2(String codigoCiap2) {
        this.codigoCiap2 = codigoCiap2;
    }

    public String getProblemaAnterior() {
        return problemaAnterior;
    }

    public void setProblemaAnterior(String problemaAnterior) {
        this.problemaAnterior = problemaAnterior;
    }
}
