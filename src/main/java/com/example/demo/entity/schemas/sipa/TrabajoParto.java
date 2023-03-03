package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "trabajoparto", schema = "sipa")
public class TrabajoParto {
    @EmbeddedId
    private TrabajoPartoPK id;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    @Column(name = "posicionmadre")
    private String posicionMadre;
    private Integer pa1;
    private Integer pa2;
    private Integer pulso;
    @Column(name = "contrcada10min")
    private Integer contrCada10Min;
    private Integer dilatacion;
    @Column(name = "alturapresent")
    private Integer alturaPresent;
    @Column(name = "variedadposic")
    private String variedadPosic;
    private String meconio;
    @Column(name = "freccardiacafeto")
    private Integer frecCardiacaFeto;

    public TrabajoPartoPK getId() {
        return id;
    }

    public void setId(TrabajoPartoPK id) {
        this.id = id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getPosicionMadre() {
        return posicionMadre;
    }

    public void setPosicionMadre(String posicionMadre) {
        this.posicionMadre = posicionMadre;
    }

    public Integer getPa1() {
        return pa1;
    }

    public void setPa1(Integer pa1) {
        this.pa1 = pa1;
    }

    public Integer getPa2() {
        return pa2;
    }

    public void setPa2(Integer pa2) {
        this.pa2 = pa2;
    }

    public Integer getPulso() {
        return pulso;
    }

    public void setPulso(Integer pulso) {
        this.pulso = pulso;
    }

    public Integer getContrCada10Min() {
        return contrCada10Min;
    }

    public void setContrCada10Min(Integer contrCada10Min) {
        this.contrCada10Min = contrCada10Min;
    }

    public Integer getDilatacion() {
        return dilatacion;
    }

    public void setDilatacion(Integer dilatacion) {
        this.dilatacion = dilatacion;
    }

    public Integer getAlturaPresent() {
        return alturaPresent;
    }

    public void setAlturaPresent(Integer alturaPresent) {
        this.alturaPresent = alturaPresent;
    }

    public String getVariedadPosic() {
        return variedadPosic;
    }

    public void setVariedadPosic(String variedadPosic) {
        this.variedadPosic = variedadPosic;
    }

    public String getMeconio() {
        return meconio;
    }

    public void setMeconio(String meconio) {
        this.meconio = meconio;
    }

    public Integer getFrecCardiacaFeto() {
        return frecCardiacaFeto;
    }

    public void setFrecCardiacaFeto(Integer frecCardiacaFeto) {
        this.frecCardiacaFeto = frecCardiacaFeto;
    }
}
