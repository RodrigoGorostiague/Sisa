package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "auditoria", name = "movimientovacuna")
public class MovimientoVacuna {
    @EmbeddedId
    private MovimientoVacunaPK id;
    private String operacion;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "numlote")
    private String numLote;

    public MovimientoVacunaPK getId() {
        return id;
    }

    public void setId(MovimientoVacunaPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public String getNumLote() {
        return numLote;
    }

    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }
}
