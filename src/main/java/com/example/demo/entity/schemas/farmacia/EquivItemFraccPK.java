package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class EquivItemFraccPK implements Serializable{
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "item", referencedColumnName = "item")
    })
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
