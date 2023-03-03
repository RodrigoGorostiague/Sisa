package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


import java.sql.Date;

@Entity
@Table(schema = "historialinternacion", name = "evoluciondiariautiinf")
public class EvolucionDiariautiInf {
    @EmbeddedId
    private EvolucionDiariautiInfPK id;
    @Column(name = "estadogeneral")
    private String estadoGeneral;
    private Integer peso;
    private Integer talla;
    @Column(name = "tasistolica")
    private Integer taSistolica;
    @Column(name = "tadiastolica")
    private Integer taDastolica;
    @Column(name = "temperaturaaxial")
    private Integer temperaturaAxial;
    @Column(name = "freccardiaca")
    private Integer frecCardiaca;
    @Column(name = "frecrespiratoria")
    private Integer frecRespiratoria;
    private Integer saturometria;
    private Boolean edema;
    @Column(name = "edema_localizacion")
    private String edemalocalizacion;
    private String coloracion;
    private String lesiones;
    @Column(name = "balance_ingresos")
    private Integer balanceIngresos;
    @Column(name = "balance_egresos")
    private Integer balanceEgresos;
    @Column(name = "catetercentral")
    private Boolean cateterCentral;
    @Column(name = "catetercentral_localizacion")
    private String cateterCentralLocalizacion;
    @Column(name = "cateterpercutaneo")
    private Boolean cateterPercutaneo;
    @Column(name = "cateterpercutaneo_localizacion")
    private String cateterPercutaneoLocalizacion;
    @Column(name = "cateterpercutaneo_dias")
    private Integer cateterPercutaneoDias;
    @Column(name = "viasperifericas")
    private Boolean viasPerifericas;
    @Column(name = "viasperifericas_localizacion")
    private String viasPerifericasLocalizacion;
    @Column(name = "evclinicaysemiologica")
    private String evoClinicaSemiologica;
    @Column(name = "choquepunta")
    private String choquePunta;
    @Column(name = "1erruido")
    private String primerRuido;
    @Column(name = "1erruido_causa")
    private String primerRuidoCausa;
    @Column(name = "2doruido")
    private String segundoRuido;
    @Column(name = "2doruido_causa")
    private String segundoRuidoCausa;
    private String silencios;
    private String ritmo;
    @Column(name = "ritmo_tipo")
    private String ritmoTipo;
    @Column(name = "relleno_capilar")
    private String rellenoCapilar;
    @Column(name = "pulsos_periferico")
    private String pulsosPeriferico;
    @Column(name = "drenajescardio")
    private String drenajesCardio;
    private Boolean inotropicos;
    @Column(name = "inotropicos_obs")
    private String inotropicosObs;
    private Integer fio2;
    @Column(name = "presinspmax")
    private Integer presInspMax;
    private Integer peep;
    @Column(name = "voltidal")
    private Integer volTidal;
    private Integer flujo;
     @Column(name = "tiempoins")
    private Integer tiempoIns;
     @Column(name = "ppico")
     private Integer pPico;
     @Column(name = "pplateau")
     private Integer pPlateau;
     @Column(name = "pao2fio2")
     private Integer pao2Fio2;
     private Boolean tiraje;
     @Column(name = "tiraje_localizacion")
     private String tirajeLocalizacion;
     @Column(name = "aleteonasal")
     private Boolean aleteoNasal;
     @Column(name = "entradaairederecho")
     private String  entradaAireDerecho;
     @Column(name = "entradaaireizquierdo")
     private String entradaAireIzquierdo;
     @Column(name = "ruidosagregados")
     private Boolean ruidosAgregados;
     @Column(name = "ruidosagregados_tipo")
     private String ruidosAgregadosTipo;
     @Column(name = "drenajes_respiratorio")
     private String drenajesRespiratorio;
     @Column(name = "comentarios_respiratorio")
     private String comentariosRespiratorio;
     @Column(name = "abdomen_blando")
     private Boolean abdomenBlando;
     @Column(name = "abdomen_depresible")
     private Boolean abdomenDepresible;
     @Column(name = "abdomen_doloroso")
     private Boolean abdomenDoloroso;
     @Column(name = "abdomen_doloroso_localizacion")
     private String abdomenDolorosoLocalizacion;
     private Boolean catarsis;
     @Column(name = "higado_bordesup")
     private String higadoBordeSup;
     @Column(name = "higado_bordeinf")
     private String higadoBordeInf;
     @Column(name = "higado_altura")
     private Integer higadoAltura;
     @Column(name = "higado_consistencia")
     private String higadoConsistencia;
     @Column(name = "sondanasogast")
     private Boolean sondaNasogast;
     @Column(name = "sondanasogast_dias")
     private Integer sondaNasogastDias;
     private String alimetacion;
     @Column(name = "alimentacion_obs")
     private String alimentacionObs;
     @Column(name = "bazo_palpable")
     private Boolean bazoPalpable;
     @Column(name = "bazo_tamaño")
     private String bazoTamanio;
     @Column(name = "riñontamaño_izq")
     private String rinionTamanioIzq;
     @Column(name = "riñontamaño_der")
     private String rinionTamanioDer;
     @Column(name = "sondavesical")
     private Boolean sondaVesical;
     @Column(name = "sondavesical_dias")
     private Integer sondaVesicalDias;
     @Column(name = "sondavesical_recambio")
     private Date sondaVesicalRecambio;
     @Column(name = "drenajes_digestivo")
     private String drenajesDigestivo;
     @Column(name = "comentarios_digestivo")
     private String comentariosDigestivo;
     @Column(name = "reflejos_osteoten")
     private String reflejosOsteoten;
     @Column(name = "reflejos_cutaneos")
     private String reflejosCutaneos;
     @Column(name = "pupilas_isocoricas")
     private Boolean pupilasIsocoricas;
     @Column(name = "pupilas_reaccion")
     private Boolean pupilasReaccion;
     @Column(name = "pupilas_reaccion_obs")
     private String pupilasReaccionDbs;
     @Column(name = "glasgowocular_neuro")
     private Integer glasgowOcularNeuro;
     @Column(name = "glasgowverbal_neuro")
     private Integer glasgowVerbalNeuro;
     @Column(name = "glasgowmotor_neuro")
     private Integer glasgowMotorNeuro;
     @Column(name = "presintracraneana")
     private String presIntraCraneana;
     @Column(name = "motilidad_activa")
     private String  motilidadActiva;
     @Column(name = "motilidad_pasiva")
     private String motilidadPasiva;
     private String sensibilidad;
     private String tono;
     @Column(name = "drenajes_nervioso")
     private String drenajesNervioso;
     @Column(name = "comentarios_nervioso")
     private String comentariosNervioso;
     private String sangre;
     @Column(name = "sangre_obs")
     private String sangreObs;
     private String orina;
     @Column(name = "orina_obs")
     private String orinaObs;
     private String cateter;
     @Column(name = "cateter_obs")
     private String cateterObs;
     private Boolean antibioticos;
     @Column(name = "antibioticos_obs")
     private String antibioticosObs;
     @Column(name = "comentarios_infectologicos")
     private String comentariosInfectologicos;
     @Column(name = "asistenciarespiratoria")
     private String asistenciaRespiratoria;
     @Column(name = "arm_dias")
     private Integer armDias;
     @Column(name = "arm_modo")
     private String armModo;
     @Column(name = "tet_dias")
     private Integer tetDias;
     @Column(name = "tet_numero")
     private Integer tetNumero;
     @Column(name = "tet_balon")
     private Boolean tetBalon;
     @Column(name = "tet_recambio")
     private Boolean tetRecambio;
     @Column(name = "tet_recambio_fecha")
     private Date tetRecambioFecha;
     @Column(name = "tet_arcadadental")
     private Integer tetArcadaDental;
     @Column(name = "sondanasogast_recambio")
    private Date sondaNasogastRecambio;
     @Column(name = "catetercentral_dias")
     private Integer cateterCentralDias;
     @Column(name = "catetercentral_lateralidad")
     private String cateterCentralLateralidad;
     private String sedacion;
     @Column(name = "arm_via")
     private String armVia;

    public EvolucionDiariautiInfPK getId() {
        return id;
    }

    public void setId(EvolucionDiariautiInfPK id) {
        this.id = id;
    }

    public String getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(String estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public Integer getTaSistolica() {
        return taSistolica;
    }

    public void setTaSistolica(Integer taSistolica) {
        this.taSistolica = taSistolica;
    }

    public Integer getTaDastolica() {
        return taDastolica;
    }

    public void setTaDastolica(Integer taDastolica) {
        this.taDastolica = taDastolica;
    }

    public Integer getTemperaturaAxial() {
        return temperaturaAxial;
    }

    public void setTemperaturaAxial(Integer temperaturaAxial) {
        this.temperaturaAxial = temperaturaAxial;
    }

    public Integer getFrecCardiaca() {
        return frecCardiaca;
    }

    public void setFrecCardiaca(Integer frecCardiaca) {
        this.frecCardiaca = frecCardiaca;
    }

    public Integer getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(Integer frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }

    public Integer getSaturometria() {
        return saturometria;
    }

    public void setSaturometria(Integer saturometria) {
        this.saturometria = saturometria;
    }

    public Boolean getEdema() {
        return edema;
    }

    public void setEdema(Boolean edema) {
        this.edema = edema;
    }

    public String getEdemalocalizacion() {
        return edemalocalizacion;
    }

    public void setEdemalocalizacion(String edemalocalizacion) {
        this.edemalocalizacion = edemalocalizacion;
    }

    public String getColoracion() {
        return coloracion;
    }

    public void setColoracion(String coloracion) {
        this.coloracion = coloracion;
    }

    public String getLesiones() {
        return lesiones;
    }

    public void setLesiones(String lesiones) {
        this.lesiones = lesiones;
    }

    public Integer getBalanceIngresos() {
        return balanceIngresos;
    }

    public void setBalanceIngresos(Integer balanceIngresos) {
        this.balanceIngresos = balanceIngresos;
    }

    public Integer getBalanceEgresos() {
        return balanceEgresos;
    }

    public void setBalanceEgresos(Integer balanceEgresos) {
        this.balanceEgresos = balanceEgresos;
    }

    public Boolean getCateterCentral() {
        return cateterCentral;
    }

    public void setCateterCentral(Boolean cateterCentral) {
        this.cateterCentral = cateterCentral;
    }

    public String getCateterCentralLocalizacion() {
        return cateterCentralLocalizacion;
    }

    public void setCateterCentralLocalizacion(String cateterCentralLocalizacion) {
        this.cateterCentralLocalizacion = cateterCentralLocalizacion;
    }

    public Boolean getCateterPercutaneo() {
        return cateterPercutaneo;
    }

    public void setCateterPercutaneo(Boolean cateterPercutaneo) {
        this.cateterPercutaneo = cateterPercutaneo;
    }

    public String getCateterPercutaneoLocalizacion() {
        return cateterPercutaneoLocalizacion;
    }

    public void setCateterPercutaneoLocalizacion(String cateterPercutaneoLocalizacion) {
        this.cateterPercutaneoLocalizacion = cateterPercutaneoLocalizacion;
    }

    public Integer getCateterPercutaneoDias() {
        return cateterPercutaneoDias;
    }

    public void setCateterPercutaneoDias(Integer cateterPercutaneoDias) {
        this.cateterPercutaneoDias = cateterPercutaneoDias;
    }

    public Boolean getViasPerifericas() {
        return viasPerifericas;
    }

    public void setViasPerifericas(Boolean viasPerifericas) {
        this.viasPerifericas = viasPerifericas;
    }

    public String getViasPerifericasLocalizacion() {
        return viasPerifericasLocalizacion;
    }

    public void setViasPerifericasLocalizacion(String viasPerifericasLocalizacion) {
        this.viasPerifericasLocalizacion = viasPerifericasLocalizacion;
    }

    public String getEvoClinicaSemiologica() {
        return evoClinicaSemiologica;
    }

    public void setEvoClinicaSemiologica(String evoClinicaSemiologica) {
        this.evoClinicaSemiologica = evoClinicaSemiologica;
    }

    public String getChoquePunta() {
        return choquePunta;
    }

    public void setChoquePunta(String choquePunta) {
        this.choquePunta = choquePunta;
    }

    public String getPrimerRuido() {
        return primerRuido;
    }

    public void setPrimerRuido(String primerRuido) {
        this.primerRuido = primerRuido;
    }

    public String getPrimerRuidoCausa() {
        return primerRuidoCausa;
    }

    public void setPrimerRuidoCausa(String primerRuidoCausa) {
        this.primerRuidoCausa = primerRuidoCausa;
    }

    public String getSegundoRuido() {
        return segundoRuido;
    }

    public void setSegundoRuido(String segundoRuido) {
        this.segundoRuido = segundoRuido;
    }

    public String getSegundoRuidoCausa() {
        return segundoRuidoCausa;
    }

    public void setSegundoRuidoCausa(String segundoRuidoCausa) {
        this.segundoRuidoCausa = segundoRuidoCausa;
    }

    public String getSilencios() {
        return silencios;
    }

    public void setSilencios(String silencios) {
        this.silencios = silencios;
    }

    public String getRitmo() {
        return ritmo;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    public String getRitmoTipo() {
        return ritmoTipo;
    }

    public void setRitmoTipo(String ritmoTipo) {
        this.ritmoTipo = ritmoTipo;
    }

    public String getRellenoCapilar() {
        return rellenoCapilar;
    }

    public void setRellenoCapilar(String rellenoCapilar) {
        this.rellenoCapilar = rellenoCapilar;
    }

    public String getPulsosPeriferico() {
        return pulsosPeriferico;
    }

    public void setPulsosPeriferico(String pulsosPeriferico) {
        this.pulsosPeriferico = pulsosPeriferico;
    }

    public String getDrenajesCardio() {
        return drenajesCardio;
    }

    public void setDrenajesCardio(String drenajesCardio) {
        this.drenajesCardio = drenajesCardio;
    }

    public Boolean getInotropicos() {
        return inotropicos;
    }

    public void setInotropicos(Boolean inotropicos) {
        this.inotropicos = inotropicos;
    }

    public String getInotropicosObs() {
        return inotropicosObs;
    }

    public void setInotropicosObs(String inotropicosObs) {
        this.inotropicosObs = inotropicosObs;
    }

    public Integer getFio2() {
        return fio2;
    }

    public void setFio2(Integer fio2) {
        this.fio2 = fio2;
    }

    public Integer getPresInspMax() {
        return presInspMax;
    }

    public void setPresInspMax(Integer presInspMax) {
        this.presInspMax = presInspMax;
    }

    public Integer getPeep() {
        return peep;
    }

    public void setPeep(Integer peep) {
        this.peep = peep;
    }

    public Integer getVolTidal() {
        return volTidal;
    }

    public void setVolTidal(Integer volTidal) {
        this.volTidal = volTidal;
    }

    public Integer getFlujo() {
        return flujo;
    }

    public void setFlujo(Integer flujo) {
        this.flujo = flujo;
    }

    public Integer getTiempoIns() {
        return tiempoIns;
    }

    public void setTiempoIns(Integer tiempoIns) {
        this.tiempoIns = tiempoIns;
    }

    public Integer getpPico() {
        return pPico;
    }

    public void setpPico(Integer pPico) {
        this.pPico = pPico;
    }

    public Integer getpPlateau() {
        return pPlateau;
    }

    public void setpPlateau(Integer pPlateau) {
        this.pPlateau = pPlateau;
    }

    public Integer getPao2Fio2() {
        return pao2Fio2;
    }

    public void setPao2Fio2(Integer pao2Fio2) {
        this.pao2Fio2 = pao2Fio2;
    }

    public Boolean getTiraje() {
        return tiraje;
    }

    public void setTiraje(Boolean tiraje) {
        this.tiraje = tiraje;
    }

    public String getTirajeLocalizacion() {
        return tirajeLocalizacion;
    }

    public void setTirajeLocalizacion(String tirajeLocalizacion) {
        this.tirajeLocalizacion = tirajeLocalizacion;
    }

    public Boolean getAleteoNasal() {
        return aleteoNasal;
    }

    public void setAleteoNasal(Boolean aleteoNasal) {
        this.aleteoNasal = aleteoNasal;
    }

    public String getEntradaAireDerecho() {
        return entradaAireDerecho;
    }

    public void setEntradaAireDerecho(String entradaAireDerecho) {
        this.entradaAireDerecho = entradaAireDerecho;
    }

    public String getEntradaAireIzquierdo() {
        return entradaAireIzquierdo;
    }

    public void setEntradaAireIzquierdo(String entradaAireIzquierdo) {
        this.entradaAireIzquierdo = entradaAireIzquierdo;
    }

    public Boolean getRuidosAgregados() {
        return ruidosAgregados;
    }

    public void setRuidosAgregados(Boolean ruidosAgregados) {
        this.ruidosAgregados = ruidosAgregados;
    }

    public String getRuidosAgregadosTipo() {
        return ruidosAgregadosTipo;
    }

    public void setRuidosAgregadosTipo(String ruidosAgregadosTipo) {
        this.ruidosAgregadosTipo = ruidosAgregadosTipo;
    }

    public String getDrenajesRespiratorio() {
        return drenajesRespiratorio;
    }

    public void setDrenajesRespiratorio(String drenajesRespiratorio) {
        this.drenajesRespiratorio = drenajesRespiratorio;
    }

    public String getComentariosRespiratorio() {
        return comentariosRespiratorio;
    }

    public void setComentariosRespiratorio(String comentariosRespiratorio) {
        this.comentariosRespiratorio = comentariosRespiratorio;
    }

    public Boolean getAbdomenBlando() {
        return abdomenBlando;
    }

    public void setAbdomenBlando(Boolean abdomenBlando) {
        this.abdomenBlando = abdomenBlando;
    }

    public Boolean getAbdomenDepresible() {
        return abdomenDepresible;
    }

    public void setAbdomenDepresible(Boolean abdomenDepresible) {
        this.abdomenDepresible = abdomenDepresible;
    }

    public Boolean getAbdomenDoloroso() {
        return abdomenDoloroso;
    }

    public void setAbdomenDoloroso(Boolean abdomenDoloroso) {
        this.abdomenDoloroso = abdomenDoloroso;
    }

    public String getAbdomenDolorosoLocalizacion() {
        return abdomenDolorosoLocalizacion;
    }

    public void setAbdomenDolorosoLocalizacion(String abdomenDolorosoLocalizacion) {
        this.abdomenDolorosoLocalizacion = abdomenDolorosoLocalizacion;
    }

    public Boolean getCatarsis() {
        return catarsis;
    }

    public void setCatarsis(Boolean catarsis) {
        this.catarsis = catarsis;
    }

    public String getHigadoBordeSup() {
        return higadoBordeSup;
    }

    public void setHigadoBordeSup(String higadoBordeSup) {
        this.higadoBordeSup = higadoBordeSup;
    }

    public String getHigadoBordeInf() {
        return higadoBordeInf;
    }

    public void setHigadoBordeInf(String higadoBordeInf) {
        this.higadoBordeInf = higadoBordeInf;
    }

    public Integer getHigadoAltura() {
        return higadoAltura;
    }

    public void setHigadoAltura(Integer higadoAltura) {
        this.higadoAltura = higadoAltura;
    }

    public String getHigadoConsistencia() {
        return higadoConsistencia;
    }

    public void setHigadoConsistencia(String higadoConsistencia) {
        this.higadoConsistencia = higadoConsistencia;
    }

    public Boolean getSondaNasogast() {
        return sondaNasogast;
    }

    public void setSondaNasogast(Boolean sondaNasogast) {
        this.sondaNasogast = sondaNasogast;
    }

    public Integer getSondaNasogastDias() {
        return sondaNasogastDias;
    }

    public void setSondaNasogastDias(Integer sondaNasogastDias) {
        this.sondaNasogastDias = sondaNasogastDias;
    }

    public String getAlimetacion() {
        return alimetacion;
    }

    public void setAlimetacion(String alimetacion) {
        this.alimetacion = alimetacion;
    }

    public String getAlimentacionObs() {
        return alimentacionObs;
    }

    public void setAlimentacionObs(String alimentacionObs) {
        this.alimentacionObs = alimentacionObs;
    }

    public Boolean getBazoPalpable() {
        return bazoPalpable;
    }

    public void setBazoPalpable(Boolean bazoPalpable) {
        this.bazoPalpable = bazoPalpable;
    }

    public String getBazoTamanio() {
        return bazoTamanio;
    }

    public void setBazoTamanio(String bazoTamanio) {
        this.bazoTamanio = bazoTamanio;
    }

    public String getRinionTamanioIzq() {
        return rinionTamanioIzq;
    }

    public void setRinionTamanioIzq(String rinionTamanioIzq) {
        this.rinionTamanioIzq = rinionTamanioIzq;
    }

    public String getRinionTamanioDer() {
        return rinionTamanioDer;
    }

    public void setRinionTamanioDer(String rinionTamanioDer) {
        this.rinionTamanioDer = rinionTamanioDer;
    }

    public Boolean getSondaVesical() {
        return sondaVesical;
    }

    public void setSondaVesical(Boolean sondaVesical) {
        this.sondaVesical = sondaVesical;
    }

    public Integer getSondaVesicalDias() {
        return sondaVesicalDias;
    }

    public void setSondaVesicalDias(Integer sondaVesicalDias) {
        this.sondaVesicalDias = sondaVesicalDias;
    }

    public Date getSondaVesicalRecambio() {
        return sondaVesicalRecambio;
    }

    public void setSondaVesicalRecambio(Date sondaVesicalRecambio) {
        this.sondaVesicalRecambio = sondaVesicalRecambio;
    }

    public String getDrenajesDigestivo() {
        return drenajesDigestivo;
    }

    public void setDrenajesDigestivo(String drenajesDigestivo) {
        this.drenajesDigestivo = drenajesDigestivo;
    }

    public String getComentariosDigestivo() {
        return comentariosDigestivo;
    }

    public void setComentariosDigestivo(String comentariosDigestivo) {
        this.comentariosDigestivo = comentariosDigestivo;
    }

    public String getReflejosOsteoten() {
        return reflejosOsteoten;
    }

    public void setReflejosOsteoten(String reflejosOsteoten) {
        this.reflejosOsteoten = reflejosOsteoten;
    }

    public String getReflejosCutaneos() {
        return reflejosCutaneos;
    }

    public void setReflejosCutaneos(String reflejosCutaneos) {
        this.reflejosCutaneos = reflejosCutaneos;
    }

    public Boolean getPupilasIsocoricas() {
        return pupilasIsocoricas;
    }

    public void setPupilasIsocoricas(Boolean pupilasIsocoricas) {
        this.pupilasIsocoricas = pupilasIsocoricas;
    }

    public Boolean getPupilasReaccion() {
        return pupilasReaccion;
    }

    public void setPupilasReaccion(Boolean pupilasReaccion) {
        this.pupilasReaccion = pupilasReaccion;
    }

    public String getPupilasReaccionDbs() {
        return pupilasReaccionDbs;
    }

    public void setPupilasReaccionDbs(String pupilasReaccionDbs) {
        this.pupilasReaccionDbs = pupilasReaccionDbs;
    }

    public Integer getGlasgowOcularNeuro() {
        return glasgowOcularNeuro;
    }

    public void setGlasgowOcularNeuro(Integer glasgowOcularNeuro) {
        this.glasgowOcularNeuro = glasgowOcularNeuro;
    }

    public Integer getGlasgowVerbalNeuro() {
        return glasgowVerbalNeuro;
    }

    public void setGlasgowVerbalNeuro(Integer glasgowVerbalNeuro) {
        this.glasgowVerbalNeuro = glasgowVerbalNeuro;
    }

    public Integer getGlasgowMotorNeuro() {
        return glasgowMotorNeuro;
    }

    public void setGlasgowMotorNeuro(Integer glasgowMotorNeuro) {
        this.glasgowMotorNeuro = glasgowMotorNeuro;
    }

    public String getPresIntraCraneana() {
        return presIntraCraneana;
    }

    public void setPresIntraCraneana(String presIntraCraneana) {
        this.presIntraCraneana = presIntraCraneana;
    }

    public String getMotilidadActiva() {
        return motilidadActiva;
    }

    public void setMotilidadActiva(String motilidadActiva) {
        this.motilidadActiva = motilidadActiva;
    }

    public String getMotilidadPasiva() {
        return motilidadPasiva;
    }

    public void setMotilidadPasiva(String motilidadPasiva) {
        this.motilidadPasiva = motilidadPasiva;
    }

    public String getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(String sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public String getTono() {
        return tono;
    }

    public void setTono(String tono) {
        this.tono = tono;
    }

    public String getDrenajesNervioso() {
        return drenajesNervioso;
    }

    public void setDrenajesNervioso(String drenajesNervioso) {
        this.drenajesNervioso = drenajesNervioso;
    }

    public String getComentariosNervioso() {
        return comentariosNervioso;
    }

    public void setComentariosNervioso(String comentariosNervioso) {
        this.comentariosNervioso = comentariosNervioso;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getSangreObs() {
        return sangreObs;
    }

    public void setSangreObs(String sangreObs) {
        this.sangreObs = sangreObs;
    }

    public String getOrina() {
        return orina;
    }

    public void setOrina(String orina) {
        this.orina = orina;
    }

    public String getOrinaObs() {
        return orinaObs;
    }

    public void setOrinaObs(String orinaObs) {
        this.orinaObs = orinaObs;
    }

    public String getCateter() {
        return cateter;
    }

    public void setCateter(String cateter) {
        this.cateter = cateter;
    }

    public String getCateterObs() {
        return cateterObs;
    }

    public void setCateterObs(String cateterObs) {
        this.cateterObs = cateterObs;
    }

    public Boolean getAntibioticos() {
        return antibioticos;
    }

    public void setAntibioticos(Boolean antibioticos) {
        this.antibioticos = antibioticos;
    }

    public String getAntibioticosObs() {
        return antibioticosObs;
    }

    public void setAntibioticosObs(String antibioticosObs) {
        this.antibioticosObs = antibioticosObs;
    }

    public String getComentariosInfectologicos() {
        return comentariosInfectologicos;
    }

    public void setComentariosInfectologicos(String comentariosInfectologicos) {
        this.comentariosInfectologicos = comentariosInfectologicos;
    }

    public String getAsistenciaRespiratoria() {
        return asistenciaRespiratoria;
    }

    public void setAsistenciaRespiratoria(String asistenciaRespiratoria) {
        this.asistenciaRespiratoria = asistenciaRespiratoria;
    }

    public Integer getArmDias() {
        return armDias;
    }

    public void setArmDias(Integer armDias) {
        this.armDias = armDias;
    }

    public String getArmModo() {
        return armModo;
    }

    public void setArmModo(String armModo) {
        this.armModo = armModo;
    }

    public Integer getTetDias() {
        return tetDias;
    }

    public void setTetDias(Integer tetDias) {
        this.tetDias = tetDias;
    }

    public Integer getTetNumero() {
        return tetNumero;
    }

    public void setTetNumero(Integer tetNumero) {
        this.tetNumero = tetNumero;
    }

    public Boolean getTetBalon() {
        return tetBalon;
    }

    public void setTetBalon(Boolean tetBalon) {
        this.tetBalon = tetBalon;
    }

    public Boolean getTetRecambio() {
        return tetRecambio;
    }

    public void setTetRecambio(Boolean tetRecambio) {
        this.tetRecambio = tetRecambio;
    }

    public Date getTetRecambioFecha() {
        return tetRecambioFecha;
    }

    public void setTetRecambioFecha(Date tetRecambioFecha) {
        this.tetRecambioFecha = tetRecambioFecha;
    }

    public Integer getTetArcadaDental() {
        return tetArcadaDental;
    }

    public void setTetArcadaDental(Integer tetArcadaDental) {
        this.tetArcadaDental = tetArcadaDental;
    }

    public Date getSondaNasogastRecambio() {
        return sondaNasogastRecambio;
    }

    public void setSondaNasogastRecambio(Date sondaNasogastRecambio) {
        this.sondaNasogastRecambio = sondaNasogastRecambio;
    }

    public Integer getCateterCentralDias() {
        return cateterCentralDias;
    }

    public void setCateterCentralDias(Integer cateterCentralDias) {
        this.cateterCentralDias = cateterCentralDias;
    }

    public String getCateterCentralLateralidad() {
        return cateterCentralLateralidad;
    }

    public void setCateterCentralLateralidad(String cateterCentralLateralidad) {
        this.cateterCentralLateralidad = cateterCentralLateralidad;
    }

    public String getSedacion() {
        return sedacion;
    }

    public void setSedacion(String sedacion) {
        this.sedacion = sedacion;
    }

    public String getArmVia() {
        return armVia;
    }

    public void setArmVia(String armVia) {
        this.armVia = armVia;
    }
}
