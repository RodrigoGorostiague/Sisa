package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "historialinternacion", name = "reciennacido")
public class RecienNacido {
    @EmbeddedId
    private RecienNacidoPK id;
    @Column(name = "fechaingresoplanillasipa")
    private Date fechaIngresoPlanillaSipa;
    @Column(name = "sufrimientofetal")
    private Boolean sufrimientoFetal;
    @Column(name = "atendidopor")
    private String atendidoPor;
    @Column(name = "tiempovidaexamenfisico_horas")
    private Integer tiempoVidaExamenFisicoHoras;
    @Column(name = "tiempovidaexamenfisico_min")
    private Integer tiempoVidaExamenFisicoMin;
    @Column(name = "cordonumb_abo")
    private String cordonUmbAbo;
    @Column(name = "cordonumb_rh")
    private String cordonUmbRh;
    @Column(name = "cordonumb_ph")
    private Integer cordonUmbPh;
    @Column(name = "cordonumb_bilirrubina")
    private Integer cordonUmbBilirrubina;
    @Column(name = "cordonumb_hemoglobina")
    private Integer cordonUmbHemoglobina;
    @Column(name = "apgar1min_latidos")
    private Integer apgar1MinLatidos;
    @Column(name = "apgar1min_resp")
    private Integer apgar1MinResp;
    @Column(name = "apgar1min_tono")
    private Integer apgar1MinTono;
    @Column(name = "apgar1min_reflejos")
    private Integer apgar1MinReflejos;
    @Column(name = "apgar1min_color")
    private Integer apgar1MinColor;
    @Column(name = "apgar5min_latidos")
    private Integer apgar5MinLatidos;
    @Column(name = "apgar5min_resp")
    private Integer apgar5MinResp;
    @Column(name = "apgar5min_tono")
    private Integer apgar5MinTono;
    @Column(name = "apgar5min_reflejos")
    private Integer apgar5MinReflejos;
    @Column(name = "apgar5min_color")
    private Integer apgar5MinColor;
    @Column(name = "tiempo_apgar")
    private Integer tiempoApgar;
    @Column(name = "metodo_higiene")
    private String metodoHigiene;
    private Boolean crede;
    private Boolean vitaminaK;
    @Column(name = "dificultad_respiratoria")
    private Boolean dificultadRespiratoria;
    @Column(name = "ictericia")
    private Boolean ictericia;
    private Boolean palidez;
    private Boolean cianosis;
    @Column(name = "defectoscongenitos_detalle")
    private String defectosCongenitosDetalle;
    @Column(name = "aspecto_neurologico")
    private String aspectoNeurologico;
    @Column(name = "lesiones_traumaticas")
    private Boolean lesionesTraumaticas;
    private Boolean hematoma;
    @Column(name = "paralisis_facial")
    private Boolean paralisisFacial;
    @Column(name = "paralisis_branquial")
    private Boolean paralisisBranquial;
    @Column(name = "fracturas_general")
    private Boolean fracturasGeneral;
    @Column(name = "fracturas_general_detalle")
    private String fracturasGeneralDetalle;
    @Column(name = "hemorragia_visceral")
    private Boolean hemorragiaVisceral;
    @Column(name = "hemorragia_visceral_detalle")
    private String hemorragiaVisceralDetalle;
    @Column(name = "otros_traumas")
    private Boolean otrosTraumas;
    @Column(name = "otros_traumas_detalle")
    private String otrosTraumasDetalle;
    @Column(name = "no_traumaticas")
    private Boolean noTraumaticas;
    @Column(name = "no_traumaticas_detalle")
    private String noTraumaticasDetalle;
    private String abdomen;
    private Boolean orino;
    private String  cardiovascular;
    private String observaciones;
    @Column(name = "lugar_permanencia")
    private String lugarPermanencia;
    @Column(name = "cordonumb_coombs")
    private String cordonUmbCoombs;
    private Boolean secado;
    @Column(name = "aspiracion_gastrica")
    private Boolean aspiracionGastrica;
    @Column(name = "reanim_cardiaca")
    private String reanimCardiaca;
    @Column(name = "reanim_metabolica")
    private String  reanimMetabolica;
    @Column(name = "otras_maniobras")
    private Boolean otrasManiobras;
    @Column(name = "otras_maniobras_detalle")
    private String otrasManiobrasDetalle;
    private Boolean meconio;

    public RecienNacidoPK getId() {
        return id;
    }

    public void setId(RecienNacidoPK id) {
        this.id = id;
    }

    public Date getFechaIngresoPlanillaSipa() {
        return fechaIngresoPlanillaSipa;
    }

    public void setFechaIngresoPlanillaSipa(Date fechaIngresoPlanillaSipa) {
        this.fechaIngresoPlanillaSipa = fechaIngresoPlanillaSipa;
    }

    public Boolean getSufrimientoFetal() {
        return sufrimientoFetal;
    }

    public void setSufrimientoFetal(Boolean sufrimientoFetal) {
        this.sufrimientoFetal = sufrimientoFetal;
    }

    public String getAtendidoPor() {
        return atendidoPor;
    }

    public void setAtendidoPor(String atendidoPor) {
        this.atendidoPor = atendidoPor;
    }

    public Integer getTiempoVidaExamenFisicoHoras() {
        return tiempoVidaExamenFisicoHoras;
    }

    public void setTiempoVidaExamenFisicoHoras(Integer tiempoVidaExamenFisicoHoras) {
        this.tiempoVidaExamenFisicoHoras = tiempoVidaExamenFisicoHoras;
    }

    public Integer getTiempoVidaExamenFisicoMin() {
        return tiempoVidaExamenFisicoMin;
    }

    public void setTiempoVidaExamenFisicoMin(Integer tiempoVidaExamenFisicoMin) {
        this.tiempoVidaExamenFisicoMin = tiempoVidaExamenFisicoMin;
    }

    public String getCordonUmbAbo() {
        return cordonUmbAbo;
    }

    public void setCordonUmbAbo(String cordonUmbAbo) {
        this.cordonUmbAbo = cordonUmbAbo;
    }

    public String getCordonUmbRh() {
        return cordonUmbRh;
    }

    public void setCordonUmbRh(String cordonUmbRh) {
        this.cordonUmbRh = cordonUmbRh;
    }

    public Integer getCordonUmbPh() {
        return cordonUmbPh;
    }

    public void setCordonUmbPh(Integer cordonUmbPh) {
        this.cordonUmbPh = cordonUmbPh;
    }

    public Integer getCordonUmbBilirrubina() {
        return cordonUmbBilirrubina;
    }

    public void setCordonUmbBilirrubina(Integer cordonUmbBilirrubina) {
        this.cordonUmbBilirrubina = cordonUmbBilirrubina;
    }

    public Integer getCordonUmbHemoglobina() {
        return cordonUmbHemoglobina;
    }

    public void setCordonUmbHemoglobina(Integer cordonUmbHemoglobina) {
        this.cordonUmbHemoglobina = cordonUmbHemoglobina;
    }

    public Integer getApgar1MinLatidos() {
        return apgar1MinLatidos;
    }

    public void setApgar1MinLatidos(Integer apgar1MinLatidos) {
        this.apgar1MinLatidos = apgar1MinLatidos;
    }

    public Integer getApgar1MinResp() {
        return apgar1MinResp;
    }

    public void setApgar1MinResp(Integer apgar1MinResp) {
        this.apgar1MinResp = apgar1MinResp;
    }

    public Integer getApgar1MinTono() {
        return apgar1MinTono;
    }

    public void setApgar1MinTono(Integer apgar1MinTono) {
        this.apgar1MinTono = apgar1MinTono;
    }

    public Integer getApgar1MinReflejos() {
        return apgar1MinReflejos;
    }

    public void setApgar1MinReflejos(Integer apgar1MinReflejos) {
        this.apgar1MinReflejos = apgar1MinReflejos;
    }

    public Integer getApgar1MinColor() {
        return apgar1MinColor;
    }

    public void setApgar1MinColor(Integer apgar1MinColor) {
        this.apgar1MinColor = apgar1MinColor;
    }

    public Integer getApgar5MinLatidos() {
        return apgar5MinLatidos;
    }

    public void setApgar5MinLatidos(Integer apgar5MinLatidos) {
        this.apgar5MinLatidos = apgar5MinLatidos;
    }

    public Integer getApgar5MinResp() {
        return apgar5MinResp;
    }

    public void setApgar5MinResp(Integer apgar5MinResp) {
        this.apgar5MinResp = apgar5MinResp;
    }

    public Integer getApgar5MinTono() {
        return apgar5MinTono;
    }

    public void setApgar5MinTono(Integer apgar5MinTono) {
        this.apgar5MinTono = apgar5MinTono;
    }

    public Integer getApgar5MinReflejos() {
        return apgar5MinReflejos;
    }

    public void setApgar5MinReflejos(Integer apgar5MinReflejos) {
        this.apgar5MinReflejos = apgar5MinReflejos;
    }

    public Integer getApgar5MinColor() {
        return apgar5MinColor;
    }

    public void setApgar5MinColor(Integer apgar5MinColor) {
        this.apgar5MinColor = apgar5MinColor;
    }

    public Integer getTiempoApgar() {
        return tiempoApgar;
    }

    public void setTiempoApgar(Integer tiempoApgar) {
        this.tiempoApgar = tiempoApgar;
    }

    public String getMetodoHigiene() {
        return metodoHigiene;
    }

    public void setMetodoHigiene(String metodoHigiene) {
        this.metodoHigiene = metodoHigiene;
    }

    public Boolean getCrede() {
        return crede;
    }

    public void setCrede(Boolean crede) {
        this.crede = crede;
    }

    public Boolean getVitaminaK() {
        return vitaminaK;
    }

    public void setVitaminaK(Boolean vitaminaK) {
        this.vitaminaK = vitaminaK;
    }

    public Boolean getDificultadRespiratoria() {
        return dificultadRespiratoria;
    }

    public void setDificultadRespiratoria(Boolean dificultadRespiratoria) {
        this.dificultadRespiratoria = dificultadRespiratoria;
    }

    public Boolean getIctericia() {
        return ictericia;
    }

    public void setIctericia(Boolean ictericia) {
        this.ictericia = ictericia;
    }

    public Boolean getPalidez() {
        return palidez;
    }

    public void setPalidez(Boolean palidez) {
        this.palidez = palidez;
    }

    public Boolean getCianosis() {
        return cianosis;
    }

    public void setCianosis(Boolean cianosis) {
        this.cianosis = cianosis;
    }

    public String getDefectosCongenitosDetalle() {
        return defectosCongenitosDetalle;
    }

    public void setDefectosCongenitosDetalle(String defectosCongenitosDetalle) {
        this.defectosCongenitosDetalle = defectosCongenitosDetalle;
    }

    public String getAspectoNeurologico() {
        return aspectoNeurologico;
    }

    public void setAspectoNeurologico(String aspectoNeurologico) {
        this.aspectoNeurologico = aspectoNeurologico;
    }

    public Boolean getLesionesTraumaticas() {
        return lesionesTraumaticas;
    }

    public void setLesionesTraumaticas(Boolean lesionesTraumaticas) {
        this.lesionesTraumaticas = lesionesTraumaticas;
    }

    public Boolean getHematoma() {
        return hematoma;
    }

    public void setHematoma(Boolean hematoma) {
        this.hematoma = hematoma;
    }

    public Boolean getParalisisFacial() {
        return paralisisFacial;
    }

    public void setParalisisFacial(Boolean paralisisFacial) {
        this.paralisisFacial = paralisisFacial;
    }

    public Boolean getParalisisBranquial() {
        return paralisisBranquial;
    }

    public void setParalisisBranquial(Boolean paralisisBranquial) {
        this.paralisisBranquial = paralisisBranquial;
    }

    public Boolean getFracturasGeneral() {
        return fracturasGeneral;
    }

    public void setFracturasGeneral(Boolean fracturasGeneral) {
        this.fracturasGeneral = fracturasGeneral;
    }

    public String getFracturasGeneralDetalle() {
        return fracturasGeneralDetalle;
    }

    public void setFracturasGeneralDetalle(String fracturasGeneralDetalle) {
        this.fracturasGeneralDetalle = fracturasGeneralDetalle;
    }

    public Boolean getHemorragiaVisceral() {
        return hemorragiaVisceral;
    }

    public void setHemorragiaVisceral(Boolean hemorragiaVisceral) {
        this.hemorragiaVisceral = hemorragiaVisceral;
    }

    public String getHemorragiaVisceralDetalle() {
        return hemorragiaVisceralDetalle;
    }

    public void setHemorragiaVisceralDetalle(String hemorragiaVisceralDetalle) {
        this.hemorragiaVisceralDetalle = hemorragiaVisceralDetalle;
    }

    public Boolean getOtrosTraumas() {
        return otrosTraumas;
    }

    public void setOtrosTraumas(Boolean otrosTraumas) {
        this.otrosTraumas = otrosTraumas;
    }

    public String getOtrosTraumasDetalle() {
        return otrosTraumasDetalle;
    }

    public void setOtrosTraumasDetalle(String otrosTraumasDetalle) {
        this.otrosTraumasDetalle = otrosTraumasDetalle;
    }

    public Boolean getNoTraumaticas() {
        return noTraumaticas;
    }

    public void setNoTraumaticas(Boolean noTraumaticas) {
        this.noTraumaticas = noTraumaticas;
    }

    public String getNoTraumaticasDetalle() {
        return noTraumaticasDetalle;
    }

    public void setNoTraumaticasDetalle(String noTraumaticasDetalle) {
        this.noTraumaticasDetalle = noTraumaticasDetalle;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public Boolean getOrino() {
        return orino;
    }

    public void setOrino(Boolean orino) {
        this.orino = orino;
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getLugarPermanencia() {
        return lugarPermanencia;
    }

    public void setLugarPermanencia(String lugarPermanencia) {
        this.lugarPermanencia = lugarPermanencia;
    }

    public String getCordonUmbCoombs() {
        return cordonUmbCoombs;
    }

    public void setCordonUmbCoombs(String cordonUmbCoombs) {
        this.cordonUmbCoombs = cordonUmbCoombs;
    }

    public Boolean getSecado() {
        return secado;
    }

    public void setSecado(Boolean secado) {
        this.secado = secado;
    }

    public Boolean getAspiracionGastrica() {
        return aspiracionGastrica;
    }

    public void setAspiracionGastrica(Boolean aspiracionGastrica) {
        this.aspiracionGastrica = aspiracionGastrica;
    }

    public String getReanimCardiaca() {
        return reanimCardiaca;
    }

    public void setReanimCardiaca(String reanimCardiaca) {
        this.reanimCardiaca = reanimCardiaca;
    }

    public String getReanimMetabolica() {
        return reanimMetabolica;
    }

    public void setReanimMetabolica(String reanimMetabolica) {
        this.reanimMetabolica = reanimMetabolica;
    }

    public Boolean getOtrasManiobras() {
        return otrasManiobras;
    }

    public void setOtrasManiobras(Boolean otrasManiobras) {
        this.otrasManiobras = otrasManiobras;
    }

    public String getOtrasManiobrasDetalle() {
        return otrasManiobrasDetalle;
    }

    public void setOtrasManiobrasDetalle(String otrasManiobrasDetalle) {
        this.otrasManiobrasDetalle = otrasManiobrasDetalle;
    }

    public Boolean getMeconio() {
        return meconio;
    }

    public void setMeconio(Boolean meconio) {
        this.meconio = meconio;
    }
}
