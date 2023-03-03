package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.sql.Date;

@Embeddable
public class BajaVacunasPK implements Serializable {
    @Column(name = "codigouat")
    private String codigoUat;
    @Column(name = "codigovacuna")
    private String codigoVacuna;
    @Column(name = "numlote")
    private String numLote;
    @Column(name = "fechabaja")
    private Date fechaBaja;

    public String getCodigoUat() {
        return codigoUat;
    }

    public void setCodigoUat(String codigoUat) {
        this.codigoUat = codigoUat;
    }

    public String getCodigoVacuna() {
        return codigoVacuna;
    }

    public void setCodigoVacuna(String codigoVacuna) {
        this.codigoVacuna = codigoVacuna;
    }

    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}
