package com.example.demo.entity.schemas.sisaNacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mapeolocalidad", schema = "sisanacion")
public class MapeoLocalidad {
    @EmbeddedId
    private MapeoLocalidadPK id;
    @Column(name = "idnacion")
    private Integer idNacion;

    public MapeoLocalidadPK getId() {
        return id;
    }

    public void setId(MapeoLocalidadPK id) {
        this.id = id;
    }

    public Integer getIdNacion() {
        return idNacion;
    }

    public void setIdNacion(Integer idNacion) {
        this.idNacion = idNacion;
    }
}
