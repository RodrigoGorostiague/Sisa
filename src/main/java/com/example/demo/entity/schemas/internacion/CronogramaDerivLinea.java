package com.example.demo.entity.schemas.internacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cronogramaderivlinea", schema = "internacion")
public class CronogramaDerivLinea {
    @EmbeddedId
    private CronogramaDerivLineaPK id;
    private String institucion;
    private String tramitacion;

    public CronogramaDerivLineaPK getId() {
        return id;
    }

    public void setId(CronogramaDerivLineaPK id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTramitacion() {
        return tramitacion;
    }

    public void setTramitacion(String tramitacion) {
        this.tramitacion = tramitacion;
    }
}
