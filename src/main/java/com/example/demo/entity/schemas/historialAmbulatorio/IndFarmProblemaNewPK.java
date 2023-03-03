package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.nomencladores.NomencladorCiap2;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class IndFarmProblemaNewPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "nroConsulta", referencedColumnName = "nroConsulta"),
            @JoinColumn(name = "clase", referencedColumnName = "clase"),
            @JoinColumn(name = "item", referencedColumnName = "item")})
    private IndFarmNew indFarm;
    @ManyToOne
    @JoinColumn(name = "codigociap2", referencedColumnName =  "codigo")
    private NomencladorCiap2 nomencladorCiap2;

    public IndFarmNew getIndFarm() {
        return indFarm;
    }

    public void setIndFarm(IndFarmNew indFarm) {
        this.indFarm = indFarm;
    }

    public NomencladorCiap2 getNomencladorCiap2() {
        return nomencladorCiap2;
    }

    public void setNomencladorCiap2(NomencladorCiap2 nomencladorCiap2) {
        this.nomencladorCiap2 = nomencladorCiap2;
    }
}
