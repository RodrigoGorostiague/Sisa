package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "equivitemfracc", schema = "farmacia")
public class EquivItemFracc {
    @EmbeddedId
    private EquivItemFraccPK id;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clasefrac", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "itemfrac", referencedColumnName = "item")
    })
    private Item item;
    private Integer cantidad;

    public EquivItemFraccPK getId() {
        return id;
    }

    public void setId(EquivItemFraccPK id) {
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
