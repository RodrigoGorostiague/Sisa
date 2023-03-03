package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.nomencladores.NomencladorCiap2;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class IndFarmProblemaPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "codigomedicamento", referencedColumnName = "codigomedicamento"),
            @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")})
    private IndFarm indFarm;
    @ManyToOne
    @JoinColumn(name = "codigociap2", referencedColumnName =  "codigo")
    private NomencladorCiap2 nomencladorCiap2;

    public IndFarm getIndFarm() {
        return indFarm;
    }

    public void setIndFarm(IndFarm indFarm) {
        this.indFarm = indFarm;
    }

    public NomencladorCiap2 getNomencladorCiap2() {
        return nomencladorCiap2;
    }

    public void setNomencladorCiap2(NomencladorCiap2 nomencladorCiap2) {
        this.nomencladorCiap2 = nomencladorCiap2;
    }
}
