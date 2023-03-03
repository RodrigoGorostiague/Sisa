package com.example.demo.entity.schemas.planNacer;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "nomencladorequivcie10_nuevo", schema = "plannacer")
public class NomencladorEquivCie10Nuevo {
    @EmbeddedId
    private NomencladorEquivCie10NuevoPK id;
    private String descripcion;

    public NomencladorEquivCie10NuevoPK getId() {
        return id;
    }

    public void setId(NomencladorEquivCie10NuevoPK id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
