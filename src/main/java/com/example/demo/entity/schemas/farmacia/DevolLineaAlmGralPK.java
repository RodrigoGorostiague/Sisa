package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class DevolLineaAlmGralPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "nrodevol", referencedColumnName = "nrodevol")
    private DevolLineaAlmGral devolLineaAlmGral;
    @Column(name = "nrolinea")
    private Integer nroLinea;

    public DevolLineaAlmGral getDevolLineaAlmGral() {
        return devolLineaAlmGral;
    }

    public void setDevolLineaAlmGral(DevolLineaAlmGral devolLineaAlmGral) {
        this.devolLineaAlmGral = devolLineaAlmGral;
    }

    public Integer getNroLinea() {
        return nroLinea;
    }

    public void setNroLinea(Integer nroLinea) {
        this.nroLinea = nroLinea;
    }
}
