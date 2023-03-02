package com.example.demo.entity.schemas.cobranzasAud;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "cobranza_aud", name = "reimput_cobro")
public class ReImputCobroAud {
    @EmbeddedId
    private ReImputCobroAudPK id;
    private String operacion;
    @Column(name = "sucursal_dest")
    private String sucursalDest;
    @Column(name = "resumen_dest")
    private Integer resumenDest;
    @Column(name = "amb_int_dest")
    private String ambIntDest;
    private Double cobrado;

    public ReImputCobroAudPK getId() {
        return id;
    }

    public void setId(ReImputCobroAudPK id) {
        this.id = id;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getSucursalDest() {
        return sucursalDest;
    }

    public void setSucursalDest(String sucursalDest) {
        this.sucursalDest = sucursalDest;
    }

    public Integer getResumenDest() {
        return resumenDest;
    }

    public void setResumenDest(Integer resumenDest) {
        this.resumenDest = resumenDest;
    }

    public String getAmbIntDest() {
        return ambIntDest;
    }

    public void setAmbIntDest(String ambIntDest) {
        this.ambIntDest = ambIntDest;
    }

    public Double getCobrado() {
        return cobrado;
    }

    public void setCobrado(Double cobrado) {
        this.cobrado = cobrado;
    }
}
