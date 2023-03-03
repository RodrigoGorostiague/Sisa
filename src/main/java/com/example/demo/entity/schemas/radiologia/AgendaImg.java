package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "agendaimg", schema = "radiologia")
public class AgendaImg {
    @EmbeddedId
    private AgendaImgPK id;
    @Column(name = "fechafinvigencia")
    private Date fechaFinVigencia;
    @Column(name = "cantant")
    private Integer cantAnt;
    @Column(name = "canturg")
    private Integer cantUrg;
    private Integer duracion;
    @Column(name = "tipopractica")
    private String tipoPractica;

    public AgendaImgPK getId() {
        return id;
    }

    public void setId(AgendaImgPK id) {
        this.id = id;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Integer getCantAnt() {
        return cantAnt;
    }

    public void setCantAnt(Integer cantAnt) {
        this.cantAnt = cantAnt;
    }

    public Integer getCantUrg() {
        return cantUrg;
    }

    public void setCantUrg(Integer cantUrg) {
        this.cantUrg = cantUrg;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getTipoPractica() {
        return tipoPractica;
    }

    public void setTipoPractica(String tipoPractica) {
        this.tipoPractica = tipoPractica;
    }
}
