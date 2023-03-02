package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class StockPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "codigour", referencedColumnName = "codigour")
    private UnidadesRecepcion unidadesRecepcion;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "codigoclase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "item", referencedColumnName = "item")
    })
    private Item item;

    public UnidadesRecepcion getUnidadesRecepcion() {
        return unidadesRecepcion;
    }

    public void setUnidadesRecepcion(UnidadesRecepcion unidadesRecepcion) {
        this.unidadesRecepcion = unidadesRecepcion;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
