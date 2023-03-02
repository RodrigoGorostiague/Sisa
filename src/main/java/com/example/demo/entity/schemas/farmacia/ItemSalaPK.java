package com.api.sisa.entity.schemas.farmacia;

import com.api.sisa.entity.schemas.organizacion.UnidadAtencion;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Embeddable
public class ItemSalaPK implements Serializable {
    @Column(name = "codigosala")
    private String codigoSala;
    @OneToMany
    @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    private List<UnidadAtencion> unidadAtencion;
    @OneToMany
    @JoinColumns({
            @JoinColumn(name = "clase", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "item", referencedColumnName = "item")
    })
    private List<Item> item;

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public List<UnidadAtencion> getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(List<UnidadAtencion> unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
