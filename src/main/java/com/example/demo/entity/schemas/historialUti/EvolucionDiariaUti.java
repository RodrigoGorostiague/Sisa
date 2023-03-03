package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "evoluciondiaria", schema = "historialuti")
public class EvolucionDiariaUti {
    @EmbeddedId
    private EvolucionDiariaUtiPK id;
    @Column(name = "tasistolica")
    private Integer taSistolica;
    @Column(name = "tadiastolica")
    private Integer taDiastolica;
    @Column(name = "tempaxilar")
    private Integer tempAxilar;
    @Column(name = "freccardiaca")
    private Integer frecCardiaca;
    @Column(name = "frecrespiratoria")
    private Integer frecRespiratoria;
    private Integer diuresis;
    @Column(name = "gassgre_spo2")
    private Integer gassgreSpo2;
    @Column(name = "valorpvc")
    private Integer valorPvc;
    @Column(name = "carevolclisem")
    private String  carEvolCliSem;
    @Column(name = "carcambiosecgmon")
    private String carCambiosEcgMon;
    @Column(name = "resparm")
    private String resParm;
    @Column(name = "respmodo")
    private  String respModo;
    @Column(name = "respvt")
    private Integer resPvt;
    private Integer peep;
    private Integer pafi;
    @Column(name = "respevolclisem")
    private String  respEvolCliSem;
    @Column(name = "armpplateau")
    private Integer armPresPlateau;
    @Column(name = "armppico")
    private Integer armPresPico;
    @Column(name = "abdevolclisem")
    private String abdEvolCliSem;
    @Column(name = "viaperfusion")
    private String viaPerfusion;
    @Column(name = "ingparenteral")
    private Integer ingParenteral;
    @Column(name = "ingenteral")
    private Integer ingEnteral;
    @Column(name = "equilhidro")
    private String equilHidro;
    private Integer egresos;
    @Column(name = "alterelectro")
    private String alterElectro;
    @Column(name = "funcionrenal")
    private String funcionRenal;
    private String drenajes;
    private String sondang;
    @Column(name = "otrorgsist")
    private String otrOrgSist;
    @Column(name = "cultivosangre")
    private String cultivoSangre;
    @Column(name = "cultivoorina")
    private String cultivoOrina;
    @Column(name = "cultivocateter")
    private String cultivoCateter;
    @Column(name = "cultivootros")
    private String cultivoOtros;
    @Column(name = "glasocular")
    private Integer glasOcular;
    @Column(name = "glasmotor")
    private Integer glasMotor;
    @Column(name = "glasverbal")
    private Integer glasVerbal;
    private String comentarios;
    private Integer coagulacion;
    private Integer bilirrubina;
    private String hipotension;
    private Integer creatinina;
    @Column(name = "scoreSofa")
    private Integer scoreSofa;
    private String balance;
    @Column(name = "escalarass")
    private Integer escalaRass;
    @Column(name = "glasgowsofa")
    private Integer glasgowSofa;

    public EvolucionDiariaUtiPK getId() {
        return id;
    }

    public void setId(EvolucionDiariaUtiPK id) {
        this.id = id;
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

    public Integer getTempAxilar() {
        return tempAxilar;
    }

    public void setTempAxilar(Integer tempAxilar) {
        this.tempAxilar = tempAxilar;
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

    public Integer getDiuresis() {
        return diuresis;
    }

    public void setDiuresis(Integer diuresis) {
        this.diuresis = diuresis;
    }

    public Integer getGassgreSpo2() {
        return gassgreSpo2;
    }

    public void setGassgreSpo2(Integer gassgreSpo2) {
        this.gassgreSpo2 = gassgreSpo2;
    }

    public Integer getValorPvc() {
        return valorPvc;
    }

    public void setValorPvc(Integer valorPvc) {
        this.valorPvc = valorPvc;
    }

    public String getCarEvolCliSem() {
        return carEvolCliSem;
    }

    public void setCarEvolCliSem(String carEvolCliSem) {
        this.carEvolCliSem = carEvolCliSem;
    }

    public String getCarCambiosEcgMon() {
        return carCambiosEcgMon;
    }

    public void setCarCambiosEcgMon(String carCambiosEcgMon) {
        this.carCambiosEcgMon = carCambiosEcgMon;
    }

    public String getResParm() {
        return resParm;
    }

    public void setResParm(String resParm) {
        this.resParm = resParm;
    }

    public String getRespModo() {
        return respModo;
    }

    public void setRespModo(String respModo) {
        this.respModo = respModo;
    }

    public Integer getResPvt() {
        return resPvt;
    }

    public void setResPvt(Integer resPvt) {
        this.resPvt = resPvt;
    }

    public Integer getPeep() {
        return peep;
    }

    public void setPeep(Integer peep) {
        this.peep = peep;
    }

    public Integer getPafi() {
        return pafi;
    }

    public void setPafi(Integer pafi) {
        this.pafi = pafi;
    }

    public String getRespEvolCliSem() {
        return respEvolCliSem;
    }

    public void setRespEvolCliSem(String respEvolCliSem) {
        this.respEvolCliSem = respEvolCliSem;
    }

    public Integer getArmPresPlateau() {
        return armPresPlateau;
    }

    public void setArmPresPlateau(Integer armPresPlateau) {
        this.armPresPlateau = armPresPlateau;
    }

    public Integer getArmPresPico() {
        return armPresPico;
    }

    public void setArmPresPico(Integer armPresPico) {
        this.armPresPico = armPresPico;
    }

    public String getAbdEvolCliSem() {
        return abdEvolCliSem;
    }

    public void setAbdEvolCliSem(String abdEvolCliSem) {
        this.abdEvolCliSem = abdEvolCliSem;
    }

    public String getViaPerfusion() {
        return viaPerfusion;
    }

    public void setViaPerfusion(String viaPerfusion) {
        this.viaPerfusion = viaPerfusion;
    }

    public Integer getIngParenteral() {
        return ingParenteral;
    }

    public void setIngParenteral(Integer ingParenteral) {
        this.ingParenteral = ingParenteral;
    }

    public Integer getIngEnteral() {
        return ingEnteral;
    }

    public void setIngEnteral(Integer ingEnteral) {
        this.ingEnteral = ingEnteral;
    }

    public String getEquilHidro() {
        return equilHidro;
    }

    public void setEquilHidro(String equilHidro) {
        this.equilHidro = equilHidro;
    }

    public Integer getEgresos() {
        return egresos;
    }

    public void setEgresos(Integer egresos) {
        this.egresos = egresos;
    }

    public String getAlterElectro() {
        return alterElectro;
    }

    public void setAlterElectro(String alterElectro) {
        this.alterElectro = alterElectro;
    }

    public String getFuncionRenal() {
        return funcionRenal;
    }

    public void setFuncionRenal(String funcionRenal) {
        this.funcionRenal = funcionRenal;
    }

    public String getDrenajes() {
        return drenajes;
    }

    public void setDrenajes(String drenajes) {
        this.drenajes = drenajes;
    }

    public String getSondang() {
        return sondang;
    }

    public void setSondang(String sondang) {
        this.sondang = sondang;
    }

    public String getOtrOrgSist() {
        return otrOrgSist;
    }

    public void setOtrOrgSist(String otrOrgSist) {
        this.otrOrgSist = otrOrgSist;
    }

    public String getCultivoSangre() {
        return cultivoSangre;
    }

    public void setCultivoSangre(String cultivoSangre) {
        this.cultivoSangre = cultivoSangre;
    }

    public String getCultivoOrina() {
        return cultivoOrina;
    }

    public void setCultivoOrina(String cultivoOrina) {
        this.cultivoOrina = cultivoOrina;
    }

    public String getCultivoCateter() {
        return cultivoCateter;
    }

    public void setCultivoCateter(String cultivoCateter) {
        this.cultivoCateter = cultivoCateter;
    }

    public String getCultivoOtros() {
        return cultivoOtros;
    }

    public void setCultivoOtros(String cultivoOtros) {
        this.cultivoOtros = cultivoOtros;
    }

    public Integer getGlasOcular() {
        return glasOcular;
    }

    public void setGlasOcular(Integer glasOcular) {
        this.glasOcular = glasOcular;
    }

    public Integer getGlasMotor() {
        return glasMotor;
    }

    public void setGlasMotor(Integer glasMotor) {
        this.glasMotor = glasMotor;
    }

    public Integer getGlasVerbal() {
        return glasVerbal;
    }

    public void setGlasVerbal(Integer glasVerbal) {
        this.glasVerbal = glasVerbal;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Integer getCoagulacion() {
        return coagulacion;
    }

    public void setCoagulacion(Integer coagulacion) {
        this.coagulacion = coagulacion;
    }

    public Integer getBilirrubina() {
        return bilirrubina;
    }

    public void setBilirrubina(Integer bilirrubina) {
        this.bilirrubina = bilirrubina;
    }

    public String getHipotension() {
        return hipotension;
    }

    public void setHipotension(String hipotension) {
        this.hipotension = hipotension;
    }

    public Integer getCreatinina() {
        return creatinina;
    }

    public void setCreatinina(Integer creatinina) {
        this.creatinina = creatinina;
    }

    public Integer getScoreSofa() {
        return scoreSofa;
    }

    public void setScoreSofa(Integer scoreSofa) {
        this.scoreSofa = scoreSofa;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Integer getEscalaRass() {
        return escalaRass;
    }

    public void setEscalaRass(Integer escalaRass) {
        this.escalaRass = escalaRass;
    }

    public Integer getGlasgowSofa() {
        return glasgowSofa;
    }

    public void setGlasgowSofa(Integer glasgowSofa) {
        this.glasgowSofa = glasgowSofa;
    }
}
