package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class IntervEnfermeriaLineasPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon"),
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "codigoenf", referencedColumnName = "codigoenf"),
            @JoinColumn(name = "estado", referencedColumnName = "estado")
    })
    private IntervEnfermeriaCabecera intervEnfermeriaCabecera;
    @Column(name = "codigonic")
    private String codigoNic;

    public IntervEnfermeriaCabecera getIntervEnfermeriaCabecera() {
        return intervEnfermeriaCabecera;
    }

    public void setIntervEnfermeriaCabecera(IntervEnfermeriaCabecera intervEnfermeriaCabecera) {
        this.intervEnfermeriaCabecera = intervEnfermeriaCabecera;
    }

    public String getCodigoNic() {
        return codigoNic;
    }

    public void setCodigoNic(String codigoNic) {
        this.codigoNic = codigoNic;
    }
}
