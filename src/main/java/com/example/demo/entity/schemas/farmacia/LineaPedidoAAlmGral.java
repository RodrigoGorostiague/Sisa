package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "lineapedidoaalmgral", schema = "farmacia")
public class LineaPedidoAAlmGral {
    @EmbeddedId
    private LineaPedidoAAlmGralPK id;
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "codigoClase", referencedColumnName = "codigoClase"),
            @JoinColumn(name = "codigoClase", referencedColumnName = "codigoClase")
    })
    private List<Item> item;
    private Integer cantidad;
    private Integer costounitario;

    public LineaPedidoAAlmGralPK getId() {
        return id;
    }

    public void setId(LineaPedidoAAlmGralPK id) {
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

    public Integer getCostounitario() {
        return costounitario;
    }

    public void setCostounitario(Integer costounitario) {
        this.costounitario = costounitario;
    }
}
