package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "cambioclave")
public class CambioClave {
    @EmbeddedId
    private CambioClavePK id;
    @Column(name = "clavenueva")
    private String claveNueva;
    private String ip;

    public CambioClavePK getId() {
        return id;
    }

    public void setId(CambioClavePK id) {
        this.id = id;
    }

    public String getClaveNueva() {
        return claveNueva;
    }

    public void setClaveNueva(String claveNueva) {
        this.claveNueva = claveNueva;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
