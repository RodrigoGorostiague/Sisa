package com.example.demo.entity.schemas.hc;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class MovimientoArchivoPK implements Serializable {
    @Column(name = "numeromovimiento")
    private Integer numeroMovimiento;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "historiaclinica", referencedColumnName = "historiaclinica"),
            @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    })
    private CarpetaHc carpetaHc;

    public Integer getNumeroMovimiento() {
        return numeroMovimiento;
    }

    public void setNumeroMovimiento(Integer numeroMovimiento) {
        this.numeroMovimiento = numeroMovimiento;
    }

    public CarpetaHc getCarpetaHc() {
        return carpetaHc;
    }

    public void setCarpetaHc(CarpetaHc carpetaHc) {
        this.carpetaHc = carpetaHc;
    }
}
