package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "reciennacido", schema = "sipa")
public class RecienNacidoSipa {
    @EmbeddedId
    private RecienNacidoSipaPK id;
    @Column(name = "nacmultipleorden")
    private Integer nacMultipleOrden;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    @Column(name = "recnacidosexo")
    private String recNacidosexo;
    @Column(name = "recnacidovalorpeso")
    private Integer recNacidoValorPeso;
    @Column(name = "recnacidopeso")
    private String recNacidoPeso;
    @Column(name = "recnacidopercefalico")
    private Integer recNacidoPerCefalico;
    @Column(name = "recnacidolongitud")
    private Integer recNacidoLongitud;
    @Column(name = "edadgestsem")
    private Integer edadgEstSem;
    @Column(name = "edadgestdias")
    private Integer edadGestDias;
    @Column(name = "edadgestpor")
    private String edadGestPor;
    @Column(name = "pesoeg")
    private String pesoEg;
    private Integer apgar1min;
    private Integer apgar5min;
    @Column(name = "reanimacionestimul")
    private String reanimacionEstimul;
    @Column(name = "reanimacionaspiracion")
    private String reanimacionAspiracion;
    @Column(name = "reanimacionmascara")
    private String reanimacionMascara;
    @Column(name = "reanimacionoxigeno")
    private String reanimacionOxigeno;
    @Column(name = "reanimacionmasaje")
    private String reanimacionMasaje;
    @Column(name = "reanimaciontubo")
    private String reanimacionTubo;
    @Column(name = "falleceenparto")
    private String falleceEnParto;
    private String referido;
    @Column(name = "defectoscongenitos")
    private String defectosCongenitos;
    @Column(name = "defectoscongenitoscod")
    private Integer defectosCongenitosCod;
    @Column(name = "enfermedadesneonato")
    private String enfermedadesNeonato;
    @Column(name = "enfermcod1")
    private Integer enfermCod1;
    @Column(name = "enfermdesc1")
    private String enfermDesc1;
    @Column(name = "enfermcod2")
    private Integer enfermCod2;
    @Column(name = "enfermdesc2")
    private String enfermDesc2;
    @Column(name = "enfermcod3")
    private Integer enfermCod3;
    @Column(name = "enfermdesc3")
    private String enfermDesc3;
    @Column(name = "tamizneonatalvdrl")
    private String tamizNeonatalVdrl;
    @Column(name = "tamizneonataltsh")
    private String tamizNeonatalTsh;
    @Column(name = "tamizneonatalhbpatia")
    private String tamizNeonatalHbpatia;
    @Column(name = "tamizneonatalbilirrub")
    private String tamizNeonatalBilirrub;
    @Column(name = "tamizneonataltoxo")
    private String tamizNeonatalToxo;
    @Column(name = "meconio1dia")
    private String meconio1Dia;
    @Column(name = "egresornfecha")
    private Date egresoRnFecha;
    @Column(name = "egresornhora")
    private LocalDateTime egresoRnHora;
    @Column(name = "egresorn")
    private String egresoRn;
    @Column(name = "egresornlugartraslado")
    private String egresoRnLugarTraslado;
    @Column(name = "egresornfallecetraslado")
    private String egresoRnFalleceTraslado;
    @Column(name = "egresornedad")
    private Integer egresoRnEdad;
    @Column(name = "egresornedadmenor1")
    private String egresoRnEdadMenor1;
    @Column(name = "egresornalimentoalalta")
    private String egresoRnAlimentoAlAlta;
    @Column(name = "egresornbocaarriba")
    private String egresoRnBocaArriba;
    @Column(name = "egresornbcg")
    private String egresoRnBcg;
    @Column(name = "egresornpesoalegreso")
    private Integer egresoRnPesoAlEgreso;
    @Column(name = "egresornidrn")
    private Integer egresoRnIdRn;
    @Column(name = "egresornnombrern")
    private String egresoRnNombreRn;
    @Column(name = "egresornresponsable")
    private String egresoRnResponsable;
    @Column(name = "tamizneonataltrat")
    private String tamizNeonatalTrat;
    @Column(name = "vihenrnexpuesto")
    private String vihEnRnExpuesto;
    private String vihenrntto;

    public RecienNacidoSipaPK getId() {
        return id;
    }

    public void setId(RecienNacidoSipaPK id) {
        this.id = id;
    }

    public Integer getNacMultipleOrden() {
        return nacMultipleOrden;
    }

    public void setNacMultipleOrden(Integer nacMultipleOrden) {
        this.nacMultipleOrden = nacMultipleOrden;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getRecNacidosexo() {
        return recNacidosexo;
    }

    public void setRecNacidosexo(String recNacidosexo) {
        this.recNacidosexo = recNacidosexo;
    }

    public Integer getRecNacidoValorPeso() {
        return recNacidoValorPeso;
    }

    public void setRecNacidoValorPeso(Integer recNacidoValorPeso) {
        this.recNacidoValorPeso = recNacidoValorPeso;
    }

    public String getRecNacidoPeso() {
        return recNacidoPeso;
    }

    public void setRecNacidoPeso(String recNacidoPeso) {
        this.recNacidoPeso = recNacidoPeso;
    }

    public Integer getRecNacidoPerCefalico() {
        return recNacidoPerCefalico;
    }

    public void setRecNacidoPerCefalico(Integer recNacidoPerCefalico) {
        this.recNacidoPerCefalico = recNacidoPerCefalico;
    }

    public Integer getRecNacidoLongitud() {
        return recNacidoLongitud;
    }

    public void setRecNacidoLongitud(Integer recNacidoLongitud) {
        this.recNacidoLongitud = recNacidoLongitud;
    }

    public Integer getEdadgEstSem() {
        return edadgEstSem;
    }

    public void setEdadgEstSem(Integer edadgEstSem) {
        this.edadgEstSem = edadgEstSem;
    }

    public Integer getEdadGestDias() {
        return edadGestDias;
    }

    public void setEdadGestDias(Integer edadGestDias) {
        this.edadGestDias = edadGestDias;
    }

    public String getEdadGestPor() {
        return edadGestPor;
    }

    public void setEdadGestPor(String edadGestPor) {
        this.edadGestPor = edadGestPor;
    }

    public String getPesoEg() {
        return pesoEg;
    }

    public void setPesoEg(String pesoEg) {
        this.pesoEg = pesoEg;
    }

    public Integer getApgar1min() {
        return apgar1min;
    }

    public void setApgar1min(Integer apgar1min) {
        this.apgar1min = apgar1min;
    }

    public Integer getApgar5min() {
        return apgar5min;
    }

    public void setApgar5min(Integer apgar5min) {
        this.apgar5min = apgar5min;
    }

    public String getReanimacionEstimul() {
        return reanimacionEstimul;
    }

    public void setReanimacionEstimul(String reanimacionEstimul) {
        this.reanimacionEstimul = reanimacionEstimul;
    }

    public String getReanimacionAspiracion() {
        return reanimacionAspiracion;
    }

    public void setReanimacionAspiracion(String reanimacionAspiracion) {
        this.reanimacionAspiracion = reanimacionAspiracion;
    }

    public String getReanimacionMascara() {
        return reanimacionMascara;
    }

    public void setReanimacionMascara(String reanimacionMascara) {
        this.reanimacionMascara = reanimacionMascara;
    }

    public String getReanimacionOxigeno() {
        return reanimacionOxigeno;
    }

    public void setReanimacionOxigeno(String reanimacionOxigeno) {
        this.reanimacionOxigeno = reanimacionOxigeno;
    }

    public String getReanimacionMasaje() {
        return reanimacionMasaje;
    }

    public void setReanimacionMasaje(String reanimacionMasaje) {
        this.reanimacionMasaje = reanimacionMasaje;
    }

    public String getReanimacionTubo() {
        return reanimacionTubo;
    }

    public void setReanimacionTubo(String reanimacionTubo) {
        this.reanimacionTubo = reanimacionTubo;
    }

    public String getFalleceEnParto() {
        return falleceEnParto;
    }

    public void setFalleceEnParto(String falleceEnParto) {
        this.falleceEnParto = falleceEnParto;
    }

    public String getReferido() {
        return referido;
    }

    public void setReferido(String referido) {
        this.referido = referido;
    }

    public String getDefectosCongenitos() {
        return defectosCongenitos;
    }

    public void setDefectosCongenitos(String defectosCongenitos) {
        this.defectosCongenitos = defectosCongenitos;
    }

    public Integer getDefectosCongenitosCod() {
        return defectosCongenitosCod;
    }

    public void setDefectosCongenitosCod(Integer defectosCongenitosCod) {
        this.defectosCongenitosCod = defectosCongenitosCod;
    }

    public String getEnfermedadesNeonato() {
        return enfermedadesNeonato;
    }

    public void setEnfermedadesNeonato(String enfermedadesNeonato) {
        this.enfermedadesNeonato = enfermedadesNeonato;
    }

    public Integer getEnfermCod1() {
        return enfermCod1;
    }

    public void setEnfermCod1(Integer enfermCod1) {
        this.enfermCod1 = enfermCod1;
    }

    public String getEnfermDesc1() {
        return enfermDesc1;
    }

    public void setEnfermDesc1(String enfermDesc1) {
        this.enfermDesc1 = enfermDesc1;
    }

    public Integer getEnfermCod2() {
        return enfermCod2;
    }

    public void setEnfermCod2(Integer enfermCod2) {
        this.enfermCod2 = enfermCod2;
    }

    public String getEnfermDesc2() {
        return enfermDesc2;
    }

    public void setEnfermDesc2(String enfermDesc2) {
        this.enfermDesc2 = enfermDesc2;
    }

    public Integer getEnfermCod3() {
        return enfermCod3;
    }

    public void setEnfermCod3(Integer enfermCod3) {
        this.enfermCod3 = enfermCod3;
    }

    public String getEnfermDesc3() {
        return enfermDesc3;
    }

    public void setEnfermDesc3(String enfermDesc3) {
        this.enfermDesc3 = enfermDesc3;
    }

    public String getTamizNeonatalVdrl() {
        return tamizNeonatalVdrl;
    }

    public void setTamizNeonatalVdrl(String tamizNeonatalVdrl) {
        this.tamizNeonatalVdrl = tamizNeonatalVdrl;
    }

    public String getTamizNeonatalTsh() {
        return tamizNeonatalTsh;
    }

    public void setTamizNeonatalTsh(String tamizNeonatalTsh) {
        this.tamizNeonatalTsh = tamizNeonatalTsh;
    }

    public String getTamizNeonatalHbpatia() {
        return tamizNeonatalHbpatia;
    }

    public void setTamizNeonatalHbpatia(String tamizNeonatalHbpatia) {
        this.tamizNeonatalHbpatia = tamizNeonatalHbpatia;
    }

    public String getTamizNeonatalBilirrub() {
        return tamizNeonatalBilirrub;
    }

    public void setTamizNeonatalBilirrub(String tamizNeonatalBilirrub) {
        this.tamizNeonatalBilirrub = tamizNeonatalBilirrub;
    }

    public String getTamizNeonatalToxo() {
        return tamizNeonatalToxo;
    }

    public void setTamizNeonatalToxo(String tamizNeonatalToxo) {
        this.tamizNeonatalToxo = tamizNeonatalToxo;
    }

    public String getMeconio1Dia() {
        return meconio1Dia;
    }

    public void setMeconio1Dia(String meconio1Dia) {
        this.meconio1Dia = meconio1Dia;
    }

    public Date getEgresoRnFecha() {
        return egresoRnFecha;
    }

    public void setEgresoRnFecha(Date egresoRnFecha) {
        this.egresoRnFecha = egresoRnFecha;
    }

    public LocalDateTime getEgresoRnHora() {
        return egresoRnHora;
    }

    public void setEgresoRnHora(LocalDateTime egresoRnHora) {
        this.egresoRnHora = egresoRnHora;
    }

    public String getEgresoRn() {
        return egresoRn;
    }

    public void setEgresoRn(String egresoRn) {
        this.egresoRn = egresoRn;
    }

    public String getEgresoRnLugarTraslado() {
        return egresoRnLugarTraslado;
    }

    public void setEgresoRnLugarTraslado(String egresoRnLugarTraslado) {
        this.egresoRnLugarTraslado = egresoRnLugarTraslado;
    }

    public String getEgresoRnFalleceTraslado() {
        return egresoRnFalleceTraslado;
    }

    public void setEgresoRnFalleceTraslado(String egresoRnFalleceTraslado) {
        this.egresoRnFalleceTraslado = egresoRnFalleceTraslado;
    }

    public Integer getEgresoRnEdad() {
        return egresoRnEdad;
    }

    public void setEgresoRnEdad(Integer egresoRnEdad) {
        this.egresoRnEdad = egresoRnEdad;
    }

    public String getEgresoRnEdadMenor1() {
        return egresoRnEdadMenor1;
    }

    public void setEgresoRnEdadMenor1(String egresoRnEdadMenor1) {
        this.egresoRnEdadMenor1 = egresoRnEdadMenor1;
    }

    public String getEgresoRnAlimentoAlAlta() {
        return egresoRnAlimentoAlAlta;
    }

    public void setEgresoRnAlimentoAlAlta(String egresoRnAlimentoAlAlta) {
        this.egresoRnAlimentoAlAlta = egresoRnAlimentoAlAlta;
    }

    public String getEgresoRnBocaArriba() {
        return egresoRnBocaArriba;
    }

    public void setEgresoRnBocaArriba(String egresoRnBocaArriba) {
        this.egresoRnBocaArriba = egresoRnBocaArriba;
    }

    public String getEgresoRnBcg() {
        return egresoRnBcg;
    }

    public void setEgresoRnBcg(String egresoRnBcg) {
        this.egresoRnBcg = egresoRnBcg;
    }

    public Integer getEgresoRnPesoAlEgreso() {
        return egresoRnPesoAlEgreso;
    }

    public void setEgresoRnPesoAlEgreso(Integer egresoRnPesoAlEgreso) {
        this.egresoRnPesoAlEgreso = egresoRnPesoAlEgreso;
    }

    public Integer getEgresoRnIdRn() {
        return egresoRnIdRn;
    }

    public void setEgresoRnIdRn(Integer egresoRnIdRn) {
        this.egresoRnIdRn = egresoRnIdRn;
    }

    public String getEgresoRnNombreRn() {
        return egresoRnNombreRn;
    }

    public void setEgresoRnNombreRn(String egresoRnNombreRn) {
        this.egresoRnNombreRn = egresoRnNombreRn;
    }

    public String getEgresoRnResponsable() {
        return egresoRnResponsable;
    }

    public void setEgresoRnResponsable(String egresoRnResponsable) {
        this.egresoRnResponsable = egresoRnResponsable;
    }

    public String getTamizNeonatalTrat() {
        return tamizNeonatalTrat;
    }

    public void setTamizNeonatalTrat(String tamizNeonatalTrat) {
        this.tamizNeonatalTrat = tamizNeonatalTrat;
    }

    public String getVihEnRnExpuesto() {
        return vihEnRnExpuesto;
    }

    public void setVihEnRnExpuesto(String vihEnRnExpuesto) {
        this.vihEnRnExpuesto = vihEnRnExpuesto;
    }

    public String getVihenrntto() {
        return vihenrntto;
    }

    public void setVihenrntto(String vihenrntto) {
        this.vihenrntto = vihenrntto;
    }
}
