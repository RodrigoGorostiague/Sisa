package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class RnPartoPk implements Serializable {
    @OneToOne
    @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion ")
    private Parto parto;
    private Integer peso;
    private Integer talla;
    private Integer apgar5;
    private Integer apgar10;
    private String sexo;
    @Column(name = "perc_peso")
    private Integer percPeso;

    public Parto getParto() {
        return parto;
    }

    public void setParto(Parto parto) {
        this.parto = parto;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public Integer getApgar5() {
        return apgar5;
    }

    public void setApgar5(Integer apgar5) {
        this.apgar5 = apgar5;
    }

    public Integer getApgar10() {
        return apgar10;
    }

    public void setApgar10(Integer apgar10) {
        this.apgar10 = apgar10;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getPercPeso() {
        return percPeso;
    }

    public void setPercPeso(Integer percPeso) {
        this.percPeso = percPeso;
    }
}
