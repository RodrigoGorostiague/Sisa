package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class EgresoLineaAlmDinPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "nroegreso", referencedColumnName = "nroegreso")
    private EgresoAlmDin egresoAlmDin;
    @Column(name = "nrolinea")
    private Integer nroLinea;

    public EgresoAlmDin getEgresoAlmDin() {
        return egresoAlmDin;
    }

    public void setEgresoAlmDin(EgresoAlmDin egresoAlmDin) {
        this.egresoAlmDin = egresoAlmDin;
    }

    public Integer getNroLinea() {
        return nroLinea;
    }

    public void setNroLinea(Integer nroLinea) {
        this.nroLinea = nroLinea;
    }
}
