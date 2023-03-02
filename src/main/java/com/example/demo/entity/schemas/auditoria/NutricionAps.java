package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "auditoria", name = "nutricionaps")
public class NutricionAps {
    @EmbeddedId
    private NutricionApsPK id;
    @Column(name = "fechainscrip")
    private Date fechaInscrip;
    private String operaciop;

    public NutricionApsPK getId() {
        return id;
    }

    public void setId(NutricionApsPK id) {
        this.id = id;
    }

    public Date getFechaInscrip() {
        return fechaInscrip;
    }

    public void setFechaInscrip(Date fechaInscrip) {
        this.fechaInscrip = fechaInscrip;
    }

    public String getOperaciop() {
        return operaciop;
    }

    public void setOperaciop(String operaciop) {
        this.operaciop = operaciop;
    }
}
