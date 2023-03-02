package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class itemBackPK implements Serializable {
    @Column(name = "codigoclase")
    private Integer codigoClase;
    private Integer item;

    public Integer getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(Integer codigoClase) {
        this.codigoClase = codigoClase;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}
