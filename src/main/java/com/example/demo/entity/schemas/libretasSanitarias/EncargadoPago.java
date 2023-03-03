package com.example.demo.entity.schemas.libretasSanitarias;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "encargadopago", schema = "libretassanitarias")
public class EncargadoPago {
    @EmbeddedId
    private EncargadoPagoPK id;
    private Boolean paga;
    @Column(name = "fechabaja")
    private Date fechaBaja;

    public EncargadoPagoPK getId() {
        return id;
    }

    public void setId(EncargadoPagoPK id) {
        this.id = id;
    }

    public Boolean getPaga() {
        return paga;
    }

    public void setPaga(Boolean paga) {
        this.paga = paga;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}
