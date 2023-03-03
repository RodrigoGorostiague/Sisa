package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "partidos_indec_ref_iop", schema = "resapro")
public class PartidosIndecRefIop {
    @EmbeddedId
    private PartidosIndecRefIopPK id;
    private String decrip;
    @Column(name = "red_id_partido_interoperabilidad")
    private Integer redIdPartidoInteroperabilidad;
    private String vigente;
    @Column(name = "fecha_baja")
    private Date fechaBaja;

    public PartidosIndecRefIopPK getId() {
        return id;
    }

    public void setId(PartidosIndecRefIopPK id) {
        this.id = id;
    }

    public String getDecrip() {
        return decrip;
    }

    public void setDecrip(String decrip) {
        this.decrip = decrip;
    }

    public Integer getRedIdPartidoInteroperabilidad() {
        return redIdPartidoInteroperabilidad;
    }

    public void setRedIdPartidoInteroperabilidad(Integer redIdPartidoInteroperabilidad) {
        this.redIdPartidoInteroperabilidad = redIdPartidoInteroperabilidad;
    }

    public String getVigente() {
        return vigente;
    }

    public void setVigente(String vigente) {
        this.vigente = vigente;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}
