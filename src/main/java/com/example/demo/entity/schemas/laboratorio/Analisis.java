package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "analisis", schema = "laboratorio")
public class Analisis {
    @EmbeddedId
    private AnalisisPK id;
    private Integer protocolo;
    @Column(name = "codigoanalisis")
    private Integer codigoAnalisis;
    private String estado;

    public AnalisisPK getId() {
        return id;
    }

    public void setId(AnalisisPK id) {
        this.id = id;
    }

    public Integer getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Integer protocolo) {
        this.protocolo = protocolo;
    }

    public Integer getCodigoAnalisis() {
        return codigoAnalisis;
    }

    public void setCodigoAnalisis(Integer codigoAnalisis) {
        this.codigoAnalisis = codigoAnalisis;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
