package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "devollineaalmdin", schema = "farmacia")
public class DevolLineaAlmDin {
    @EmbeddedId
    private DevolLineaAlmDinPK id;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "codigoclase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "codigoitem", referencedColumnName = "item")
    })
    private Item item;
    private Integer cantidad;

    public DevolLineaAlmDinPK getId() {
        return id;
    }

    public void setId(DevolLineaAlmDinPK id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
