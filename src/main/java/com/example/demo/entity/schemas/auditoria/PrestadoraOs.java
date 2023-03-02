package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestadoraos", schema = "auditoria")
public class PrestadoraOs {
    @EmbeddedId
    private PrestadoraOsPK id;
    private String usuario;
    @Column(name = "obrasocial")
    private String obraSocial;
    @Column(name = "prestadoraold")
    private String prestadoraOld;
    @Column(name = "prestadoranew")
    private String prestadoraNew;

    public PrestadoraOsPK getId() {
        return id;
    }

    public void setId(PrestadoraOsPK id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getPrestadoraOld() {
        return prestadoraOld;
    }

    public void setPrestadoraOld(String prestadoraOld) {
        this.prestadoraOld = prestadoraOld;
    }

    public String getPrestadoraNew() {
        return prestadoraNew;
    }

    public void setPrestadoraNew(String prestadoraNew) {
        this.prestadoraNew = prestadoraNew;
    }
}
