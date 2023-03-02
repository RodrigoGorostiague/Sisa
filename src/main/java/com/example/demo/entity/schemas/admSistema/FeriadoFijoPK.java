package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class FeriadoFijoPK implements Serializable {
    @Column(name = "diaferiado")
    private Integer diaFeriado;
    @Column(name = "mesferiado")
    private Integer mesFeriado;

    public Integer getDiaFeriado() {
        return diaFeriado;
    }

    public void setDiaFeriado(Integer diaFeriado) {
        this.diaFeriado = diaFeriado;
    }

    public Integer getMesFeriado() {
        return mesFeriado;
    }

    public void setMesFeriado(Integer mesFeriado) {
        this.mesFeriado = mesFeriado;
    }
}
