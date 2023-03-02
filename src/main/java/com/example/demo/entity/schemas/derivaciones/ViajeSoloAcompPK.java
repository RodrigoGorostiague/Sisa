package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ViajeSoloAcompPK implements Serializable {
    @Column(name = "fechaviaje")
    private Date fechaViaje;
    @Column(name = "tipodoc")
    private String tipoDoc;
    @Column(name = "nrodoc")
    private String nroDoc;
    @Column(name = "idavuelta")
    private String idaVuelta;

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getIdaVuelta() {
        return idaVuelta;
    }

    public void setIdaVuelta(String idaVuelta) {
        this.idaVuelta = idaVuelta;
    }
}
