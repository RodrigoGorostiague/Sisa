package com.api.sisa.entity.schemas.farmacia;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sectoresambentregainmediata", schema = "farmacia")
public class SectorEsAmbEntregaInmediata {
    @Id
    private Integer codigo;
    private String descripcion;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
