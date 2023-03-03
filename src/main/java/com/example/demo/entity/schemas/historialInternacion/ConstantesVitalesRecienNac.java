package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "constantesvitalesreciennac")
public class ConstantesVitalesRecienNac {
    @EmbeddedId
    private ConstantesVitalesRecienNacPK id;
    private Integer peso;
    private Integer temperatura;
    @Column(name = "frecrespiratoria")
    private Integer frecRespiratoria;
    @Column(name = "resp_normal")
    private Boolean respNormal;
    @Column(name = "quejido_resp")
    private Boolean quejidoresp;
    @Column(name = "tiraje_resp")
    private Boolean tirajeResp;
    @Column(name = "aleteo_nasal")
    private Boolean aleteoNasal;
    @Column(name = "eliminameconio")
    private Integer eliminaMeconio;
    private Boolean miccion;
    @Column(name = "sistema_nervioso")
    private String sistemaNervioso;
    @Column(name = "ombligo_normal")
    private Boolean ombligoNormal;
    @Column(name = "ombligo_enojecimiento")
    private Boolean ombligoEnojecimiento;
    @Column(name = "ombligo_secreciones")
    private Boolean ombligoSecreciones;
    private String observacion;
    @Column(name = "buenatolerancia_alim")
    private Boolean buenaToleranciaAlim;
    @Column(name = "rechazo_alim")
    private Boolean rechazoAlim;
    @Column(name = "vomitos_alim")
    private Boolean vomitosAlim;
    @Column(name = "regurgitacion_alim")
    private Boolean regurgitacionAlim;
    @Column(name = "higiene_general")
    private Boolean higieneGeneral;
    @Column(name = "higiene_parcial")
    private Boolean higieneParcial;
    @Column(name = "higiene_ombligo")
    private Boolean higieneOmbligo;
    @Column(name = "relac_madrehijo")
    private Boolean relacMadreHijo;
    @Column(name = "piel_rosado")
    private Boolean pielRosado;
    @Column(name = "pielCianosis")
    private Boolean piel_cianosis;
    @Column(name = "piel_ictericia")
    private Boolean pielIctericia;
    @Column(name = "piel_palido")
    private Boolean pielPalido;

    public ConstantesVitalesRecienNacPK getId() {
        return id;
    }

    public void setId(ConstantesVitalesRecienNacPK id) {
        this.id = id;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(Integer frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }

    public Boolean getRespNormal() {
        return respNormal;
    }

    public void setRespNormal(Boolean respNormal) {
        this.respNormal = respNormal;
    }

    public Boolean getQuejidoresp() {
        return quejidoresp;
    }

    public void setQuejidoresp(Boolean quejidoresp) {
        this.quejidoresp = quejidoresp;
    }

    public Boolean getTirajeResp() {
        return tirajeResp;
    }

    public void setTirajeResp(Boolean tirajeResp) {
        this.tirajeResp = tirajeResp;
    }

    public Boolean getAleteoNasal() {
        return aleteoNasal;
    }

    public void setAleteoNasal(Boolean aleteoNasal) {
        this.aleteoNasal = aleteoNasal;
    }

    public Integer getEliminaMeconio() {
        return eliminaMeconio;
    }

    public void setEliminaMeconio(Integer eliminaMeconio) {
        this.eliminaMeconio = eliminaMeconio;
    }

    public Boolean getMiccion() {
        return miccion;
    }

    public void setMiccion(Boolean miccion) {
        this.miccion = miccion;
    }

    public String getSistemaNervioso() {
        return sistemaNervioso;
    }

    public void setSistemaNervioso(String sistemaNervioso) {
        this.sistemaNervioso = sistemaNervioso;
    }

    public Boolean getOmbligoNormal() {
        return ombligoNormal;
    }

    public void setOmbligoNormal(Boolean ombligoNormal) {
        this.ombligoNormal = ombligoNormal;
    }

    public Boolean getOmbligoEnojecimiento() {
        return ombligoEnojecimiento;
    }

    public void setOmbligoEnojecimiento(Boolean ombligoEnojecimiento) {
        this.ombligoEnojecimiento = ombligoEnojecimiento;
    }

    public Boolean getOmbligoSecreciones() {
        return ombligoSecreciones;
    }

    public void setOmbligoSecreciones(Boolean ombligoSecreciones) {
        this.ombligoSecreciones = ombligoSecreciones;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Boolean getBuenaToleranciaAlim() {
        return buenaToleranciaAlim;
    }

    public void setBuenaToleranciaAlim(Boolean buenaToleranciaAlim) {
        this.buenaToleranciaAlim = buenaToleranciaAlim;
    }

    public Boolean getRechazoAlim() {
        return rechazoAlim;
    }

    public void setRechazoAlim(Boolean rechazoAlim) {
        this.rechazoAlim = rechazoAlim;
    }

    public Boolean getVomitosAlim() {
        return vomitosAlim;
    }

    public void setVomitosAlim(Boolean vomitosAlim) {
        this.vomitosAlim = vomitosAlim;
    }

    public Boolean getRegurgitacionAlim() {
        return regurgitacionAlim;
    }

    public void setRegurgitacionAlim(Boolean regurgitacionAlim) {
        this.regurgitacionAlim = regurgitacionAlim;
    }

    public Boolean getHigieneGeneral() {
        return higieneGeneral;
    }

    public void setHigieneGeneral(Boolean higieneGeneral) {
        this.higieneGeneral = higieneGeneral;
    }

    public Boolean getHigieneParcial() {
        return higieneParcial;
    }

    public void setHigieneParcial(Boolean higieneParcial) {
        this.higieneParcial = higieneParcial;
    }

    public Boolean getHigieneOmbligo() {
        return higieneOmbligo;
    }

    public void setHigieneOmbligo(Boolean higieneOmbligo) {
        this.higieneOmbligo = higieneOmbligo;
    }

    public Boolean getRelacMadreHijo() {
        return relacMadreHijo;
    }

    public void setRelacMadreHijo(Boolean relacMadreHijo) {
        this.relacMadreHijo = relacMadreHijo;
    }

    public Boolean getPielRosado() {
        return pielRosado;
    }

    public void setPielRosado(Boolean pielRosado) {
        this.pielRosado = pielRosado;
    }

    public Boolean getPiel_cianosis() {
        return piel_cianosis;
    }

    public void setPiel_cianosis(Boolean piel_cianosis) {
        this.piel_cianosis = piel_cianosis;
    }

    public Boolean getPielIctericia() {
        return pielIctericia;
    }

    public void setPielIctericia(Boolean pielIctericia) {
        this.pielIctericia = pielIctericia;
    }

    public Boolean getPielPalido() {
        return pielPalido;
    }

    public void setPielPalido(Boolean pielPalido) {
        this.pielPalido = pielPalido;
    }
}
