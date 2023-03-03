package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historailinternacion", name = "evoluciondiariapuerperio")
public class EvolucionDiariaPuerperio {
    @EmbeddedId
    private EvolucionDiariaPuerperioPK id;
    private String mamas;
    private String lactancia;
    @Column(name = "abdomen_blando")
    private Boolean abdomenBlando;
    @Column(name = "abdomen_dolor")
    private Boolean abdomenDolor;
    @Column(name = "abdomen_reacperitonal")
    private Boolean abdomenReacPeritonal;
    private String utero;
    private String herida;
    private String loquios;
    @Column(name = "loquios_fetidez")
    private Boolean loquiosFetidez;
    private Boolean catarsis;
    @Column(name = "elimina_gases")
    private Boolean eliminaGases;
    private Boolean rha;
    @Column(name = "miembinf_edemas")
    private Boolean miembInfEdemas;
    @Column(name = "miembinf_dolor")
    private Boolean miembInfDolor;
    @Column(name = "tasistolica")
    private Integer taSistolica;
    @Column(name = "tadiastolica")
    private Integer taDiastolica;
    @Column(name = "freccardiaca")
    private Integer frecCardiaca;
    private Double temperatura;
    private String diuresis;
    @Column(name = "diuresis_ml")
    private Integer diuresisMl;
    @Column(name = "diuresis_caract")
    private String diuresisCaract;

    public EvolucionDiariaPuerperioPK getId() {
        return id;
    }

    public void setId(EvolucionDiariaPuerperioPK id) {
        this.id = id;
    }

    public String getMamas() {
        return mamas;
    }

    public void setMamas(String mamas) {
        this.mamas = mamas;
    }

    public String getLactancia() {
        return lactancia;
    }

    public void setLactancia(String lactancia) {
        this.lactancia = lactancia;
    }

    public Boolean getAbdomenBlando() {
        return abdomenBlando;
    }

    public void setAbdomenBlando(Boolean abdomenBlando) {
        this.abdomenBlando = abdomenBlando;
    }

    public Boolean getAbdomenDolor() {
        return abdomenDolor;
    }

    public void setAbdomenDolor(Boolean abdomenDolor) {
        this.abdomenDolor = abdomenDolor;
    }

    public Boolean getAbdomenReacPeritonal() {
        return abdomenReacPeritonal;
    }

    public void setAbdomenReacPeritonal(Boolean abdomenReacPeritonal) {
        this.abdomenReacPeritonal = abdomenReacPeritonal;
    }

    public String getUtero() {
        return utero;
    }

    public void setUtero(String utero) {
        this.utero = utero;
    }

    public String getHerida() {
        return herida;
    }

    public void setHerida(String herida) {
        this.herida = herida;
    }

    public String getLoquios() {
        return loquios;
    }

    public void setLoquios(String loquios) {
        this.loquios = loquios;
    }

    public Boolean getLoquiosFetidez() {
        return loquiosFetidez;
    }

    public void setLoquiosFetidez(Boolean loquiosFetidez) {
        this.loquiosFetidez = loquiosFetidez;
    }

    public Boolean getCatarsis() {
        return catarsis;
    }

    public void setCatarsis(Boolean catarsis) {
        this.catarsis = catarsis;
    }

    public Boolean getEliminaGases() {
        return eliminaGases;
    }

    public void setEliminaGases(Boolean eliminaGases) {
        this.eliminaGases = eliminaGases;
    }

    public Boolean getRha() {
        return rha;
    }

    public void setRha(Boolean rha) {
        this.rha = rha;
    }

    public Boolean getMiembInfEdemas() {
        return miembInfEdemas;
    }

    public void setMiembInfEdemas(Boolean miembInfEdemas) {
        this.miembInfEdemas = miembInfEdemas;
    }

    public Boolean getMiembInfDolor() {
        return miembInfDolor;
    }

    public void setMiembInfDolor(Boolean miembInfDolor) {
        this.miembInfDolor = miembInfDolor;
    }

    public Integer getTaSistolica() {
        return taSistolica;
    }

    public void setTaSistolica(Integer taSistolica) {
        this.taSistolica = taSistolica;
    }

    public Integer getTaDiastolica() {
        return taDiastolica;
    }

    public void setTaDiastolica(Integer taDiastolica) {
        this.taDiastolica = taDiastolica;
    }

    public Integer getFrecCardiaca() {
        return frecCardiaca;
    }

    public void setFrecCardiaca(Integer frecCardiaca) {
        this.frecCardiaca = frecCardiaca;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getDiuresis() {
        return diuresis;
    }

    public void setDiuresis(String diuresis) {
        this.diuresis = diuresis;
    }

    public Integer getDiuresisMl() {
        return diuresisMl;
    }

    public void setDiuresisMl(Integer diuresisMl) {
        this.diuresisMl = diuresisMl;
    }

    public String getDiuresisCaract() {
        return diuresisCaract;
    }

    public void setDiuresisCaract(String diuresisCaract) {
        this.diuresisCaract = diuresisCaract;
    }
}
