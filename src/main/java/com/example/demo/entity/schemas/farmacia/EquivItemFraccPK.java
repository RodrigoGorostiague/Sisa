package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class EquivItemFraccPK implements Serializable{
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "clase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "item", referencedColumnName = "item")
    })
    private List<Item> item;

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
