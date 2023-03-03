package com.example.demo.entity.schemas.personal;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "accesopersonal", schema = "personal")
public class AccesoPersonal {
    @EmbeddedId
    private AccesoPersonalPK id;
    @Column(name = "fechaalta")
    private Date fechaAlta;
    @Column(name = "codigopersonalalta")
    private String codigoPersonalAlta;

    public AccesoPersonalPK getId() {
        return id;
    }

    public void setId(AccesoPersonalPK id) {
        this.id = id;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCodigoPersonalAlta() {
        return codigoPersonalAlta;
    }

    public void setCodigoPersonalAlta(String codigoPersonalAlta) {
        this.codigoPersonalAlta = codigoPersonalAlta;
    }
}
