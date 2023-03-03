package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.farmacia.TipoGoteo;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "administracioninfusionnoprescripta", schema = "historialinternacion")
public class AdministracionInfusionNoPrescripta {
    @Id
    private Integer id;
    private Date fecha;
    private LocalDateTime hora;
    private String observacion;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @Column(name = "solucionparenteral")
    private String solucionParenteral;
    @Column(name = "solucionparenteral2")
    private String solucionParenteral2;
    @Column(name = "solucionparenteral3")
    private String solucionParenteral3;
    @Column(name = "solucionparenteral4")
    private String solucionParenteral4;
    private Integer volumen;
    private Integer volumen2;
    private Integer volumen3;
    private Integer volumen4;
    @Column(name = "dosisfarmaco1")
    private String dosisFarmaco1;
    @Column(name = "dosisfarmaco2")
    private String dosisFarmaco2;
    @Column(name = "dosisfarmaco3")
    private String dosisFarmaco3;
    @Column(name = "dosisfarmaco4")
    private String dosisFarmaco4;
    @Column(name = "dosisfarmaco5")
    private String dosisFarmaco5;
    @Column(name = "dosisfarmaco6")
    private String dosisFarmaco6;
    @Column(name = "itemfarmacoinf1")
    private Integer itemFarmacoInf1;
    @Column(name = "itemfarmacoinf2")
    private Integer itemFarmacoInf2;
    @Column(name = "itemfarmacoinf3")
    private Integer itemFarmacoInf3;
    @Column(name = "itemfarmacoinf4")
    private Integer itemFarmacoInf4;
    @Column(name = "itemfarmacoinf5")
    private Integer itemFarmacoInf5;
    @Column(name = "itemfarmacoinf6")
    private Integer itemFarmacoInf6;
    @Column(name = "clasefarmacoinf1")
    private Integer claseFarmacoInf1;
    @Column(name = "clasefarmacoinf2")
    private Integer claseFarmacoInf2;
    @Column(name = "clasefarmacoinf3")
    private Integer claseFarmacoInf3;
    @Column(name = "clasefarmacoinf4")
    private Integer claseFarmacoInf4;
    @Column(name = "clasefarmacoinf5")
    private Integer claseFarmacoInf5;
    @Column(name = "clasefarmacoinf6")
    private Integer claseFarmacoInf6;
    @Column(name = "cantgoteo")
    private Integer cantGoteo;
    @ManyToOne
    @JoinColumn(name = "tipogoteo", referencedColumnName = "codigo")
    private TipoGoteo tipoGoteo;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getSolucionParenteral() {
        return solucionParenteral;
    }

    public void setSolucionParenteral(String solucionParenteral) {
        this.solucionParenteral = solucionParenteral;
    }

    public String getSolucionParenteral2() {
        return solucionParenteral2;
    }

    public void setSolucionParenteral2(String solucionParenteral2) {
        this.solucionParenteral2 = solucionParenteral2;
    }

    public String getSolucionParenteral3() {
        return solucionParenteral3;
    }

    public void setSolucionParenteral3(String solucionParenteral3) {
        this.solucionParenteral3 = solucionParenteral3;
    }

    public String getSolucionParenteral4() {
        return solucionParenteral4;
    }

    public void setSolucionParenteral4(String solucionParenteral4) {
        this.solucionParenteral4 = solucionParenteral4;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public Integer getVolumen2() {
        return volumen2;
    }

    public void setVolumen2(Integer volumen2) {
        this.volumen2 = volumen2;
    }

    public Integer getVolumen3() {
        return volumen3;
    }

    public void setVolumen3(Integer volumen3) {
        this.volumen3 = volumen3;
    }

    public Integer getVolumen4() {
        return volumen4;
    }

    public void setVolumen4(Integer volumen4) {
        this.volumen4 = volumen4;
    }

    public String getDosisFarmaco1() {
        return dosisFarmaco1;
    }

    public void setDosisFarmaco1(String dosisFarmaco1) {
        this.dosisFarmaco1 = dosisFarmaco1;
    }

    public String getDosisFarmaco2() {
        return dosisFarmaco2;
    }

    public void setDosisFarmaco2(String dosisFarmaco2) {
        this.dosisFarmaco2 = dosisFarmaco2;
    }

    public String getDosisFarmaco3() {
        return dosisFarmaco3;
    }

    public void setDosisFarmaco3(String dosisFarmaco3) {
        this.dosisFarmaco3 = dosisFarmaco3;
    }

    public String getDosisFarmaco4() {
        return dosisFarmaco4;
    }

    public void setDosisFarmaco4(String dosisFarmaco4) {
        this.dosisFarmaco4 = dosisFarmaco4;
    }

    public String getDosisFarmaco5() {
        return dosisFarmaco5;
    }

    public void setDosisFarmaco5(String dosisFarmaco5) {
        this.dosisFarmaco5 = dosisFarmaco5;
    }

    public String getDosisFarmaco6() {
        return dosisFarmaco6;
    }

    public void setDosisFarmaco6(String dosisFarmaco6) {
        this.dosisFarmaco6 = dosisFarmaco6;
    }

    public Integer getItemFarmacoInf1() {
        return itemFarmacoInf1;
    }

    public void setItemFarmacoInf1(Integer itemFarmacoInf1) {
        this.itemFarmacoInf1 = itemFarmacoInf1;
    }

    public Integer getItemFarmacoInf2() {
        return itemFarmacoInf2;
    }

    public void setItemFarmacoInf2(Integer itemFarmacoInf2) {
        this.itemFarmacoInf2 = itemFarmacoInf2;
    }

    public Integer getItemFarmacoInf3() {
        return itemFarmacoInf3;
    }

    public void setItemFarmacoInf3(Integer itemFarmacoInf3) {
        this.itemFarmacoInf3 = itemFarmacoInf3;
    }

    public Integer getItemFarmacoInf4() {
        return itemFarmacoInf4;
    }

    public void setItemFarmacoInf4(Integer itemFarmacoInf4) {
        this.itemFarmacoInf4 = itemFarmacoInf4;
    }

    public Integer getItemFarmacoInf5() {
        return itemFarmacoInf5;
    }

    public void setItemFarmacoInf5(Integer itemFarmacoInf5) {
        this.itemFarmacoInf5 = itemFarmacoInf5;
    }

    public Integer getItemFarmacoInf6() {
        return itemFarmacoInf6;
    }

    public void setItemFarmacoInf6(Integer itemFarmacoInf6) {
        this.itemFarmacoInf6 = itemFarmacoInf6;
    }

    public Integer getClaseFarmacoInf1() {
        return claseFarmacoInf1;
    }

    public void setClaseFarmacoInf1(Integer claseFarmacoInf1) {
        this.claseFarmacoInf1 = claseFarmacoInf1;
    }

    public Integer getClaseFarmacoInf2() {
        return claseFarmacoInf2;
    }

    public void setClaseFarmacoInf2(Integer claseFarmacoInf2) {
        this.claseFarmacoInf2 = claseFarmacoInf2;
    }

    public Integer getClaseFarmacoInf3() {
        return claseFarmacoInf3;
    }

    public void setClaseFarmacoInf3(Integer claseFarmacoInf3) {
        this.claseFarmacoInf3 = claseFarmacoInf3;
    }

    public Integer getClaseFarmacoInf4() {
        return claseFarmacoInf4;
    }

    public void setClaseFarmacoInf4(Integer claseFarmacoInf4) {
        this.claseFarmacoInf4 = claseFarmacoInf4;
    }

    public Integer getClaseFarmacoInf5() {
        return claseFarmacoInf5;
    }

    public void setClaseFarmacoInf5(Integer claseFarmacoInf5) {
        this.claseFarmacoInf5 = claseFarmacoInf5;
    }

    public Integer getClaseFarmacoInf6() {
        return claseFarmacoInf6;
    }

    public void setClaseFarmacoInf6(Integer claseFarmacoInf6) {
        this.claseFarmacoInf6 = claseFarmacoInf6;
    }

    public Integer getCantGoteo() {
        return cantGoteo;
    }

    public void setCantGoteo(Integer cantGoteo) {
        this.cantGoteo = cantGoteo;
    }

    public TipoGoteo getTipoGoteo() {
        return tipoGoteo;
    }

    public void setTipoGoteo(TipoGoteo tipoGoteo) {
        this.tipoGoteo = tipoGoteo;
    }
}
