package com.example.demo.entity.schemas.podologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "podologia", schema = "podologia")
public class Podologia {
    @EmbeddedId
    private PodologiaPK id;
    @Column(name = "tipodiabetes")
    private String tipoDiabetes;
    @Column(name = "edaddiagnostico")
    private Integer edadDiagnostico;
    @Column(name = "tipoedad")
    private String tipoEdad;
    @Column(name = "riesgoclinico")
    private String riesgoClinico;
    private String ulcera;
    private String mu1;
    private String mu2;
    private String mu3;
    private String mu4;
    private String mu5;
    private String mi1;
    private String mi2;
    private String mi3;
    private String mi4;
    private String onicocriptosis;
    private String hiperqueratosis;
    private String halluxvalgo;
    private String dm1;
    private String dm2;
    private String dm3;
    private String dm4;
    private String dm5;
    private String dg1;
    private String dg2;
    private String dg3;
    private String dg4;
    private String dg5;
    private String pie;
    @Column(name = "ausenciapulsopedio")
    private String ausenciaPulsoPedio;
    @Column(name = "ausenciatactil")
    private String ausenciaTactil;
    @Column(name = "ausenciatermo")
    private String ausenciaTermo;
    @Column(name = "frecautocontrol")
    private String frecautoControl;
    @Column(name = "selcalidadalim")
    private String selCalidadAlim;
    @Column(name = "selcantidadalim")
    private String selCantidadAlim;
    @Column(name = "tratfarma")
    private String tratFarma;
    @Column(name = "aumentoactfis")
    private String aumentoActFis;
    @Column(name = "freccontrol")
    private String frecControl;
    @Column(name = "cuidadospie")
    private String cuidadosPie;
    private String observaciones;

    public PodologiaPK getId() {
        return id;
    }

    public void setId(PodologiaPK id) {
        this.id = id;
    }

    public String getTipoDiabetes() {
        return tipoDiabetes;
    }

    public void setTipoDiabetes(String tipoDiabetes) {
        this.tipoDiabetes = tipoDiabetes;
    }

    public Integer getEdadDiagnostico() {
        return edadDiagnostico;
    }

    public void setEdadDiagnostico(Integer edadDiagnostico) {
        this.edadDiagnostico = edadDiagnostico;
    }

    public String getTipoEdad() {
        return tipoEdad;
    }

    public void setTipoEdad(String tipoEdad) {
        this.tipoEdad = tipoEdad;
    }

    public String getRiesgoClinico() {
        return riesgoClinico;
    }

    public void setRiesgoClinico(String riesgoClinico) {
        this.riesgoClinico = riesgoClinico;
    }

    public String getUlcera() {
        return ulcera;
    }

    public void setUlcera(String ulcera) {
        this.ulcera = ulcera;
    }

    public String getMu1() {
        return mu1;
    }

    public void setMu1(String mu1) {
        this.mu1 = mu1;
    }

    public String getMu2() {
        return mu2;
    }

    public void setMu2(String mu2) {
        this.mu2 = mu2;
    }

    public String getMu3() {
        return mu3;
    }

    public void setMu3(String mu3) {
        this.mu3 = mu3;
    }

    public String getMu4() {
        return mu4;
    }

    public void setMu4(String mu4) {
        this.mu4 = mu4;
    }

    public String getMu5() {
        return mu5;
    }

    public void setMu5(String mu5) {
        this.mu5 = mu5;
    }

    public String getMi1() {
        return mi1;
    }

    public void setMi1(String mi1) {
        this.mi1 = mi1;
    }

    public String getMi2() {
        return mi2;
    }

    public void setMi2(String mi2) {
        this.mi2 = mi2;
    }

    public String getMi3() {
        return mi3;
    }

    public void setMi3(String mi3) {
        this.mi3 = mi3;
    }

    public String getMi4() {
        return mi4;
    }

    public void setMi4(String mi4) {
        this.mi4 = mi4;
    }

    public String getOnicocriptosis() {
        return onicocriptosis;
    }

    public void setOnicocriptosis(String onicocriptosis) {
        this.onicocriptosis = onicocriptosis;
    }

    public String getHiperqueratosis() {
        return hiperqueratosis;
    }

    public void setHiperqueratosis(String hiperqueratosis) {
        this.hiperqueratosis = hiperqueratosis;
    }

    public String getHalluxvalgo() {
        return halluxvalgo;
    }

    public void setHalluxvalgo(String halluxvalgo) {
        this.halluxvalgo = halluxvalgo;
    }

    public String getDm1() {
        return dm1;
    }

    public void setDm1(String dm1) {
        this.dm1 = dm1;
    }

    public String getDm2() {
        return dm2;
    }

    public void setDm2(String dm2) {
        this.dm2 = dm2;
    }

    public String getDm3() {
        return dm3;
    }

    public void setDm3(String dm3) {
        this.dm3 = dm3;
    }

    public String getDm4() {
        return dm4;
    }

    public void setDm4(String dm4) {
        this.dm4 = dm4;
    }

    public String getDm5() {
        return dm5;
    }

    public void setDm5(String dm5) {
        this.dm5 = dm5;
    }

    public String getDg1() {
        return dg1;
    }

    public void setDg1(String dg1) {
        this.dg1 = dg1;
    }

    public String getDg2() {
        return dg2;
    }

    public void setDg2(String dg2) {
        this.dg2 = dg2;
    }

    public String getDg3() {
        return dg3;
    }

    public void setDg3(String dg3) {
        this.dg3 = dg3;
    }

    public String getDg4() {
        return dg4;
    }

    public void setDg4(String dg4) {
        this.dg4 = dg4;
    }

    public String getDg5() {
        return dg5;
    }

    public void setDg5(String dg5) {
        this.dg5 = dg5;
    }

    public String getPie() {
        return pie;
    }

    public void setPie(String pie) {
        this.pie = pie;
    }

    public String getAusenciaPulsoPedio() {
        return ausenciaPulsoPedio;
    }

    public void setAusenciaPulsoPedio(String ausenciaPulsoPedio) {
        this.ausenciaPulsoPedio = ausenciaPulsoPedio;
    }

    public String getAusenciaTactil() {
        return ausenciaTactil;
    }

    public void setAusenciaTactil(String ausenciaTactil) {
        this.ausenciaTactil = ausenciaTactil;
    }

    public String getAusenciaTermo() {
        return ausenciaTermo;
    }

    public void setAusenciaTermo(String ausenciaTermo) {
        this.ausenciaTermo = ausenciaTermo;
    }

    public String getFrecautoControl() {
        return frecautoControl;
    }

    public void setFrecautoControl(String frecautoControl) {
        this.frecautoControl = frecautoControl;
    }

    public String getSelCalidadAlim() {
        return selCalidadAlim;
    }

    public void setSelCalidadAlim(String selCalidadAlim) {
        this.selCalidadAlim = selCalidadAlim;
    }

    public String getSelCantidadAlim() {
        return selCantidadAlim;
    }

    public void setSelCantidadAlim(String selCantidadAlim) {
        this.selCantidadAlim = selCantidadAlim;
    }

    public String getTratFarma() {
        return tratFarma;
    }

    public void setTratFarma(String tratFarma) {
        this.tratFarma = tratFarma;
    }

    public String getAumentoActFis() {
        return aumentoActFis;
    }

    public void setAumentoActFis(String aumentoActFis) {
        this.aumentoActFis = aumentoActFis;
    }

    public String getFrecControl() {
        return frecControl;
    }

    public void setFrecControl(String frecControl) {
        this.frecControl = frecControl;
    }

    public String getCuidadosPie() {
        return cuidadosPie;
    }

    public void setCuidadosPie(String cuidadosPie) {
        this.cuidadosPie = cuidadosPie;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
