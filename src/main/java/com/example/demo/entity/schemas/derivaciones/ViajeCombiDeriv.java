package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "derivaciones", name = "viajecombi")
public class ViajeCombiDeriv {
    @EmbeddedId
    private ViajeCombiDerivPK id;
    @Column(name = "reservasida")
    private Integer reservasIda;
    @Column(name = "reservasvuelta")
    private Integer reservasVuelta;
    private String bloqueda;
    @Column(name = "pertenenciacombi")
    private String pertenenciaCombi;

    public ViajeCombiDerivPK getId() {
        return id;
    }

    public void setId(ViajeCombiDerivPK id) {
        this.id = id;
    }

    public Integer getReservasIda() {
        return reservasIda;
    }

    public void setReservasIda(Integer reservasIda) {
        this.reservasIda = reservasIda;
    }

    public Integer getReservasVuelta() {
        return reservasVuelta;
    }

    public void setReservasVuelta(Integer reservasVuelta) {
        this.reservasVuelta = reservasVuelta;
    }

    public String getBloqueda() {
        return bloqueda;
    }

    public void setBloqueda(String bloqueda) {
        this.bloqueda = bloqueda;
    }

    public String getPertenenciaCombi() {
        return pertenenciaCombi;
    }

    public void setPertenenciaCombi(String pertenenciaCombi) {
        this.pertenenciaCombi = pertenenciaCombi;
    }
}
