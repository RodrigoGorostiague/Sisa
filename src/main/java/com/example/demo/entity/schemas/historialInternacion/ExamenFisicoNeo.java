package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "examenfisiconeo", schema = "historialinternacion")
public class ExamenFisicoNeo {
    @EmbeddedId
    private ExamenFisicoNeoPK id;
    @Column(name = "estadogeneral")
    private String estadoGeneral;
    private String coloracion;
    private Boolean reactivo;
    private Boolean taquipnea;
    private Boolean tiraje;
    private Boolean apneas;
    @Column(name = "entradaaire")
    private String entradaAire;
    private String soplo;
    @Column(name = "fcregular")
    private Boolean fcRegular;
    private String abdomen;
    @Column(name = "asasvisibles")
    private Boolean asasVisibles;
    private String rha;
    @Column(name = "esofagopermeable")
    private Boolean esofagoPermeable;
    @Column(name = "anopermeable")
    private Boolean anoPermeable;
    @Column(name = "fisuraanal")
    private Boolean fisuraAnal;
    @Column(name = "cordonumbilical")
    private String cordonUmbilical;
    @Column(name = "aspectourogenital")
    private String aspectoUrogenital;
    @Column(name = "fontanelaanterior")
    private String fontanelaAnterior;
    @Column(name = "reflejosprimitivos")
    private String reflejosPrimitivos;
    @Column(name = "tonomuscularaxial")
    private String tonoMuscularAxial;
    @Column(name = "movimientosanormales")
    private Boolean movimientosAnormales;
    private Boolean convulciones;
    @Column(name = "repflejosprimitivosreactivo")
    private Boolean repflejosPrimitivosReactivo;
    @Column(name = "percefalico")
    private Integer perCefalico;
    @Column(name = "saturpreductal")
    private Integer saturPreductal;
    @Column(name = "saturpostductal")
    private Integer saturPostductal;

    public ExamenFisicoNeoPK getId() {
        return id;
    }

    public void setId(ExamenFisicoNeoPK id) {
        this.id = id;
    }

    public String getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(String estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

    public String getColoracion() {
        return coloracion;
    }

    public void setColoracion(String coloracion) {
        this.coloracion = coloracion;
    }

    public Boolean getReactivo() {
        return reactivo;
    }

    public void setReactivo(Boolean reactivo) {
        this.reactivo = reactivo;
    }

    public Boolean getTaquipnea() {
        return taquipnea;
    }

    public void setTaquipnea(Boolean taquipnea) {
        this.taquipnea = taquipnea;
    }

    public Boolean getTiraje() {
        return tiraje;
    }

    public void setTiraje(Boolean tiraje) {
        this.tiraje = tiraje;
    }

    public Boolean getApneas() {
        return apneas;
    }

    public void setApneas(Boolean apneas) {
        this.apneas = apneas;
    }

    public String getEntradaAire() {
        return entradaAire;
    }

    public void setEntradaAire(String entradaAire) {
        this.entradaAire = entradaAire;
    }

    public String getSoplo() {
        return soplo;
    }

    public void setSoplo(String soplo) {
        this.soplo = soplo;
    }

    public Boolean getFcRegular() {
        return fcRegular;
    }

    public void setFcRegular(Boolean fcRegular) {
        this.fcRegular = fcRegular;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public Boolean getAsasVisibles() {
        return asasVisibles;
    }

    public void setAsasVisibles(Boolean asasVisibles) {
        this.asasVisibles = asasVisibles;
    }

    public String getRha() {
        return rha;
    }

    public void setRha(String rha) {
        this.rha = rha;
    }

    public Boolean getEsofagoPermeable() {
        return esofagoPermeable;
    }

    public void setEsofagoPermeable(Boolean esofagoPermeable) {
        this.esofagoPermeable = esofagoPermeable;
    }

    public Boolean getAnoPermeable() {
        return anoPermeable;
    }

    public void setAnoPermeable(Boolean anoPermeable) {
        this.anoPermeable = anoPermeable;
    }

    public Boolean getFisuraAnal() {
        return fisuraAnal;
    }

    public void setFisuraAnal(Boolean fisuraAnal) {
        this.fisuraAnal = fisuraAnal;
    }

    public String getCordonUmbilical() {
        return cordonUmbilical;
    }

    public void setCordonUmbilical(String cordonUmbilical) {
        this.cordonUmbilical = cordonUmbilical;
    }

    public String getAspectoUrogenital() {
        return aspectoUrogenital;
    }

    public void setAspectoUrogenital(String aspectoUrogenital) {
        this.aspectoUrogenital = aspectoUrogenital;
    }

    public String getFontanelaAnterior() {
        return fontanelaAnterior;
    }

    public void setFontanelaAnterior(String fontanelaAnterior) {
        this.fontanelaAnterior = fontanelaAnterior;
    }

    public String getReflejosPrimitivos() {
        return reflejosPrimitivos;
    }

    public void setReflejosPrimitivos(String reflejosPrimitivos) {
        this.reflejosPrimitivos = reflejosPrimitivos;
    }

    public String getTonoMuscularAxial() {
        return tonoMuscularAxial;
    }

    public void setTonoMuscularAxial(String tonoMuscularAxial) {
        this.tonoMuscularAxial = tonoMuscularAxial;
    }

    public Boolean getMovimientosAnormales() {
        return movimientosAnormales;
    }

    public void setMovimientosAnormales(Boolean movimientosAnormales) {
        this.movimientosAnormales = movimientosAnormales;
    }

    public Boolean getConvulciones() {
        return convulciones;
    }

    public void setConvulciones(Boolean convulciones) {
        this.convulciones = convulciones;
    }

    public Boolean getRepflejosPrimitivosReactivo() {
        return repflejosPrimitivosReactivo;
    }

    public void setRepflejosPrimitivosReactivo(Boolean repflejosPrimitivosReactivo) {
        this.repflejosPrimitivosReactivo = repflejosPrimitivosReactivo;
    }

    public Integer getPerCefalico() {
        return perCefalico;
    }

    public void setPerCefalico(Integer perCefalico) {
        this.perCefalico = perCefalico;
    }

    public Integer getSaturPreductal() {
        return saturPreductal;
    }

    public void setSaturPreductal(Integer saturPreductal) {
        this.saturPreductal = saturPreductal;
    }

    public Integer getSaturPostductal() {
        return saturPostductal;
    }

    public void setSaturPostductal(Integer saturPostductal) {
        this.saturPostductal = saturPostductal;
    }
}
