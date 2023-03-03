package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(schema = "historialambesp", name = "planilla_qualidiab")
public class PlanillaQualiDiab {
    @Id
    @Column(name = "nroconsulta")
    private Integer nroConsulta;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "fecha_registro")
    private Date fechaRegistro;
    private String sexo;
    private String documento;
    @Column(name = "fecha_nac")
    private Date fechaNac;
    @Column(name = "inicial_apellido")
    private String inicialApellido;
    @Column(name = "inicial_nombre")
    private String inicialNombre;
    private String nacionalidad;
    @Column(name = "edad_al_diagnostico")
    private Integer edadAlDiagnostico;
    private String cobertura;
    private String medico;
    @Column(name = "sintomas_descripcion")
    private String sintomasDescripcion;
    private String iam;
    private String ic;
    private String hvi;
    private String stent;
    private String crm;
    private String claudMi;
    private String revascularizacion;
    private String amputacion;
    @Column(name = "hipotension_ort")
    private String hipotensionOrt;
    private String acv;
    private String ait;
    @Column(name = "retinopatia_np")
    private String retinopatiaNp;
    @Column(name = "retinopatia_p")
    private String retinopatiaP;
    private String ceguera;
    @Column(name = "neuropatia_per")
    private String neuropatiaPer;
    private String disfuncion_er;
    private String nefropatia;
    @Column(name = "dialisis_transplante")
    private String dialisisTransplante;
    private Integer tas;
    private Integer tad;
    private Integer peso;
    private Integer cintura;
    @Column(name = "glucemia_valor")
    private Integer glucemiaValor;
    @Column(name = "glucemia_veces")
    private Integer glucemiaVeces;
    @Column(name = "hba1c_valor")
    private Integer hba1cValor;
    @Column(name = "hba1c_veces")
    private Integer hba1cVeces;
    @Column(name = "colesteroltotal_valor")
    private Integer colesterolTotalValor;
    @Column(name = "colesteroltotal_veces")
    private Integer colesterolTotalVeces;
    @Column(name = "colesterolhdl_valor")
    private Integer colesteroLhdlValor;
    @Column(name = "colesterolhdl_veces")
    private Integer colesteroLhdlVeces;
    @Column(name = "colesterolldl_valor")
    private Integer colesterolLdlValor;
    @Column(name = "colesterolldl_veces")
    private Integer colesterolLdlVeces;
    @Column(name = "trigliceridos_valor")
    private Integer trigliceridosValor;
    @Column(name = "trigliceridos_veces")
    private Integer trigliceridosVeces;
    @Column(name = "creatinina_valor")
    private Integer creatininaValor;
    @Column(name = "creatinina_veces")
    private Integer creatininaVeces;
    @Column(name = "proteinuria_valor")
    private Integer proteinuriaValor;
    @Column(name = "proteinuria_veces")
    private Integer proteinuriaVeces;
    @Column(name = "urocultivo_valor")
    private Integer urocultivoValor;
    @Column(name = "urocultivo_veces")
    private Integer urocultivoVeces;
    private Integer microalbuminuria;
    @Column(name = "microalbuminuria_mgcreat")
    private String microalbuminuriaMgCreat;
    @Column(name = "microalbuminuria_mg24h")
    private String microalbuminuriaMg24h;
    @Column(name = "microalbuminuria_microgmin")
    private String microalbuminuriaMicrogMin;
    @Column(name = "examen_pies")
    private String examenPies;
    @Column(name = "examen_pies_veces")
    private Integer examenPiesVeces;
    @Column(name = "examen_ojos")
    private String examenOjos;
    private String electrocardiograma;
    @Column(name = "plan_alimentacion")
    private String planAlimentacion;
    @Column(name = "actividad_fisica")
    private String actividadFisica;
    @Column(name = "metas_tratamiento")
    private String metasTratamiento;
    @Column(name = "automon_glucemico")
    private String autoMonGlucemico;
    @Column(name = "automon_glucemico_veces")
    private Integer autoMonGlucemicoVeces;
    @Column(name = "identifica_hipoglucemias")
    private String identificaHipoglucemias;
    @Column(name = "cuidado_pies")
    private String cuidadoPies;
    @Column(name = "fuma_actualmente")
    private String fumaActualmente;
    @Column(name = "fumo_anteriormente")
    private String fumoAnteriormente;
    @Column(name = "cigarrillos_dia")
    private Integer cigarrillosDia;
    @Column(name = "sustituto_nicotina")
    private String sustitutoNicotina;
    private String bupropion;
    @Column(name = "fuma_otro")
    private String fumaOtro;
    @Column(name = "fuma_cual")
    private String fumaCual;
    @Column(name = "hipoglucemias_severas_cant")
    private Integer hipoglucemiasSeverasCant;
    @Column(name = "cetoacidosis_comas_cant")
    private Integer cetoacidosisComasCant;
    @Column(name = "coma_hiperosmolares_cant")
    private Integer comaHiperosmolaresCant;
    @Column(name = "causa_hospitalizacion_1")
    private String causaHospitalizacion1;
    @Column(name = "causa_hospitalizacion_1dias")
    private Integer causaHospitalizacion1Dias;
    @Column(name = "causa_hospitalizacion_2")
    private String causaHospitalizacion2;
    @Column(name = "causa_hospitalizacion_2dias")
    private Integer causaHospitalizacion2Dias;
    @Column(name = "causa_hospitalizacion_3")
    private String causaHospitalizacion3;
    @Column(name = "causa_hospitalizacion_3dias")
    private Integer causaHospitalizacion3Dias;
    @Column(name = "ausentismo_laboral")
    private Integer ausentismoLaboral;
    private Integer aas;
    private Integer ieca;
    private Integer atenolol;
    @Column(name = "bloqueantes_calcicos")
    private Integer bloqueantesCalcicos;
    private Integer furosemida;
    private Integer hidroclorotiazida;
    private Integer arb;
    @Column(name = "hipertension_otro")
    private Integer hipertensionOtro;
    @Column(name = "hipertension_cual")
    private String  hipertensionCual;
    private Integer sulfonilureas;
    private Integer metformina;
    private Integer  glitazonas;
    @Column(name = "idpp_4")
    private Integer idpp4;
    @Column(name = "arglp_1")
    private Integer arglp1;
    @Column(name = "diabetes_otro")
    private Integer diabetesOtro;
    @Column(name = "diabetes_cual")
    private String diabetesCual;
    private Integer estatinas;
    private Integer fibratos;
    private Integer ezetimibe;
    @Column(name = "dislipemia_otras")
    private Integer dislipemiaOtras;
    @Column(name = "insulina_nph")
    private Integer insulinaNph;
    @Column(name = "insulina_corriente")
    private Integer insulinaCorriente;
    @Column(name = "analogos_lento")
    private Integer analogosLento;
    @Column(name = "analogos_rapido")
    private Integer analogosRapido;
    @Column(name = "cant_inyecciones")
    private String cantInyecciones;
    @Column(name = "diag_dmt1")
    private String diagDmt1;
    @Column(name = "diag_dmt2")
    private String diagDmt2;
    @Column(name = "diag_dg")
    private String diagDg;
    @Column(name = "diag_tga")
    private String diagTga;
    @Column(name = "diag_gaa")
    private String diagGaa;
    @Column(name = "diag_hipertension")
    private String  diagHipertension;
    @Column(name = "diag_dislipemia")
    private String diagDislipemia;
    @Column(name = "diag_obesidad")
    private String diagObesidad;
    @Column(name = "diag_tabaquismo")
    private String diagTabaquismo;
    @Column(name = "sint_angor")
    private String sintAngor;
    @Column(name = "sint_poliuria")
    private String sintPoliuria;
    @Column(name = "sint_disuria")
    private String sintDisuria;
    @Column(name = "sint_polaquiuria")
    private String sintPolaquiuria;
    private String sintDisnea;
    @Column(name = "sint_ci")
    private String sintCi;
    @Column(name = "sint_otros")
    private String sintOtros;
    private Integer talla;
    private Integer cuello;

    public Integer getNroConsulta() {
        return nroConsulta;
    }

    public void setNroConsulta(Integer nroConsulta) {
        this.nroConsulta = nroConsulta;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getInicialApellido() {
        return inicialApellido;
    }

    public void setInicialApellido(String inicialApellido) {
        this.inicialApellido = inicialApellido;
    }

    public String getInicialNombre() {
        return inicialNombre;
    }

    public void setInicialNombre(String inicialNombre) {
        this.inicialNombre = inicialNombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getEdadAlDiagnostico() {
        return edadAlDiagnostico;
    }

    public void setEdadAlDiagnostico(Integer edadAlDiagnostico) {
        this.edadAlDiagnostico = edadAlDiagnostico;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getSintomasDescripcion() {
        return sintomasDescripcion;
    }

    public void setSintomasDescripcion(String sintomasDescripcion) {
        this.sintomasDescripcion = sintomasDescripcion;
    }

    public String getIam() {
        return iam;
    }

    public void setIam(String iam) {
        this.iam = iam;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getHvi() {
        return hvi;
    }

    public void setHvi(String hvi) {
        this.hvi = hvi;
    }

    public String getStent() {
        return stent;
    }

    public void setStent(String stent) {
        this.stent = stent;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getClaudMi() {
        return claudMi;
    }

    public void setClaudMi(String claudMi) {
        this.claudMi = claudMi;
    }

    public String getRevascularizacion() {
        return revascularizacion;
    }

    public void setRevascularizacion(String revascularizacion) {
        this.revascularizacion = revascularizacion;
    }

    public String getAmputacion() {
        return amputacion;
    }

    public void setAmputacion(String amputacion) {
        this.amputacion = amputacion;
    }

    public String getHipotensionOrt() {
        return hipotensionOrt;
    }

    public void setHipotensionOrt(String hipotensionOrt) {
        this.hipotensionOrt = hipotensionOrt;
    }

    public String getAcv() {
        return acv;
    }

    public void setAcv(String acv) {
        this.acv = acv;
    }

    public String getAit() {
        return ait;
    }

    public void setAit(String ait) {
        this.ait = ait;
    }

    public String getRetinopatiaNp() {
        return retinopatiaNp;
    }

    public void setRetinopatiaNp(String retinopatiaNp) {
        this.retinopatiaNp = retinopatiaNp;
    }

    public String getRetinopatiaP() {
        return retinopatiaP;
    }

    public void setRetinopatiaP(String retinopatiaP) {
        this.retinopatiaP = retinopatiaP;
    }

    public String getCeguera() {
        return ceguera;
    }

    public void setCeguera(String ceguera) {
        this.ceguera = ceguera;
    }

    public String getNeuropatiaPer() {
        return neuropatiaPer;
    }

    public void setNeuropatiaPer(String neuropatiaPer) {
        this.neuropatiaPer = neuropatiaPer;
    }

    public String getDisfuncion_er() {
        return disfuncion_er;
    }

    public void setDisfuncion_er(String disfuncion_er) {
        this.disfuncion_er = disfuncion_er;
    }

    public String getNefropatia() {
        return nefropatia;
    }

    public void setNefropatia(String nefropatia) {
        this.nefropatia = nefropatia;
    }

    public String getDialisisTransplante() {
        return dialisisTransplante;
    }

    public void setDialisisTransplante(String dialisisTransplante) {
        this.dialisisTransplante = dialisisTransplante;
    }

    public Integer getTas() {
        return tas;
    }

    public void setTas(Integer tas) {
        this.tas = tas;
    }

    public Integer getTad() {
        return tad;
    }

    public void setTad(Integer tad) {
        this.tad = tad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getCintura() {
        return cintura;
    }

    public void setCintura(Integer cintura) {
        this.cintura = cintura;
    }

    public Integer getGlucemiaValor() {
        return glucemiaValor;
    }

    public void setGlucemiaValor(Integer glucemiaValor) {
        this.glucemiaValor = glucemiaValor;
    }

    public Integer getGlucemiaVeces() {
        return glucemiaVeces;
    }

    public void setGlucemiaVeces(Integer glucemiaVeces) {
        this.glucemiaVeces = glucemiaVeces;
    }

    public Integer getHba1cValor() {
        return hba1cValor;
    }

    public void setHba1cValor(Integer hba1cValor) {
        this.hba1cValor = hba1cValor;
    }

    public Integer getHba1cVeces() {
        return hba1cVeces;
    }

    public void setHba1cVeces(Integer hba1cVeces) {
        this.hba1cVeces = hba1cVeces;
    }

    public Integer getColesterolTotalValor() {
        return colesterolTotalValor;
    }

    public void setColesterolTotalValor(Integer colesterolTotalValor) {
        this.colesterolTotalValor = colesterolTotalValor;
    }

    public Integer getColesterolTotalVeces() {
        return colesterolTotalVeces;
    }

    public void setColesterolTotalVeces(Integer colesterolTotalVeces) {
        this.colesterolTotalVeces = colesterolTotalVeces;
    }

    public Integer getColesteroLhdlValor() {
        return colesteroLhdlValor;
    }

    public void setColesteroLhdlValor(Integer colesteroLhdlValor) {
        this.colesteroLhdlValor = colesteroLhdlValor;
    }

    public Integer getColesteroLhdlVeces() {
        return colesteroLhdlVeces;
    }

    public void setColesteroLhdlVeces(Integer colesteroLhdlVeces) {
        this.colesteroLhdlVeces = colesteroLhdlVeces;
    }

    public Integer getColesterolLdlValor() {
        return colesterolLdlValor;
    }

    public void setColesterolLdlValor(Integer colesterolLdlValor) {
        this.colesterolLdlValor = colesterolLdlValor;
    }

    public Integer getColesterolLdlVeces() {
        return colesterolLdlVeces;
    }

    public void setColesterolLdlVeces(Integer colesterolLdlVeces) {
        this.colesterolLdlVeces = colesterolLdlVeces;
    }

    public Integer getTrigliceridosValor() {
        return trigliceridosValor;
    }

    public void setTrigliceridosValor(Integer trigliceridosValor) {
        this.trigliceridosValor = trigliceridosValor;
    }

    public Integer getTrigliceridosVeces() {
        return trigliceridosVeces;
    }

    public void setTrigliceridosVeces(Integer trigliceridosVeces) {
        this.trigliceridosVeces = trigliceridosVeces;
    }

    public Integer getCreatininaValor() {
        return creatininaValor;
    }

    public void setCreatininaValor(Integer creatininaValor) {
        this.creatininaValor = creatininaValor;
    }

    public Integer getCreatininaVeces() {
        return creatininaVeces;
    }

    public void setCreatininaVeces(Integer creatininaVeces) {
        this.creatininaVeces = creatininaVeces;
    }

    public Integer getProteinuriaValor() {
        return proteinuriaValor;
    }

    public void setProteinuriaValor(Integer proteinuriaValor) {
        this.proteinuriaValor = proteinuriaValor;
    }

    public Integer getProteinuriaVeces() {
        return proteinuriaVeces;
    }

    public void setProteinuriaVeces(Integer proteinuriaVeces) {
        this.proteinuriaVeces = proteinuriaVeces;
    }

    public Integer getUrocultivoValor() {
        return urocultivoValor;
    }

    public void setUrocultivoValor(Integer urocultivoValor) {
        this.urocultivoValor = urocultivoValor;
    }

    public Integer getUrocultivoVeces() {
        return urocultivoVeces;
    }

    public void setUrocultivoVeces(Integer urocultivoVeces) {
        this.urocultivoVeces = urocultivoVeces;
    }

    public Integer getMicroalbuminuria() {
        return microalbuminuria;
    }

    public void setMicroalbuminuria(Integer microalbuminuria) {
        this.microalbuminuria = microalbuminuria;
    }

    public String getMicroalbuminuriaMgCreat() {
        return microalbuminuriaMgCreat;
    }

    public void setMicroalbuminuriaMgCreat(String microalbuminuriaMgCreat) {
        this.microalbuminuriaMgCreat = microalbuminuriaMgCreat;
    }

    public String getMicroalbuminuriaMg24h() {
        return microalbuminuriaMg24h;
    }

    public void setMicroalbuminuriaMg24h(String microalbuminuriaMg24h) {
        this.microalbuminuriaMg24h = microalbuminuriaMg24h;
    }

    public String getMicroalbuminuriaMicrogMin() {
        return microalbuminuriaMicrogMin;
    }

    public void setMicroalbuminuriaMicrogMin(String microalbuminuriaMicrogMin) {
        this.microalbuminuriaMicrogMin = microalbuminuriaMicrogMin;
    }

    public String getExamenPies() {
        return examenPies;
    }

    public void setExamenPies(String examenPies) {
        this.examenPies = examenPies;
    }

    public Integer getExamenPiesVeces() {
        return examenPiesVeces;
    }

    public void setExamenPiesVeces(Integer examenPiesVeces) {
        this.examenPiesVeces = examenPiesVeces;
    }

    public String getExamenOjos() {
        return examenOjos;
    }

    public void setExamenOjos(String examenOjos) {
        this.examenOjos = examenOjos;
    }

    public String getElectrocardiograma() {
        return electrocardiograma;
    }

    public void setElectrocardiograma(String electrocardiograma) {
        this.electrocardiograma = electrocardiograma;
    }

    public String getPlanAlimentacion() {
        return planAlimentacion;
    }

    public void setPlanAlimentacion(String planAlimentacion) {
        this.planAlimentacion = planAlimentacion;
    }

    public String getActividadFisica() {
        return actividadFisica;
    }

    public void setActividadFisica(String actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    public String getMetasTratamiento() {
        return metasTratamiento;
    }

    public void setMetasTratamiento(String metasTratamiento) {
        this.metasTratamiento = metasTratamiento;
    }

    public String getAutoMonGlucemico() {
        return autoMonGlucemico;
    }

    public void setAutoMonGlucemico(String autoMonGlucemico) {
        this.autoMonGlucemico = autoMonGlucemico;
    }

    public Integer getAutoMonGlucemicoVeces() {
        return autoMonGlucemicoVeces;
    }

    public void setAutoMonGlucemicoVeces(Integer autoMonGlucemicoVeces) {
        this.autoMonGlucemicoVeces = autoMonGlucemicoVeces;
    }

    public String getIdentificaHipoglucemias() {
        return identificaHipoglucemias;
    }

    public void setIdentificaHipoglucemias(String identificaHipoglucemias) {
        this.identificaHipoglucemias = identificaHipoglucemias;
    }

    public String getCuidadoPies() {
        return cuidadoPies;
    }

    public void setCuidadoPies(String cuidadoPies) {
        this.cuidadoPies = cuidadoPies;
    }

    public String getFumaActualmente() {
        return fumaActualmente;
    }

    public void setFumaActualmente(String fumaActualmente) {
        this.fumaActualmente = fumaActualmente;
    }

    public String getFumoAnteriormente() {
        return fumoAnteriormente;
    }

    public void setFumoAnteriormente(String fumoAnteriormente) {
        this.fumoAnteriormente = fumoAnteriormente;
    }

    public Integer getCigarrillosDia() {
        return cigarrillosDia;
    }

    public void setCigarrillosDia(Integer cigarrillosDia) {
        this.cigarrillosDia = cigarrillosDia;
    }

    public String getSustitutoNicotina() {
        return sustitutoNicotina;
    }

    public void setSustitutoNicotina(String sustitutoNicotina) {
        this.sustitutoNicotina = sustitutoNicotina;
    }

    public String getBupropion() {
        return bupropion;
    }

    public void setBupropion(String bupropion) {
        this.bupropion = bupropion;
    }

    public String getFumaOtro() {
        return fumaOtro;
    }

    public void setFumaOtro(String fumaOtro) {
        this.fumaOtro = fumaOtro;
    }

    public String getFumaCual() {
        return fumaCual;
    }

    public void setFumaCual(String fumaCual) {
        this.fumaCual = fumaCual;
    }

    public Integer getHipoglucemiasSeverasCant() {
        return hipoglucemiasSeverasCant;
    }

    public void setHipoglucemiasSeverasCant(Integer hipoglucemiasSeverasCant) {
        this.hipoglucemiasSeverasCant = hipoglucemiasSeverasCant;
    }

    public Integer getCetoacidosisComasCant() {
        return cetoacidosisComasCant;
    }

    public void setCetoacidosisComasCant(Integer cetoacidosisComasCant) {
        this.cetoacidosisComasCant = cetoacidosisComasCant;
    }

    public Integer getComaHiperosmolaresCant() {
        return comaHiperosmolaresCant;
    }

    public void setComaHiperosmolaresCant(Integer comaHiperosmolaresCant) {
        this.comaHiperosmolaresCant = comaHiperosmolaresCant;
    }

    public String getCausaHospitalizacion1() {
        return causaHospitalizacion1;
    }

    public void setCausaHospitalizacion1(String causaHospitalizacion1) {
        this.causaHospitalizacion1 = causaHospitalizacion1;
    }

    public Integer getCausaHospitalizacion1Dias() {
        return causaHospitalizacion1Dias;
    }

    public void setCausaHospitalizacion1Dias(Integer causaHospitalizacion1Dias) {
        this.causaHospitalizacion1Dias = causaHospitalizacion1Dias;
    }

    public String getCausaHospitalizacion2() {
        return causaHospitalizacion2;
    }

    public void setCausaHospitalizacion2(String causaHospitalizacion2) {
        this.causaHospitalizacion2 = causaHospitalizacion2;
    }

    public Integer getCausaHospitalizacion2Dias() {
        return causaHospitalizacion2Dias;
    }

    public void setCausaHospitalizacion2Dias(Integer causaHospitalizacion2Dias) {
        this.causaHospitalizacion2Dias = causaHospitalizacion2Dias;
    }

    public String getCausaHospitalizacion3() {
        return causaHospitalizacion3;
    }

    public void setCausaHospitalizacion3(String causaHospitalizacion3) {
        this.causaHospitalizacion3 = causaHospitalizacion3;
    }

    public Integer getCausaHospitalizacion3Dias() {
        return causaHospitalizacion3Dias;
    }

    public void setCausaHospitalizacion3Dias(Integer causaHospitalizacion3Dias) {
        this.causaHospitalizacion3Dias = causaHospitalizacion3Dias;
    }

    public Integer getAusentismoLaboral() {
        return ausentismoLaboral;
    }

    public void setAusentismoLaboral(Integer ausentismoLaboral) {
        this.ausentismoLaboral = ausentismoLaboral;
    }

    public Integer getAas() {
        return aas;
    }

    public void setAas(Integer aas) {
        this.aas = aas;
    }

    public Integer getIeca() {
        return ieca;
    }

    public void setIeca(Integer ieca) {
        this.ieca = ieca;
    }

    public Integer getAtenolol() {
        return atenolol;
    }

    public void setAtenolol(Integer atenolol) {
        this.atenolol = atenolol;
    }

    public Integer getBloqueantesCalcicos() {
        return bloqueantesCalcicos;
    }

    public void setBloqueantesCalcicos(Integer bloqueantesCalcicos) {
        this.bloqueantesCalcicos = bloqueantesCalcicos;
    }

    public Integer getFurosemida() {
        return furosemida;
    }

    public void setFurosemida(Integer furosemida) {
        this.furosemida = furosemida;
    }

    public Integer getHidroclorotiazida() {
        return hidroclorotiazida;
    }

    public void setHidroclorotiazida(Integer hidroclorotiazida) {
        this.hidroclorotiazida = hidroclorotiazida;
    }

    public Integer getArb() {
        return arb;
    }

    public void setArb(Integer arb) {
        this.arb = arb;
    }

    public Integer getHipertensionOtro() {
        return hipertensionOtro;
    }

    public void setHipertensionOtro(Integer hipertensionOtro) {
        this.hipertensionOtro = hipertensionOtro;
    }

    public String getHipertensionCual() {
        return hipertensionCual;
    }

    public void setHipertensionCual(String hipertensionCual) {
        this.hipertensionCual = hipertensionCual;
    }

    public Integer getSulfonilureas() {
        return sulfonilureas;
    }

    public void setSulfonilureas(Integer sulfonilureas) {
        this.sulfonilureas = sulfonilureas;
    }

    public Integer getMetformina() {
        return metformina;
    }

    public void setMetformina(Integer metformina) {
        this.metformina = metformina;
    }

    public Integer getGlitazonas() {
        return glitazonas;
    }

    public void setGlitazonas(Integer glitazonas) {
        this.glitazonas = glitazonas;
    }

    public Integer getIdpp4() {
        return idpp4;
    }

    public void setIdpp4(Integer idpp4) {
        this.idpp4 = idpp4;
    }

    public Integer getArglp1() {
        return arglp1;
    }

    public void setArglp1(Integer arglp1) {
        this.arglp1 = arglp1;
    }

    public Integer getDiabetesOtro() {
        return diabetesOtro;
    }

    public void setDiabetesOtro(Integer diabetesOtro) {
        this.diabetesOtro = diabetesOtro;
    }

    public String getDiabetesCual() {
        return diabetesCual;
    }

    public void setDiabetesCual(String diabetesCual) {
        this.diabetesCual = diabetesCual;
    }

    public Integer getEstatinas() {
        return estatinas;
    }

    public void setEstatinas(Integer estatinas) {
        this.estatinas = estatinas;
    }

    public Integer getFibratos() {
        return fibratos;
    }

    public void setFibratos(Integer fibratos) {
        this.fibratos = fibratos;
    }

    public Integer getEzetimibe() {
        return ezetimibe;
    }

    public void setEzetimibe(Integer ezetimibe) {
        this.ezetimibe = ezetimibe;
    }

    public Integer getDislipemiaOtras() {
        return dislipemiaOtras;
    }

    public void setDislipemiaOtras(Integer dislipemiaOtras) {
        this.dislipemiaOtras = dislipemiaOtras;
    }

    public Integer getInsulinaNph() {
        return insulinaNph;
    }

    public void setInsulinaNph(Integer insulinaNph) {
        this.insulinaNph = insulinaNph;
    }

    public Integer getInsulinaCorriente() {
        return insulinaCorriente;
    }

    public void setInsulinaCorriente(Integer insulinaCorriente) {
        this.insulinaCorriente = insulinaCorriente;
    }

    public Integer getAnalogosLento() {
        return analogosLento;
    }

    public void setAnalogosLento(Integer analogosLento) {
        this.analogosLento = analogosLento;
    }

    public Integer getAnalogosRapido() {
        return analogosRapido;
    }

    public void setAnalogosRapido(Integer analogosRapido) {
        this.analogosRapido = analogosRapido;
    }

    public String getCantInyecciones() {
        return cantInyecciones;
    }

    public void setCantInyecciones(String cantInyecciones) {
        this.cantInyecciones = cantInyecciones;
    }

    public String getDiagDmt1() {
        return diagDmt1;
    }

    public void setDiagDmt1(String diagDmt1) {
        this.diagDmt1 = diagDmt1;
    }

    public String getDiagDmt2() {
        return diagDmt2;
    }

    public void setDiagDmt2(String diagDmt2) {
        this.diagDmt2 = diagDmt2;
    }

    public String getDiagDg() {
        return diagDg;
    }

    public void setDiagDg(String diagDg) {
        this.diagDg = diagDg;
    }

    public String getDiagTga() {
        return diagTga;
    }

    public void setDiagTga(String diagTga) {
        this.diagTga = diagTga;
    }

    public String getDiagGaa() {
        return diagGaa;
    }

    public void setDiagGaa(String diagGaa) {
        this.diagGaa = diagGaa;
    }

    public String getDiagHipertension() {
        return diagHipertension;
    }

    public void setDiagHipertension(String diagHipertension) {
        this.diagHipertension = diagHipertension;
    }

    public String getDiagDislipemia() {
        return diagDislipemia;
    }

    public void setDiagDislipemia(String diagDislipemia) {
        this.diagDislipemia = diagDislipemia;
    }

    public String getDiagObesidad() {
        return diagObesidad;
    }

    public void setDiagObesidad(String diagObesidad) {
        this.diagObesidad = diagObesidad;
    }

    public String getDiagTabaquismo() {
        return diagTabaquismo;
    }

    public void setDiagTabaquismo(String diagTabaquismo) {
        this.diagTabaquismo = diagTabaquismo;
    }

    public String getSintAngor() {
        return sintAngor;
    }

    public void setSintAngor(String sintAngor) {
        this.sintAngor = sintAngor;
    }

    public String getSintPoliuria() {
        return sintPoliuria;
    }

    public void setSintPoliuria(String sintPoliuria) {
        this.sintPoliuria = sintPoliuria;
    }

    public String getSintDisuria() {
        return sintDisuria;
    }

    public void setSintDisuria(String sintDisuria) {
        this.sintDisuria = sintDisuria;
    }

    public String getSintPolaquiuria() {
        return sintPolaquiuria;
    }

    public void setSintPolaquiuria(String sintPolaquiuria) {
        this.sintPolaquiuria = sintPolaquiuria;
    }

    public String getSintDisnea() {
        return sintDisnea;
    }

    public void setSintDisnea(String sintDisnea) {
        this.sintDisnea = sintDisnea;
    }

    public String getSintCi() {
        return sintCi;
    }

    public void setSintCi(String sintCi) {
        this.sintCi = sintCi;
    }

    public String getSintOtros() {
        return sintOtros;
    }

    public void setSintOtros(String sintOtros) {
        this.sintOtros = sintOtros;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public Integer getCuello() {
        return cuello;
    }

    public void setCuello(Integer cuello) {
        this.cuello = cuello;
    }
}
