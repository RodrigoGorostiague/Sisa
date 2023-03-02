package com.example.demo.entity.schemas.farmaciaKairos;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class PrecioPorProductoPK implements Serializable {
    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "codigoproducto", referencedColumnName = "codigoproducto"),
            @JoinColumn(name = "codigopresentacion", referencedColumnName = "codigopresentacion")
    })
    private Presentacion presentacion;

    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }
}
