package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "ingresosegresos")
public class IngresosEgresos {
    @EmbeddedId
    private IngresosEgresosPK id;
    @Column(name = "ingresos_php")
    private Integer ingresosPhp;
    @Column(name = "ingresos_enteral")
    private Integer ingresosEnteral;
    @Column(name = "ingresos_vo")
    private Integer ingresosVo;
    @Column(name = "ingresos_medicacion")
    private Integer ingresosMedicacion;
    @Column(name = "egresos_diuresis")
    private Integer egresosDiuresis;
    @Column(name = "egresos_vom")
    private Integer egresosVom;
    @Column(name = "egresos_sng")
    private Integer egresosSng;
    @Column(name = "egresos_drenajes")
    private Integer egresosDrenajes;
    @Column(name = "egresos_drenajes2")
    private Integer egresosDrenajes2;
    @Column(name = "egresos_drenajes3")
    private Integer egresosDrenajes3;
    @Column(name = "egresos_catarsis")
    private Integer egresosCatarsis;
    @Column(name = "egresos_pi")
    private Integer egresosPi;
    @Column(name = "ingresos_otros")
    private Integer ingresosOtros;
    @Column(name = "egresos_otros")
    private Integer egresosOtros;
    @Column(name = "ritmodiuretico")
    private Integer ritmoDiuretico;
    @Column(name = "ingresos_otros_desc")
    private String ingresosOtrosDesc;
    @Column(name = "egresos_otros_desc")
    private String egresosOtrosDesc;
    @Column(name = "ingresos_parenteral_tipo")
    private String ingresosParenteralTipo;

    public IngresosEgresosPK getId() {
        return id;
    }

    public void setId(IngresosEgresosPK id) {
        this.id = id;
    }

    public Integer getIngresosPhp() {
        return ingresosPhp;
    }

    public void setIngresosPhp(Integer ingresosPhp) {
        this.ingresosPhp = ingresosPhp;
    }

    public Integer getIngresosEnteral() {
        return ingresosEnteral;
    }

    public void setIngresosEnteral(Integer ingresosEnteral) {
        this.ingresosEnteral = ingresosEnteral;
    }

    public Integer getIngresosVo() {
        return ingresosVo;
    }

    public void setIngresosVo(Integer ingresosVo) {
        this.ingresosVo = ingresosVo;
    }

    public Integer getIngresosMedicacion() {
        return ingresosMedicacion;
    }

    public void setIngresosMedicacion(Integer ingresosMedicacion) {
        this.ingresosMedicacion = ingresosMedicacion;
    }

    public Integer getEgresosDiuresis() {
        return egresosDiuresis;
    }

    public void setEgresosDiuresis(Integer egresosDiuresis) {
        this.egresosDiuresis = egresosDiuresis;
    }

    public Integer getEgresosVom() {
        return egresosVom;
    }

    public void setEgresosVom(Integer egresosVom) {
        this.egresosVom = egresosVom;
    }

    public Integer getEgresosSng() {
        return egresosSng;
    }

    public void setEgresosSng(Integer egresosSng) {
        this.egresosSng = egresosSng;
    }

    public Integer getEgresosDrenajes() {
        return egresosDrenajes;
    }

    public void setEgresosDrenajes(Integer egresosDrenajes) {
        this.egresosDrenajes = egresosDrenajes;
    }

    public Integer getEgresosDrenajes2() {
        return egresosDrenajes2;
    }

    public void setEgresosDrenajes2(Integer egresosDrenajes2) {
        this.egresosDrenajes2 = egresosDrenajes2;
    }

    public Integer getEgresosDrenajes3() {
        return egresosDrenajes3;
    }

    public void setEgresosDrenajes3(Integer egresosDrenajes3) {
        this.egresosDrenajes3 = egresosDrenajes3;
    }

    public Integer getEgresosCatarsis() {
        return egresosCatarsis;
    }

    public void setEgresosCatarsis(Integer egresosCatarsis) {
        this.egresosCatarsis = egresosCatarsis;
    }

    public Integer getEgresosPi() {
        return egresosPi;
    }

    public void setEgresosPi(Integer egresosPi) {
        this.egresosPi = egresosPi;
    }

    public Integer getIngresosOtros() {
        return ingresosOtros;
    }

    public void setIngresosOtros(Integer ingresosOtros) {
        this.ingresosOtros = ingresosOtros;
    }

    public Integer getEgresosOtros() {
        return egresosOtros;
    }

    public void setEgresosOtros(Integer egresosOtros) {
        this.egresosOtros = egresosOtros;
    }

    public Integer getRitmoDiuretico() {
        return ritmoDiuretico;
    }

    public void setRitmoDiuretico(Integer ritmoDiuretico) {
        this.ritmoDiuretico = ritmoDiuretico;
    }

    public String getIngresosOtrosDesc() {
        return ingresosOtrosDesc;
    }

    public void setIngresosOtrosDesc(String ingresosOtrosDesc) {
        this.ingresosOtrosDesc = ingresosOtrosDesc;
    }

    public String getEgresosOtrosDesc() {
        return egresosOtrosDesc;
    }

    public void setEgresosOtrosDesc(String egresosOtrosDesc) {
        this.egresosOtrosDesc = egresosOtrosDesc;
    }

    public String getIngresosParenteralTipo() {
        return ingresosParenteralTipo;
    }

    public void setIngresosParenteralTipo(String ingresosParenteralTipo) {
        this.ingresosParenteralTipo = ingresosParenteralTipo;
    }
}
