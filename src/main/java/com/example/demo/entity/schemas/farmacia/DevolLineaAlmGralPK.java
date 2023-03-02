package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class DevolLineaAlmGralPK implements Serializable {
    @OneToOne
    @JoinColumn(name = "nrodevol", referencedColumnName = "nrodevol")
    private DevolAlmGral devolAlmGral;
    @Column(name = "nrolinea")
    private Integer nroLinea;

    public DevolAlmGral getDevolAlmGral() {
        return devolAlmGral;
    }

    public void setDevolAlmGral(DevolAlmGral devolAlmGral) {
        this.devolAlmGral = devolAlmGral;
    }

    public Integer getNroLinea() {
        return nroLinea;
    }

    public void setNroLinea(Integer nroLinea) {
        this.nroLinea = nroLinea;
    }
}
