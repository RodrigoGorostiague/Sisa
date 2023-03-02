package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class DevolLineaAlmDinPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "nrodevol", referencedColumnName = "nrodevol")
    private DevolAlmDin devolAlmDin;
    @Column(name = "nrolinea")
    private Integer nroLinea;

    public DevolAlmDin getDevolAlmDin() {
        return devolAlmDin;
    }

    public void setDevolAlmDin(DevolAlmDin devolAlmDin) {
        this.devolAlmDin = devolAlmDin;
    }

    public Integer getNroLinea() {
        return nroLinea;
    }

    public void setNroLinea(Integer nroLinea) {
        this.nroLinea = nroLinea;
    }
}
