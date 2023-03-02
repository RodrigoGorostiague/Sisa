package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.farmacia.Item;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class ConsumoFarLineaPK implements Serializable {
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "uniat", referencedColumnName = "uniat"),
            @JoinColumn(name = "nrocon", referencedColumnName = "nrocon"),
            @JoinColumn(name = "profesional", referencedColumnName = "profesional")
    })
    private ConsumoFarCabecera consumoFarCabecera;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "calse", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "item", referencedColumnName = "item")
    })
    private Item item;

    public ConsumoFarCabecera getConsumoFarCabecera() {
        return consumoFarCabecera;
    }

    public void setConsumoFarCabecera(ConsumoFarCabecera consumoFarCabecera) {
        this.consumoFarCabecera = consumoFarCabecera;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
