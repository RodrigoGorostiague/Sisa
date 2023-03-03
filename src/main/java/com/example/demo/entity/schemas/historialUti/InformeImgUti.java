package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "informeimguti", schema = "historialuti")
public class InformeImgUti {
    @EmbeddedId
    private InformeImgUtiPK id;
    @Column(name = "nroinforme")
    private Integer nroInforme;

    public InformeImgUtiPK getId() {
        return id;
    }

    public void setId(InformeImgUtiPK id) {
        this.id = id;
    }

    public Integer getNroInforme() {
        return nroInforme;
    }

    public void setNroInforme(Integer nroInforme) {
        this.nroInforme = nroInforme;
    }
}
