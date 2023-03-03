package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.farmacia.Item;
import com.example.demo.entity.schemas.farmacia.SolucionEsParenterales;
import com.example.demo.entity.schemas.farmacia.TipoGoteo;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;


import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(schema = "historialinternacion", name = "infusion")
public class Infusion {
    @Id
    private Integer id;
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    @ManyToOne
    @JoinColumn(name = "codigopersonal", referencedColumnName = "codigopersonal")
    private Personal personal;
    private Date fecha;
    private LocalDateTime hora;
    @ManyToOne
    @JoinColumn(name = "solucionparenteral", referencedColumnName = "codigo")
    private SolucionEsParenterales solucionEsParenterale;
    @Column(name = "solucionparenteral2")
    private  String solucionParenteral2;
    @Column(name = "solucionparenteral3")
    private  String solucionParenteral3;
    @Column(name = "solucionparenteral4")
    private  String solucionParenteral4;
    private Integer volumen;
    private Integer volumen2;
    private Integer volumen3;
    private Integer volumen4;
    @Column(name = "cantgoteo")
    private Integer cantGoteo;
    @ManyToOne
    @JoinColumn(name = "tipogoteo", referencedColumnName = "codigo")
    private TipoGoteo tipoGoteo;
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
    private String observaciones;
    @Column(name = "fechasuspension")
    private Date fechaSuspension;
    @Column(name = "horasuspension")
    private LocalDateTime horaSuspension;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clasefarmacoinf1", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "itemfarmacoinf1", referencedColumnName = "item")
    })
    private Item item1;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clasefarmacoinf2", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "itemfarmacoinf2", referencedColumnName = "item")
    })
    private Item item2;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clasefarmacoinf3", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "itemfarmacoinf3", referencedColumnName = "item")
    })
    private Item item3;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clasefarmacoinf4", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "itemfarmacoinf4", referencedColumnName = "item")
    })
    private Item item4;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clasefarmacoinf5", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "itemfarmacoinf5", referencedColumnName = "item")
    })
    private Item item5;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "clasefarmacoinf6", referencedColumnName = "codigoclase"),
            @JoinColumn(name = "itemfarmacoinf6", referencedColumnName = "item")
    })
    private Item item6;
    private String sala;
    @Column(name = "cantgoteofarmaco")
    private Integer cantGoteoFarmaco;
    @ManyToOne
    @JoinColumn(name = "tipogoteofarmaco", referencedColumnName = "codigo")
    private TipoGoteo tipoGoteoFarmaco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setFechaSuspension(Date fechaSuspension) {
        this.fechaSuspension = fechaSuspension;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public SolucionEsParenterales getSolucionEsParenterale() {
        return solucionEsParenterale;
    }

    public void setSolucionEsParenterale(SolucionEsParenterales solucionEsParenterale) {
        this.solucionEsParenterale = solucionEsParenterale;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaSuspension() {
        return fechaSuspension;
    }

    public LocalDateTime getHoraSuspension() {
        return horaSuspension;
    }

    public void setHoraSuspension(LocalDateTime horaSuspension) {
        this.horaSuspension = horaSuspension;
    }

    public Item getItem1() {
        return item1;
    }

    public void setItem1(Item item1) {
        this.item1 = item1;
    }

    public Item getItem2() {
        return item2;
    }

    public void setItem2(Item item2) {
        this.item2 = item2;
    }

    public Item getItem3() {
        return item3;
    }

    public void setItem3(Item item3) {
        this.item3 = item3;
    }

    public Item getItem4() {
        return item4;
    }

    public void setItem4(Item item4) {
        this.item4 = item4;
    }

    public Item getItem5() {
        return item5;
    }

    public void setItem5(Item item5) {
        this.item5 = item5;
    }

    public Item getItem6() {
        return item6;
    }

    public void setItem6(Item item6) {
        this.item6 = item6;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Integer getCantGoteoFarmaco() {
        return cantGoteoFarmaco;
    }

    public void setCantGoteoFarmaco(Integer cantGoteoFarmaco) {
        this.cantGoteoFarmaco = cantGoteoFarmaco;
    }

    public TipoGoteo getTipoGoteoFarmaco() {
        return tipoGoteoFarmaco;
    }

    public void setTipoGoteoFarmaco(TipoGoteo tipoGoteoFarmaco) {
        this.tipoGoteoFarmaco = tipoGoteoFarmaco;
    }
}
