package com.example.demo.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "receplineaalmdin", schema = "farmacia")
public class RecepLineaAlmDin {
    @EmbeddedId
    private RecepLineaAlmDinPK id;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "codigoclase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "codigoitem", referencedColumnName = "item")
    })
    private Item item;
    private Integer cantidad;
    @Column(name = "costounitario")
    private Integer costoUnitario;

    public RecepLineaAlmDinPK getId() {
        return id;
    }

    public void setId(RecepLineaAlmDinPK id) {
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

    public Integer getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(Integer costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
}
