package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "accesoexterno")
public class AccesoExterno {
    @Id
    private String codigopersonal;
    private String observacion;

    public String getCodigopersonal() {
        return codigopersonal;
    }

    public void setCodigopersonal(String codigopersonal) {
        this.codigopersonal = codigopersonal;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
