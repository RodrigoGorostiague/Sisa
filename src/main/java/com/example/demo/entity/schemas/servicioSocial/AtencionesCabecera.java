package com.example.demo.entity.schemas.servicioSocial;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "atencionescabecera", schema = "serviciosocial")
public class AtencionesCabecera {
    @EmbeddedId
    private AtencionesCabeceraPK id;
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "unidadatencion")
    private String unidadAtencion;
    private String observaciones;

    public AtencionesCabeceraPK getId() {
        return id;
    }

    public void setId(AtencionesCabeceraPK id) {
        this.id = id;
    }

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getUnidadAtencion() {
        return unidadAtencion;
    }

    public void setUnidadAtencion(String unidadAtencion) {
        this.unidadAtencion = unidadAtencion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
