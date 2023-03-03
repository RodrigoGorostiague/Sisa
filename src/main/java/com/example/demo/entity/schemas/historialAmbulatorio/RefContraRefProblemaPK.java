package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.nomencladores.NomencladorCiap2;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class RefContraRefProblemaPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "especialidadintercons", referencedColumnName = "especialidadintercons"),
            @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat"),
            @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")})
    private RefContraRef refContraRef;
    @ManyToOne
    @JoinColumn(name = "codigociap2", referencedColumnName = "codigo")
    private NomencladorCiap2 nomencladorCiap2;

    public RefContraRef getRefContraRef() {
        return refContraRef;
    }

    public void setRefContraRef(RefContraRef refContraRef) {
        this.refContraRef = refContraRef;
    }

    public NomencladorCiap2 getNomencladorCiap2() {
        return nomencladorCiap2;
    }

    public void setNomencladorCiap2(NomencladorCiap2 nomencladorCiap2) {
        this.nomencladorCiap2 = nomencladorCiap2;
    }
}
