package com.example.demo.entity.schemas.vacunacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "recepcionvacunaencabezado", schema = "vacunacion")
public class RecepcionVacunaEncabezado {
    @EmbeddedId
    private RecepcionVacunaEncabezadoPK id;
    @Column(name = "uniatemisora")
    private String uniatEmisora;
    private String institucion;
    private String observacion;

    public RecepcionVacunaEncabezadoPK getId() {
        return id;
    }

    public void setId(RecepcionVacunaEncabezadoPK id) {
        this.id = id;
    }

    public String getUniatEmisora() {
        return uniatEmisora;
    }

    public void setUniatEmisora(String uniatEmisora) {
        this.uniatEmisora = uniatEmisora;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
