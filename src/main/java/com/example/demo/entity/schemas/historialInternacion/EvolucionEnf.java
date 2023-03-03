package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "evolucionenf")
public class EvolucionEnf {
    @EmbeddedId
    private EvolucionEnfPK id;
    private String comentario;
    @Column(name = "realiza_rx")
    private Boolean realizaRx;
    @Column(name = "realiza_lab")
    private Boolean realizaLab;
    @Column(name = "realiza_tac")
    private Boolean realizaTac;
    @Column(name = "realiza_sg")
    private Boolean realizaSg;
    @Column(name = "realiza_eab")
    private Boolean realizaEab;
    @Column(name = "estiss28")
    private Boolean esTiss28;
    @Column(name = "cuidado_ocular")
    private Boolean cuidado_ocular;
    @Column(name = "rotacion_decubito")
    private Boolean rotacionDecubito;
    @Column(name = "rotacion_sensor")
    private Boolean rotacionSensor;
    @Column(name = "aspiracion_secreciones")
    private Boolean aspiracionSecreciones;
    @Column(name = "realiza_sed")
    private Boolean realizaSed;
    @Column(name = "realiza_uro")
    private Boolean realizaUro;
    @Column(name = "realiza_hisopado")
    private Boolean realizaHisopado;
    @Column(name = "oto_acustica")
    private Boolean otoAcustica;
    private Boolean fei;
    @Column(name = "fondo_ojos")
    private Boolean fondoOjos;
    private Boolean bcg;
    @Column(name = "tipo_evol_mat")
    private String tipoEvolMat;

    public EvolucionEnfPK getId() {
        return id;
    }

    public void setId(EvolucionEnfPK id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getRealizaRx() {
        return realizaRx;
    }

    public void setRealizaRx(Boolean realizaRx) {
        this.realizaRx = realizaRx;
    }

    public Boolean getRealizaLab() {
        return realizaLab;
    }

    public void setRealizaLab(Boolean realizaLab) {
        this.realizaLab = realizaLab;
    }

    public Boolean getRealizaTac() {
        return realizaTac;
    }

    public void setRealizaTac(Boolean realizaTac) {
        this.realizaTac = realizaTac;
    }

    public Boolean getRealizaSg() {
        return realizaSg;
    }

    public void setRealizaSg(Boolean realizaSg) {
        this.realizaSg = realizaSg;
    }

    public Boolean getRealizaEab() {
        return realizaEab;
    }

    public void setRealizaEab(Boolean realizaEab) {
        this.realizaEab = realizaEab;
    }

    public Boolean getEsTiss28() {
        return esTiss28;
    }

    public void setEsTiss28(Boolean esTiss28) {
        this.esTiss28 = esTiss28;
    }

    public Boolean getCuidado_ocular() {
        return cuidado_ocular;
    }

    public void setCuidado_ocular(Boolean cuidado_ocular) {
        this.cuidado_ocular = cuidado_ocular;
    }

    public Boolean getRotacionDecubito() {
        return rotacionDecubito;
    }

    public void setRotacionDecubito(Boolean rotacionDecubito) {
        this.rotacionDecubito = rotacionDecubito;
    }

    public Boolean getRotacionSensor() {
        return rotacionSensor;
    }

    public void setRotacionSensor(Boolean rotacionSensor) {
        this.rotacionSensor = rotacionSensor;
    }

    public Boolean getAspiracionSecreciones() {
        return aspiracionSecreciones;
    }

    public void setAspiracionSecreciones(Boolean aspiracionSecreciones) {
        this.aspiracionSecreciones = aspiracionSecreciones;
    }

    public Boolean getRealizaSed() {
        return realizaSed;
    }

    public void setRealizaSed(Boolean realizaSed) {
        this.realizaSed = realizaSed;
    }

    public Boolean getRealizaUro() {
        return realizaUro;
    }

    public void setRealizaUro(Boolean realizaUro) {
        this.realizaUro = realizaUro;
    }

    public Boolean getRealizaHisopado() {
        return realizaHisopado;
    }

    public void setRealizaHisopado(Boolean realizaHisopado) {
        this.realizaHisopado = realizaHisopado;
    }

    public Boolean getOtoAcustica() {
        return otoAcustica;
    }

    public void setOtoAcustica(Boolean otoAcustica) {
        this.otoAcustica = otoAcustica;
    }

    public Boolean getFei() {
        return fei;
    }

    public void setFei(Boolean fei) {
        this.fei = fei;
    }

    public Boolean getFondoOjos() {
        return fondoOjos;
    }

    public void setFondoOjos(Boolean fondoOjos) {
        this.fondoOjos = fondoOjos;
    }

    public Boolean getBcg() {
        return bcg;
    }

    public void setBcg(Boolean bcg) {
        this.bcg = bcg;
    }

    public String getTipoEvolMat() {
        return tipoEvolMat;
    }

    public void setTipoEvolMat(String tipoEvolMat) {
        this.tipoEvolMat = tipoEvolMat;
    }
}
