package com.example.demo.entity.schemas.farmacia;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class ItemSalaPK implements Serializable {
    @Column(name = "codigosala")
    private String codigoSala;
    @ManyToOne
    @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    private UnidadAtencion unidadAtencion;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "item", referencedColumnName = "item")
    })
    private Item item;

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public UnidadAtencion getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(UnidadAtencion unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
