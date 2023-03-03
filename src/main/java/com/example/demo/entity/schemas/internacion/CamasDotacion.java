package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "camasdotacion", schema = "internacion")
public class CamasDotacion {
    @EmbeddedId
    private CamasDotacionPK id;
    @Column(name = "cantidadcamas")
    private Integer cantidadCamas;

    public CamasDotacionPK getId() {
        return id;
    }

    public void setId(CamasDotacionPK id) {
        this.id = id;
    }

    public Integer getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(Integer cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }
}
