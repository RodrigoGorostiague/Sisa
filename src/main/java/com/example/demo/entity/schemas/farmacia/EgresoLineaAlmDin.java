package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "egresolineaalmdin", schema = "farmacia")
public class EgresoLineaAlmDin {
    @EmbeddedId
    private EgresoLineaAlmDinPK id;
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "codigoclase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "codigoItem", referencedColumnName = "codigoItem")
    })
    private List<Item> item;
    private Integer cantidad;

    public EgresoLineaAlmDinPK getId() {
        return id;
    }

    public void setId(EgresoLineaAlmDinPK id) {
        this.id = id;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
