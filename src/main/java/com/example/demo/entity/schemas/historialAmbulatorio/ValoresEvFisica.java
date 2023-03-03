package com.example.demo.entity.schemas.historialAmbulatorio;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "valoresevfisica", schema = "historialambulatorio")
public class ValoresEvFisica {
    @EmbeddedId
    private ValoresEvFisicaPK id;
    private Integer tasmin;
    private Integer tasmax;
    private Integer tadmin;
    private Integer tadmax;
    private  Integer frcarmaxc;
    private Integer perimcintmax;

    public ValoresEvFisicaPK getId() {
        return id;
    }

    public void setId(ValoresEvFisicaPK id) {
        this.id = id;
    }

    public Integer getTasmin() {
        return tasmin;
    }

    public void setTasmin(Integer tasmin) {
        this.tasmin = tasmin;
    }

    public Integer getTasmax() {
        return tasmax;
    }

    public void setTasmax(Integer tasmax) {
        this.tasmax = tasmax;
    }

    public Integer getTadmin() {
        return tadmin;
    }

    public void setTadmin(Integer tadmin) {
        this.tadmin = tadmin;
    }

    public Integer getTadmax() {
        return tadmax;
    }

    public void setTadmax(Integer tadmax) {
        this.tadmax = tadmax;
    }

    public Integer getFrcarmaxc() {
        return frcarmaxc;
    }

    public void setFrcarmaxc(Integer frcarmaxc) {
        this.frcarmaxc = frcarmaxc;
    }

    public Integer getPerimcintmax() {
        return perimcintmax;
    }

    public void setPerimcintmax(Integer perimcintmax) {
        this.perimcintmax = perimcintmax;
    }
}
