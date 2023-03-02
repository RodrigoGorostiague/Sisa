package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.nomencladores.NomencladorEnfermedadesCie10;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "otrprofplanillaemer", schema = "emergencia")
public class OtrProfPlanillaEmer {
    @EmbeddedId
    private OtrProfPlanillaEmerPK id;
    @OneToMany
    @JoinColumn(name = "codigodiagnostico", referencedColumnName = "codigo")
    private List<NomencladorEnfermedadesCie10> nomencladorEnfermedadesCie10;
    private String policia;
    private String defuncion;
    private String consulta;
    private String curacion;
    @Column(name = "sutura_old")
    private String suturaOld;
    private String quemado;
    private String inyeccion;
    private String presion;
    private String nebulizacion;
    @Column(name = "yeso_venda_old")
    private String yesoVendaOld;
    private String medicamentos;
    private String radiologia;
    private String laboratorio;
    @Column(name = "medicamentostxt_old")
    private String medicamentosTxtOld;
    @Column(name = "radiologiatxt_old")
    private String radiologiaTxtOld;
    @Column(name = "laboratoriotxt_old")
    private String laboratorioTxtOld;
    @Column(name = "enfermeriatxt_old")
    private String enfermeriatxtOld;
    @Column(name = "plantxt")
    private String planTxt;
    @Column(name = "observacionesmedico")
    private String observacionesMedico;
    @Column(name = "fechaatencion")
    private Date fechaAtencion;
    @Column(name = "horaatencion")
    private LocalDateTime horaAtencion;
    private String shockroom;
    @Column(name = "radiologiatomo")
    private String radiologiaTomo;
    @Column(name = "radiologiarx")
    private String radiologiaRx;
    @Column(name = "radiologiaeco")
    private String radiologiaEco;
    private String alerta;
    private String ecg;
    @Column(name = "inttransitoria")
    private String intTransitoria;
    @Column(name = "yesocorto")
    private String yesoCorto;
    @Column(name = "yesolargo")
    private String yesoLargo;
    @Column(name = "suturasimple")
    private String suturaSimple;
    @Column(name = "suturacompleja")
    private String suturaCompleja;
    @Column(name = "cuerpoextocu")
    private String cuerpoExtOcu;
    @Column(name = "phidratparen")
    private String  pHidratParen;
    private String respiratorio;

    public OtrProfPlanillaEmerPK getId() {
        return id;
    }

    public void setId(OtrProfPlanillaEmerPK id) {
        this.id = id;
    }

    public List<NomencladorEnfermedadesCie10> getNomencladorEnfermedadesCie10() {
        return nomencladorEnfermedadesCie10;
    }

    public void setNomencladorEnfermedadesCie10(List<NomencladorEnfermedadesCie10> nomencladorEnfermedadesCie10) {
        this.nomencladorEnfermedadesCie10 = nomencladorEnfermedadesCie10;
    }

    public String getPolicia() {
        return policia;
    }

    public void setPolicia(String policia) {
        this.policia = policia;
    }

    public String getDefuncion() {
        return defuncion;
    }

    public void setDefuncion(String defuncion) {
        this.defuncion = defuncion;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getCuracion() {
        return curacion;
    }

    public void setCuracion(String curacion) {
        this.curacion = curacion;
    }

    public String getSuturaOld() {
        return suturaOld;
    }

    public void setSuturaOld(String suturaOld) {
        this.suturaOld = suturaOld;
    }

    public String getQuemado() {
        return quemado;
    }

    public void setQuemado(String quemado) {
        this.quemado = quemado;
    }

    public String getInyeccion() {
        return inyeccion;
    }

    public void setInyeccion(String inyeccion) {
        this.inyeccion = inyeccion;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getNebulizacion() {
        return nebulizacion;
    }

    public void setNebulizacion(String nebulizacion) {
        this.nebulizacion = nebulizacion;
    }

    public String getYesoVendaOld() {
        return yesoVendaOld;
    }

    public void setYesoVendaOld(String yesoVendaOld) {
        this.yesoVendaOld = yesoVendaOld;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getRadiologia() {
        return radiologia;
    }

    public void setRadiologia(String radiologia) {
        this.radiologia = radiologia;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getMedicamentosTxtOld() {
        return medicamentosTxtOld;
    }

    public void setMedicamentosTxtOld(String medicamentosTxtOld) {
        this.medicamentosTxtOld = medicamentosTxtOld;
    }

    public String getRadiologiaTxtOld() {
        return radiologiaTxtOld;
    }

    public void setRadiologiaTxtOld(String radiologiaTxtOld) {
        this.radiologiaTxtOld = radiologiaTxtOld;
    }

    public String getLaboratorioTxtOld() {
        return laboratorioTxtOld;
    }

    public void setLaboratorioTxtOld(String laboratorioTxtOld) {
        this.laboratorioTxtOld = laboratorioTxtOld;
    }

    public String getEnfermeriatxtOld() {
        return enfermeriatxtOld;
    }

    public void setEnfermeriatxtOld(String enfermeriatxtOld) {
        this.enfermeriatxtOld = enfermeriatxtOld;
    }

    public String getPlanTxt() {
        return planTxt;
    }

    public void setPlanTxt(String planTxt) {
        this.planTxt = planTxt;
    }

    public String getObservacionesMedico() {
        return observacionesMedico;
    }

    public void setObservacionesMedico(String observacionesMedico) {
        this.observacionesMedico = observacionesMedico;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public LocalDateTime getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(LocalDateTime horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getShockroom() {
        return shockroom;
    }

    public void setShockroom(String shockroom) {
        this.shockroom = shockroom;
    }

    public String getRadiologiaTomo() {
        return radiologiaTomo;
    }

    public void setRadiologiaTomo(String radiologiaTomo) {
        this.radiologiaTomo = radiologiaTomo;
    }

    public String getRadiologiaRx() {
        return radiologiaRx;
    }

    public void setRadiologiaRx(String radiologiaRx) {
        this.radiologiaRx = radiologiaRx;
    }

    public String getRadiologiaEco() {
        return radiologiaEco;
    }

    public void setRadiologiaEco(String radiologiaEco) {
        this.radiologiaEco = radiologiaEco;
    }

    public String getAlerta() {
        return alerta;
    }

    public void setAlerta(String alerta) {
        this.alerta = alerta;
    }

    public String getEcg() {
        return ecg;
    }

    public void setEcg(String ecg) {
        this.ecg = ecg;
    }

    public String getIntTransitoria() {
        return intTransitoria;
    }

    public void setIntTransitoria(String intTransitoria) {
        this.intTransitoria = intTransitoria;
    }

    public String getYesoCorto() {
        return yesoCorto;
    }

    public void setYesoCorto(String yesoCorto) {
        this.yesoCorto = yesoCorto;
    }

    public String getYesoLargo() {
        return yesoLargo;
    }

    public void setYesoLargo(String yesoLargo) {
        this.yesoLargo = yesoLargo;
    }

    public String getSuturaSimple() {
        return suturaSimple;
    }

    public void setSuturaSimple(String suturaSimple) {
        this.suturaSimple = suturaSimple;
    }

    public String getSuturaCompleja() {
        return suturaCompleja;
    }

    public void setSuturaCompleja(String suturaCompleja) {
        this.suturaCompleja = suturaCompleja;
    }

    public String getCuerpoExtOcu() {
        return cuerpoExtOcu;
    }

    public void setCuerpoExtOcu(String cuerpoExtOcu) {
        this.cuerpoExtOcu = cuerpoExtOcu;
    }

    public String getpHidratParen() {
        return pHidratParen;
    }

    public void setpHidratParen(String pHidratParen) {
        this.pHidratParen = pHidratParen;
    }

    public String getRespiratorio() {
        return respiratorio;
    }

    public void setRespiratorio(String respiratorio) {
        this.respiratorio = respiratorio;
    }
}
