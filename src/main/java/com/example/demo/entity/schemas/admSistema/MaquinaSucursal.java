package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "maquinasucursal")
public class MaquinaSucursal {
    @EmbeddedId
    private MaquinasucursalPK id;

    public MaquinasucursalPK getId() {
        return id;
    }

    public void setId(MaquinasucursalPK id) {
        this.id = id;
    }
}
