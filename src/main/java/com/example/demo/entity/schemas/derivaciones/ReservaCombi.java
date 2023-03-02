package com.example.demo.entity.schemas.derivaciones;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "derivaciones", name = "reservacombi")
public class ReservaCombi {
    @EmbeddedId
    private ReservaCombiPK id;
    private Integer plazas;
    private String contacto;
    private String estado;
    private String vale;
    private String observaciones;
    @Column(name = "realizaviaje")
    private String realizaViaje;

    public ReservaCombiPK getId() {
        return id;
    }

    public void setId(ReservaCombiPK id) {
        this.id = id;
    }

    public Integer getPlazas() {
        return plazas;
    }

    public void setPlazas(Integer plazas) {
        this.plazas = plazas;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVale() {
        return vale;
    }

    public void setVale(String vale) {
        this.vale = vale;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getRealizaViaje() {
        return realizaViaje;
    }

    public void setRealizaViaje(String realizaViaje) {
        this.realizaViaje = realizaViaje;
    }
}
