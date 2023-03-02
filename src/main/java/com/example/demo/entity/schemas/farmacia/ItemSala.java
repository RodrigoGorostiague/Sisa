package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemsala", schema = "farmacia")
public class ItemSala {
    @EmbeddedId
    private ItemSalaPK id;

    public ItemSalaPK getId() {
        return id;
    }

    public void setId(ItemSalaPK id) {
        this.id = id;
    }
}
