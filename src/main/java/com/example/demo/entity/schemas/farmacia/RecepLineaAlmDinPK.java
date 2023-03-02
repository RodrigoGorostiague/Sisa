package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class RecepLineaAlmDinPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "nrorecep", referencedColumnName = "nrorecep")
    private RecepcionAlmDin recepcionAlmDin;
    @Column(name = "nrolinea")
    private Integer nroLinea;

    public RecepcionAlmDin getRecepcionAlmDin() {
        return recepcionAlmDin;
    }

    public void setRecepcionAlmDin(RecepcionAlmDin recepcionAlmDin) {
        this.recepcionAlmDin = recepcionAlmDin;
    }

    public Integer getNroLinea() {
        return nroLinea;
    }

    public void setNroLinea(Integer nroLinea) {
        this.nroLinea = nroLinea;
    }
}
