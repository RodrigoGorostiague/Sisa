package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "embarazo", schema = "sipa")
public class Embarazo {
    @EmbeddedId
    private EmbarazoPK id;
    private String apellido;
    private String nombre;
    private String direccion;
    private String localidad;
    private String telefono;
    @Column(name = "fechanac")
    private Date fechaNac;
    private Integer edad;
    private String men15may35n;
    private String etnia;
    private String alfabeta;
    private String estudios;
    private Integer estanios;
    @Column(name = "estcivil")
    private String estdoCivil;
    @Column(name = "vivesola")
    private String viveSola;
    @Column(name = "lugctrolprenat")
    private String lugarControlPrenat;
    @Column(name = "lugpartoabor")
    private String lugarPartoAbor;
    private Integer hc;
    @Column(name = "antfamtbc")
    private String antecedentesFamiliaresTbc;
    @Column(name = "antfamdbt")
    private String antecedentesFamiliaresDbt;
    @Column(name = "antfamhta")
    private String antecedentesFamiliaresHta;
    @Column(name = "antfamprec")
    private String antecedentesFamiliaresPrec;
    private String antecedentesFamiliaresEcl;
    @Column(name = "antfamotrcongrave")
    private String antecedentesFamiliaresOtrConGrave;
    @Column(name = "antpertbc")
    private String antPerTbc;
    @Column(name = "antperdbt")
    private String antPerDbt;
    @Column(name = "antperhta")
    private String antPerHta;
    @Column(name = "antperprec")
    private String antPerPrec;
    @Column(name = "antperecl")
    private String antPerEcl;
    @Column(name = "antoperotrcongrave")
    private String antoPerOtrConGrave;
    @Column(name = "antpercirgenurin")
    private String antPerCirGenUrin;
    @Column(name = "antperinfertilidad")
    private String antPerInfertilidad;
    @Column(name = "antpercardiopatia")
    private String antPerCardiopatia;
    @Column(name = "antpernefropatia")
    private String antPerNefropatia;
    @Column(name = "antperviolencia")
    private String antPerViolencia;
    @Column(name = "descantperotrcongrave")
    private String desCantPerOtrConGrave;
    @Column(name = "gestasprevias")
    private Integer gestasPrevias;
    private Integer abortos;
    private Integer vaginales;
    @Column(name = "nacidosvivos")
    private Integer nacidosVivos;
    private Integer viven;
    @Column(name = "tresesponconsec")
    private String tresEsponConsec;
    @Column(name = "antecpartos")
    private Integer antecPartos;
    @Column(name = "ultimoprevio")
    private String ultimoPrevio;
    @Column(name = "antgemelar")
    private String antGemelar;
    private Integer cesarea;
    @Column(name =  "nacmuertos")
    private Integer nacMuertos;
    @Column(name = "muertosprisem")
    private Integer muertosPriSem;
    @Column(name = "muertosdespprisem")
    private Integer muertosDespPriSem;
    @Column(name = "fechafinembanterior")
    private Date fechaFinEmbAnterior;
    @Column(name = "menosunanio")
    private String menosUnAnio;
    @Column(name = "embplaneado")
    private String embPlaneado;
    @Column(name = "fracasoanticon")
    private String fracasoAnticon;
    @Column(name = "gestactpesoanterior")
    private Integer gestActPesoAnterior;
    @Column(name = "gestacttalla")
    private Integer gestActTalla;
    private Date fpp;
    @Column(name = "egconffum")
    private String egConfFum;
    @Column(name = "egconfeco")
    private String egConfEco;
    @Column(name = "antirubeola")
    private String antiRubeola;
    @Column(name = "antitetanica")
    private String antiTetanica;
    @Column(name = "mesgestpridosisatt")
    private Integer mesGestPriDosisAtt;
    @Column(name = "mesgestsegdosisatt")
    private Integer mesGestSegDosisAtt;
    @Column(name = "exnormalodonto")
    private String exNormalOdonto;
    @Column(name = "exnormalmamas")
    private String exNormalMamas;
    @Column(name = "cervixinspvisual")
    private String cervixInspVisual;
    @Column(name = "cervixpap")
    private String cervixPap;
    @Column(name = "cervixcolp")
    private String cervixColp;
    @Column(name = "gruposang")
    private String grupoSang;
    @Column(name = "rhsang")
    private String rhSang;
    private String inmunizacion;
    @Column(name = "toxomenos20sem")
    private String toxoMenos20Sem;
    @Column(name = "toxomas20sem")
    private String toxoMas20Sem;
    @Column(name = "toxopriconsigm")
    private String toxoPriConsigm;
    @Column(name = "hbmenor20sem")
    private Integer hbMenor20Sem;
    @Column(name = "hbmenor20semmenor11")
    private String hbMenor20SemMenor11;
    @Column(name = "feindicado")
    private String feIndicado;
    @Column(name = "folatosindicado")
    private String folAtosIndicado;
    @Column(name = "hbmayor20sem")
    private Integer hbMayor20Sem;
    @Column(name = "hbmayor20semmenor11")
    private String hbMayor20SemMenor11;
    private String estreptococo;
    private String chagas;
    @Column(name = "paludismomalaria")
    private String paludismoMalaria;
    @Column(name = "bacteriuriamenor20sem")
    private String bacteriUriaMenor20Sem;
    @Column(name = "bacteriuriamayor20sem")
    private String bacteriUriaMayor20Sem;
    @Column(name = "glucemiamenor20sem")
    private Integer glucemiaMenor20Sem;
    @Column(name = "glucemiamayor20Sem")
    private Integer glucemiaMayor20sem;
    @Column(name = "preparto")
    private String preParto;
    @Column(name = "consejerialactancia")
    private String  consejeriaLactancia;
    @Column(name = "sifilisnotreparriba")
    private String sifilisNotrepArriba;
    @Column(name = "sifilisnotrepabajo")
    private String  sifilisNotrepaBajo;
    private String sifilisTratArriba;
    @Column(name = "partoaborto")
    private String partoAborto;
    @Column(name = "fechaingreso")
    private Date fechaIngreso;
    private String carnet;
    @Column(name = "consultasprenatales")
    private Integer consultasPrenatales;
    @Column(name = "hospenembarazo")
    private String hospEnEmbarazo;
    @Column(name = "hospenembarazodias")
    private Integer hospEnEmbarazoDias;
    @Column(name = "corticoidesantenat")
    private String corticoidesAnteNat;
    @Column(name = "corticoidesantenatseminicio")
    private Integer corticoidesAnteNatSemInicio;
    private String inicio;
    @Column(name = "rotmemanteparto")
    private String rotmemAnteParto;
    @Column(name = "rotmemantepartofecha")
    private Date rotmemAntePartoFecha;
    @Column(name = "rotmemantepartohora")
    private LocalDateTime rotmemAntePartoHora;
    @Column(name = "rotmemantepartomenor37sem")
    private String rotmemAntePartoMenor37Sem;
    @Column(name = "rotmemantepartomayor18hs")
    private String rotmemAntePartoMayor18Hs;
    @Column(name = "rotmemantepartomayor38grados")
    private String rotmemAntePartoMayor38Grados;
    @Column(name = "rotmemantepartotemp")
    private Integer rotmemAntePartoTemp;
    @Column(name = "edadgestalpartosem")
    private Integer edadGestalPartoSem;
    @Column(name = "edadgestalpartodias")
    private Integer edadGestalPartoDias;
    @Column(name = "edadgestalpartofum")
    private String edadGestalPartoFum;
    @Column(name = "edadgestalpartoeco")
    private String edadGestalPartoEco;
    @Column(name = "presensituacion")
    private String presenSituacion;
    @Column(name = "tamfetalacorde")
    private String tamFetalAcorde;
    @Column(name = "acompaniantetdp")
    private String acompaniantEtdp;
    @Column(name = "acompaniantep")
    private String acompaniantEp;
    @Column(name = "trabpartodetalle")
    private String trabPartodeTalle;
    private String enfermedades;
    @Column(name = "htaprevia")
    private String htaPrevia;
    @Column(name = "htainducembarazo")
    private String htaInducEmbarazo;
    @Column(name = "preeclampsia")
    private String preEclampsia;
    private String eclampsia;
    private String cardiopatia;
    private String nefropatia;
    private String diabetes;
    @Column(name = "infecovular")
    private String infecOvular;
    @Column(name = "infecurinaria")
    private String infecUrinaria;
    @Column(name = "amenazapartopret")
    private String amenazaPartoPret;
    private String rciu;
    @Column(name = "rotpremmembranas")
    private String rotpremMembranas;
    private String anemia;
    @Column(name = "otracondgrave")
    private String otraCondGrave;
    private String hemo1trim;
    private String hemo2trim;
    private String hemo3trim;
    @Column(name = "hemopostparto")
    private String hemopostParto;
    @Column(name = "hemoinfecpuerperal")
    private String hemoInfecPuerperal;
    @Column(name = "codigoenf1")
    private Integer codigoEnf1;
    @Column(name = "codigoenf2")
    private Integer codigoEnf2;
    @Column(name = "codigoenf3")
    private Integer codigoEnf3;
    private String notas;
    private String nacimiento;
    @Column(name = "horanacimiento")
    private LocalDateTime horaNacmiento;
    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;
    @Column(name = "nacmultiple")
    private String nacMultiple;
    @Column(name = "nacterminacion")
    private String nacTerminacion;
    @Column(name = "induccpartooperatorio")
    private String induccPartoOperatorio;
    @Column(name = "codigoinduc")
    private Integer codigoInduc;
    @Column(name = "codigooper")
    private Integer codigoOper;
    @Column(name = "posicionparto")
    private String posicionParto;
    private String episiotomia;
    private String  desgarros;
    private Integer desgarrosGrado;
    @Column(name = "ocitocicosprealumbr")
    private String ocitocicosPreAlumbr;
    @Column(name = "ocitocicospostalumbr")
    private String ocitocicosPostAlumbr;
    @Column(name = "placentacompleta")
    private String placentaCompleta;
    @Column(name = "placentaretenida")
    private String placentaRetenida;
    @Column(name = "ligcordonprecoz")
    private String ligCordonPrecoz;
    @Column(name = "medrecibidaocitocicos")
    private String medRecibidaOcitocicos;
    @Column(name = "medrecibidaantibioticos")
    private String medRecibidaAtibioticos;
    @Column(name = "medrecibidaanalgesia")
    private String medRecibidaAnalgesia;
    @Column(name = "medrecibidaanestlocal")
    private String medRecibidaAnestLocal;
    @Column(name = "medrecibidaanestregion")
    private String medRecibidaAnestRegion;
    @Column(name = "medrecibidaanestgral")
    private String  medRecibidaAnestGral;
    @Column(name = "medrecibidatransfusion")
    private String medRecibidaTransfusion;
    @Column(name = "medrecibidaotros")
    private String medRecibidaotros;
    @Column(name = "medrecibidacodmed1")
    private Integer medRecibidaCodMed1;
    @Column(name = "medrecibidacodmed2")
    private String medrecibidaCodMed2;
    @Column(name = "atendioparto")
    private String atendioParto;
    @Column(name = "atendiopartonombre")
    private String atendioPartoNombre;
    @Column(name = "atendioneonato")
    private  String atendioNeonato;
    @Column(name = "atendioneonatonombre")
    private String atendioNeonatoNombre;
    private String antiRubeolaPostParto;
    private Date egresomaternofecha;
    @Column(name = "egresomaternotraslado")
    private String egresoMaternoTraslado;
    @Column(name = "egresomaternolugar")
    private String egresoMaternoLugar;
    @Column(name = "egresomaterno")
    private String egresoMaterno;
    @Column(name = "egresomaternofallece")
    private String egresoMaternoFallece;
    @Column(name = " egresomaternocantdias")
    private Integer egresoMaternoCantDias;
    @Column(name = "anticonconsejeria")
    private String antiConConsejeria;
    private String anticonmetodoelegido;
    @Column(name = "egresomaternoresponsable")
    private String egresoMaternoResponsable;
    private String gamaglobulina;
    @Column(name = "gamaglobulinapostparto")
    private String gamaglobulinaPostParto;
    @Column(name = "sifilisnotrepmenor20")
    private Integer sifilisNoTrepMenor20;
    @Column(name = "sifilisnotrepmayor20")
    private Integer sifilisNoTrepMayor20;
    @Column(name = "sifilistrepmenor20")
    private Integer sifilisTrepMenor20;
    @Column(name = "sifilistrepmayor20")
    private Integer sifilisTrepMayor20;
    @Column(name = "sifilistratmenor20")
    private Integer sifilisTratMenor20;
    @Column(name = "sifilistratmayor20")
    private Integer sifilisTratMayor20;
    @Column(name = "sifilistreparriba")
    private String sifilisTrepArriba;
    @Column(name = "sifilistrepabajo")
    private String sifilisTrepaBajo;
    @Column(name = "sifilistratabajo")
    private String sifilisTrataBajo;
    @Column(name = "embarazoectopico")
    private Integer embarazoEctopico;
    @Column(name = "ttoparejamenor20sem")
    private String ttoParejaMenor20Sem;
    @Column(name = "ttoparejamayor20sem")
    private String ttoParejaMayor20Sem;
    @Column(name = "glucemiamenor20semmayor105")
    private String glucemiaMenor20SemMayor105;
    @Column(name = "glucemiamayor20semmayor105")
    private String glucemiaMayor20SemMayor105;
    private Date fum;
    @Column(name = "antpervihmas")
    private String antPerVihMas;
    @Column(name = "vihdiagtratsolicmenor20sem")
    private String vihDiagTratSolicMenor20Sem;
    @Column(name = "vihdiagtratsolicmayorigual20sem")
    private String vihDiagTratSolicMayorIgual20Sem;
    @Column(name = "vihdiagtratpruebmenor20sem")
    private String vihDiagTratPruebMenor20Sem;
    @Column(name = "vihdiagtratpruebmayorigual20sem")
    private String vihDiagTratPruebMayorIgual20Sem;
    private String vihDiagTratTarvMenor20Sem;
    @Column(name = "vihdiagtrattarvmayorigual20sem")
    private String vihDiagTratTarvMayorIgual20Sem;
    @Column(name = "tdppruebasifilis")
    private String tdpPruebaSifilis;
    @Column(name = "tdppruebavih")
    private String tdpPruebaVih;
    @Column(name = "tdppruebatarv")
    private String tdpPruebaTarv;
    @Column(name = "partootroestablecimiento")
    private String partoOtroEstablecimiento;

    public EmbarazoPK getId() {
        return id;
    }

    public void setId(EmbarazoPK id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getMen15may35n() {
        return men15may35n;
    }

    public void setMen15may35n(String men15may35n) {
        this.men15may35n = men15may35n;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getAlfabeta() {
        return alfabeta;
    }

    public void setAlfabeta(String alfabeta) {
        this.alfabeta = alfabeta;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public Integer getEstanios() {
        return estanios;
    }

    public void setEstanios(Integer estanios) {
        this.estanios = estanios;
    }

    public String getEstdoCivil() {
        return estdoCivil;
    }

    public void setEstdoCivil(String estdoCivil) {
        this.estdoCivil = estdoCivil;
    }

    public String getViveSola() {
        return viveSola;
    }

    public void setViveSola(String viveSola) {
        this.viveSola = viveSola;
    }

    public String getLugarControlPrenat() {
        return lugarControlPrenat;
    }

    public void setLugarControlPrenat(String lugarControlPrenat) {
        this.lugarControlPrenat = lugarControlPrenat;
    }

    public String getLugarPartoAbor() {
        return lugarPartoAbor;
    }

    public void setLugarPartoAbor(String lugarPartoAbor) {
        this.lugarPartoAbor = lugarPartoAbor;
    }

    public Integer getHc() {
        return hc;
    }

    public void setHc(Integer hc) {
        this.hc = hc;
    }

    public String getAntecedentesFamiliaresTbc() {
        return antecedentesFamiliaresTbc;
    }

    public void setAntecedentesFamiliaresTbc(String antecedentesFamiliaresTbc) {
        this.antecedentesFamiliaresTbc = antecedentesFamiliaresTbc;
    }

    public String getAntecedentesFamiliaresDbt() {
        return antecedentesFamiliaresDbt;
    }

    public void setAntecedentesFamiliaresDbt(String antecedentesFamiliaresDbt) {
        this.antecedentesFamiliaresDbt = antecedentesFamiliaresDbt;
    }

    public String getAntecedentesFamiliaresHta() {
        return antecedentesFamiliaresHta;
    }

    public void setAntecedentesFamiliaresHta(String antecedentesFamiliaresHta) {
        this.antecedentesFamiliaresHta = antecedentesFamiliaresHta;
    }

    public String getAntecedentesFamiliaresPrec() {
        return antecedentesFamiliaresPrec;
    }

    public void setAntecedentesFamiliaresPrec(String antecedentesFamiliaresPrec) {
        this.antecedentesFamiliaresPrec = antecedentesFamiliaresPrec;
    }

    public String getAntecedentesFamiliaresEcl() {
        return antecedentesFamiliaresEcl;
    }

    public void setAntecedentesFamiliaresEcl(String antecedentesFamiliaresEcl) {
        this.antecedentesFamiliaresEcl = antecedentesFamiliaresEcl;
    }

    public String getAntecedentesFamiliaresOtrConGrave() {
        return antecedentesFamiliaresOtrConGrave;
    }

    public void setAntecedentesFamiliaresOtrConGrave(String antecedentesFamiliaresOtrConGrave) {
        this.antecedentesFamiliaresOtrConGrave = antecedentesFamiliaresOtrConGrave;
    }

    public String getAntPerTbc() {
        return antPerTbc;
    }

    public void setAntPerTbc(String antPerTbc) {
        this.antPerTbc = antPerTbc;
    }

    public String getAntPerDbt() {
        return antPerDbt;
    }

    public void setAntPerDbt(String antPerDbt) {
        this.antPerDbt = antPerDbt;
    }

    public String getAntPerHta() {
        return antPerHta;
    }

    public void setAntPerHta(String antPerHta) {
        this.antPerHta = antPerHta;
    }

    public String getAntPerPrec() {
        return antPerPrec;
    }

    public void setAntPerPrec(String antPerPrec) {
        this.antPerPrec = antPerPrec;
    }

    public String getAntPerEcl() {
        return antPerEcl;
    }

    public void setAntPerEcl(String antPerEcl) {
        this.antPerEcl = antPerEcl;
    }

    public String getAntoPerOtrConGrave() {
        return antoPerOtrConGrave;
    }

    public void setAntoPerOtrConGrave(String antoPerOtrConGrave) {
        this.antoPerOtrConGrave = antoPerOtrConGrave;
    }

    public String getAntPerCirGenUrin() {
        return antPerCirGenUrin;
    }

    public void setAntPerCirGenUrin(String antPerCirGenUrin) {
        this.antPerCirGenUrin = antPerCirGenUrin;
    }

    public String getAntPerInfertilidad() {
        return antPerInfertilidad;
    }

    public void setAntPerInfertilidad(String antPerInfertilidad) {
        this.antPerInfertilidad = antPerInfertilidad;
    }

    public String getAntPerCardiopatia() {
        return antPerCardiopatia;
    }

    public void setAntPerCardiopatia(String antPerCardiopatia) {
        this.antPerCardiopatia = antPerCardiopatia;
    }

    public String getAntPerNefropatia() {
        return antPerNefropatia;
    }

    public void setAntPerNefropatia(String antPerNefropatia) {
        this.antPerNefropatia = antPerNefropatia;
    }

    public String getAntPerViolencia() {
        return antPerViolencia;
    }

    public void setAntPerViolencia(String antPerViolencia) {
        this.antPerViolencia = antPerViolencia;
    }

    public String getDesCantPerOtrConGrave() {
        return desCantPerOtrConGrave;
    }

    public void setDesCantPerOtrConGrave(String desCantPerOtrConGrave) {
        this.desCantPerOtrConGrave = desCantPerOtrConGrave;
    }

    public Integer getGestasPrevias() {
        return gestasPrevias;
    }

    public void setGestasPrevias(Integer gestasPrevias) {
        this.gestasPrevias = gestasPrevias;
    }

    public Integer getAbortos() {
        return abortos;
    }

    public void setAbortos(Integer abortos) {
        this.abortos = abortos;
    }

    public Integer getVaginales() {
        return vaginales;
    }

    public void setVaginales(Integer vaginales) {
        this.vaginales = vaginales;
    }

    public Integer getNacidosVivos() {
        return nacidosVivos;
    }

    public void setNacidosVivos(Integer nacidosVivos) {
        this.nacidosVivos = nacidosVivos;
    }

    public Integer getViven() {
        return viven;
    }

    public void setViven(Integer viven) {
        this.viven = viven;
    }

    public String getTresEsponConsec() {
        return tresEsponConsec;
    }

    public void setTresEsponConsec(String tresEsponConsec) {
        this.tresEsponConsec = tresEsponConsec;
    }

    public Integer getAntecPartos() {
        return antecPartos;
    }

    public void setAntecPartos(Integer antecPartos) {
        this.antecPartos = antecPartos;
    }

    public String getUltimoPrevio() {
        return ultimoPrevio;
    }

    public void setUltimoPrevio(String ultimoPrevio) {
        this.ultimoPrevio = ultimoPrevio;
    }

    public String getAntGemelar() {
        return antGemelar;
    }

    public void setAntGemelar(String antGemelar) {
        this.antGemelar = antGemelar;
    }

    public Integer getCesarea() {
        return cesarea;
    }

    public void setCesarea(Integer cesarea) {
        this.cesarea = cesarea;
    }

    public Integer getNacMuertos() {
        return nacMuertos;
    }

    public void setNacMuertos(Integer nacMuertos) {
        this.nacMuertos = nacMuertos;
    }

    public Integer getMuertosPriSem() {
        return muertosPriSem;
    }

    public void setMuertosPriSem(Integer muertosPriSem) {
        this.muertosPriSem = muertosPriSem;
    }

    public Integer getMuertosDespPriSem() {
        return muertosDespPriSem;
    }

    public void setMuertosDespPriSem(Integer muertosDespPriSem) {
        this.muertosDespPriSem = muertosDespPriSem;
    }

    public Date getFechaFinEmbAnterior() {
        return fechaFinEmbAnterior;
    }

    public void setFechaFinEmbAnterior(Date fechaFinEmbAnterior) {
        this.fechaFinEmbAnterior = fechaFinEmbAnterior;
    }

    public String getMenosUnAnio() {
        return menosUnAnio;
    }

    public void setMenosUnAnio(String menosUnAnio) {
        this.menosUnAnio = menosUnAnio;
    }

    public String getEmbPlaneado() {
        return embPlaneado;
    }

    public void setEmbPlaneado(String embPlaneado) {
        this.embPlaneado = embPlaneado;
    }

    public String getFracasoAnticon() {
        return fracasoAnticon;
    }

    public void setFracasoAnticon(String fracasoAnticon) {
        this.fracasoAnticon = fracasoAnticon;
    }

    public Integer getGestActPesoAnterior() {
        return gestActPesoAnterior;
    }

    public void setGestActPesoAnterior(Integer gestActPesoAnterior) {
        this.gestActPesoAnterior = gestActPesoAnterior;
    }

    public Integer getGestActTalla() {
        return gestActTalla;
    }

    public void setGestActTalla(Integer gestActTalla) {
        this.gestActTalla = gestActTalla;
    }

    public Date getFpp() {
        return fpp;
    }

    public void setFpp(Date fpp) {
        this.fpp = fpp;
    }

    public String getEgConfFum() {
        return egConfFum;
    }

    public void setEgConfFum(String egConfFum) {
        this.egConfFum = egConfFum;
    }

    public String getEgConfEco() {
        return egConfEco;
    }

    public void setEgConfEco(String egConfEco) {
        this.egConfEco = egConfEco;
    }

    public String getAntiRubeola() {
        return antiRubeola;
    }

    public void setAntiRubeola(String antiRubeola) {
        this.antiRubeola = antiRubeola;
    }

    public String getAntiTetanica() {
        return antiTetanica;
    }

    public void setAntiTetanica(String antiTetanica) {
        this.antiTetanica = antiTetanica;
    }

    public Integer getMesGestPriDosisAtt() {
        return mesGestPriDosisAtt;
    }

    public void setMesGestPriDosisAtt(Integer mesGestPriDosisAtt) {
        this.mesGestPriDosisAtt = mesGestPriDosisAtt;
    }

    public Integer getMesGestSegDosisAtt() {
        return mesGestSegDosisAtt;
    }

    public void setMesGestSegDosisAtt(Integer mesGestSegDosisAtt) {
        this.mesGestSegDosisAtt = mesGestSegDosisAtt;
    }

    public String getExNormalOdonto() {
        return exNormalOdonto;
    }

    public void setExNormalOdonto(String exNormalOdonto) {
        this.exNormalOdonto = exNormalOdonto;
    }

    public String getExNormalMamas() {
        return exNormalMamas;
    }

    public void setExNormalMamas(String exNormalMamas) {
        this.exNormalMamas = exNormalMamas;
    }

    public String getCervixInspVisual() {
        return cervixInspVisual;
    }

    public void setCervixInspVisual(String cervixInspVisual) {
        this.cervixInspVisual = cervixInspVisual;
    }

    public String getCervixPap() {
        return cervixPap;
    }

    public void setCervixPap(String cervixPap) {
        this.cervixPap = cervixPap;
    }

    public String getCervixColp() {
        return cervixColp;
    }

    public void setCervixColp(String cervixColp) {
        this.cervixColp = cervixColp;
    }

    public String getGrupoSang() {
        return grupoSang;
    }

    public void setGrupoSang(String grupoSang) {
        this.grupoSang = grupoSang;
    }

    public String getRhSang() {
        return rhSang;
    }

    public void setRhSang(String rhSang) {
        this.rhSang = rhSang;
    }

    public String getInmunizacion() {
        return inmunizacion;
    }

    public void setInmunizacion(String inmunizacion) {
        this.inmunizacion = inmunizacion;
    }

    public String getToxoMenos20Sem() {
        return toxoMenos20Sem;
    }

    public void setToxoMenos20Sem(String toxoMenos20Sem) {
        this.toxoMenos20Sem = toxoMenos20Sem;
    }

    public String getToxoMas20Sem() {
        return toxoMas20Sem;
    }

    public void setToxoMas20Sem(String toxoMas20Sem) {
        this.toxoMas20Sem = toxoMas20Sem;
    }

    public String getToxoPriConsigm() {
        return toxoPriConsigm;
    }

    public void setToxoPriConsigm(String toxoPriConsigm) {
        this.toxoPriConsigm = toxoPriConsigm;
    }

    public Integer getHbMenor20Sem() {
        return hbMenor20Sem;
    }

    public void setHbMenor20Sem(Integer hbMenor20Sem) {
        this.hbMenor20Sem = hbMenor20Sem;
    }

    public String getHbMenor20SemMenor11() {
        return hbMenor20SemMenor11;
    }

    public void setHbMenor20SemMenor11(String hbMenor20SemMenor11) {
        this.hbMenor20SemMenor11 = hbMenor20SemMenor11;
    }

    public String getFeIndicado() {
        return feIndicado;
    }

    public void setFeIndicado(String feIndicado) {
        this.feIndicado = feIndicado;
    }

    public String getFolAtosIndicado() {
        return folAtosIndicado;
    }

    public void setFolAtosIndicado(String folAtosIndicado) {
        this.folAtosIndicado = folAtosIndicado;
    }

    public Integer getHbMayor20Sem() {
        return hbMayor20Sem;
    }

    public void setHbMayor20Sem(Integer hbMayor20Sem) {
        this.hbMayor20Sem = hbMayor20Sem;
    }

    public String getHbMayor20SemMenor11() {
        return hbMayor20SemMenor11;
    }

    public void setHbMayor20SemMenor11(String hbMayor20SemMenor11) {
        this.hbMayor20SemMenor11 = hbMayor20SemMenor11;
    }

    public String getEstreptococo() {
        return estreptococo;
    }

    public void setEstreptococo(String estreptococo) {
        this.estreptococo = estreptococo;
    }

    public String getChagas() {
        return chagas;
    }

    public void setChagas(String chagas) {
        this.chagas = chagas;
    }

    public String getPaludismoMalaria() {
        return paludismoMalaria;
    }

    public void setPaludismoMalaria(String paludismoMalaria) {
        this.paludismoMalaria = paludismoMalaria;
    }

    public String getBacteriUriaMenor20Sem() {
        return bacteriUriaMenor20Sem;
    }

    public void setBacteriUriaMenor20Sem(String bacteriUriaMenor20Sem) {
        this.bacteriUriaMenor20Sem = bacteriUriaMenor20Sem;
    }

    public String getBacteriUriaMayor20Sem() {
        return bacteriUriaMayor20Sem;
    }

    public void setBacteriUriaMayor20Sem(String bacteriUriaMayor20Sem) {
        this.bacteriUriaMayor20Sem = bacteriUriaMayor20Sem;
    }

    public Integer getGlucemiaMenor20Sem() {
        return glucemiaMenor20Sem;
    }

    public void setGlucemiaMenor20Sem(Integer glucemiaMenor20Sem) {
        this.glucemiaMenor20Sem = glucemiaMenor20Sem;
    }

    public Integer getGlucemiaMayor20sem() {
        return glucemiaMayor20sem;
    }

    public void setGlucemiaMayor20sem(Integer glucemiaMayor20sem) {
        this.glucemiaMayor20sem = glucemiaMayor20sem;
    }

    public String getPreParto() {
        return preParto;
    }

    public void setPreParto(String preParto) {
        this.preParto = preParto;
    }

    public String getConsejeriaLactancia() {
        return consejeriaLactancia;
    }

    public void setConsejeriaLactancia(String consejeriaLactancia) {
        this.consejeriaLactancia = consejeriaLactancia;
    }

    public String getSifilisNotrepArriba() {
        return sifilisNotrepArriba;
    }

    public void setSifilisNotrepArriba(String sifilisNotrepArriba) {
        this.sifilisNotrepArriba = sifilisNotrepArriba;
    }

    public String getSifilisNotrepaBajo() {
        return sifilisNotrepaBajo;
    }

    public void setSifilisNotrepaBajo(String sifilisNotrepaBajo) {
        this.sifilisNotrepaBajo = sifilisNotrepaBajo;
    }

    public String getSifilisTratArriba() {
        return sifilisTratArriba;
    }

    public void setSifilisTratArriba(String sifilisTratArriba) {
        this.sifilisTratArriba = sifilisTratArriba;
    }

    public String getPartoAborto() {
        return partoAborto;
    }

    public void setPartoAborto(String partoAborto) {
        this.partoAborto = partoAborto;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public Integer getConsultasPrenatales() {
        return consultasPrenatales;
    }

    public void setConsultasPrenatales(Integer consultasPrenatales) {
        this.consultasPrenatales = consultasPrenatales;
    }

    public String getHospEnEmbarazo() {
        return hospEnEmbarazo;
    }

    public void setHospEnEmbarazo(String hospEnEmbarazo) {
        this.hospEnEmbarazo = hospEnEmbarazo;
    }

    public Integer getHospEnEmbarazoDias() {
        return hospEnEmbarazoDias;
    }

    public void setHospEnEmbarazoDias(Integer hospEnEmbarazoDias) {
        this.hospEnEmbarazoDias = hospEnEmbarazoDias;
    }

    public String getCorticoidesAnteNat() {
        return corticoidesAnteNat;
    }

    public void setCorticoidesAnteNat(String corticoidesAnteNat) {
        this.corticoidesAnteNat = corticoidesAnteNat;
    }

    public Integer getCorticoidesAnteNatSemInicio() {
        return corticoidesAnteNatSemInicio;
    }

    public void setCorticoidesAnteNatSemInicio(Integer corticoidesAnteNatSemInicio) {
        this.corticoidesAnteNatSemInicio = corticoidesAnteNatSemInicio;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getRotmemAnteParto() {
        return rotmemAnteParto;
    }

    public void setRotmemAnteParto(String rotmemAnteParto) {
        this.rotmemAnteParto = rotmemAnteParto;
    }

    public Date getRotmemAntePartoFecha() {
        return rotmemAntePartoFecha;
    }

    public void setRotmemAntePartoFecha(Date rotmemAntePartoFecha) {
        this.rotmemAntePartoFecha = rotmemAntePartoFecha;
    }

    public LocalDateTime getRotmemAntePartoHora() {
        return rotmemAntePartoHora;
    }

    public void setRotmemAntePartoHora(LocalDateTime rotmemAntePartoHora) {
        this.rotmemAntePartoHora = rotmemAntePartoHora;
    }

    public String getRotmemAntePartoMenor37Sem() {
        return rotmemAntePartoMenor37Sem;
    }

    public void setRotmemAntePartoMenor37Sem(String rotmemAntePartoMenor37Sem) {
        this.rotmemAntePartoMenor37Sem = rotmemAntePartoMenor37Sem;
    }

    public String getRotmemAntePartoMayor18Hs() {
        return rotmemAntePartoMayor18Hs;
    }

    public void setRotmemAntePartoMayor18Hs(String rotmemAntePartoMayor18Hs) {
        this.rotmemAntePartoMayor18Hs = rotmemAntePartoMayor18Hs;
    }

    public String getRotmemAntePartoMayor38Grados() {
        return rotmemAntePartoMayor38Grados;
    }

    public void setRotmemAntePartoMayor38Grados(String rotmemAntePartoMayor38Grados) {
        this.rotmemAntePartoMayor38Grados = rotmemAntePartoMayor38Grados;
    }

    public Integer getRotmemAntePartoTemp() {
        return rotmemAntePartoTemp;
    }

    public void setRotmemAntePartoTemp(Integer rotmemAntePartoTemp) {
        this.rotmemAntePartoTemp = rotmemAntePartoTemp;
    }

    public Integer getEdadGestalPartoSem() {
        return edadGestalPartoSem;
    }

    public void setEdadGestalPartoSem(Integer edadGestalPartoSem) {
        this.edadGestalPartoSem = edadGestalPartoSem;
    }

    public Integer getEdadGestalPartoDias() {
        return edadGestalPartoDias;
    }

    public void setEdadGestalPartoDias(Integer edadGestalPartoDias) {
        this.edadGestalPartoDias = edadGestalPartoDias;
    }

    public String getEdadGestalPartoFum() {
        return edadGestalPartoFum;
    }

    public void setEdadGestalPartoFum(String edadGestalPartoFum) {
        this.edadGestalPartoFum = edadGestalPartoFum;
    }

    public String getEdadGestalPartoEco() {
        return edadGestalPartoEco;
    }

    public void setEdadGestalPartoEco(String edadGestalPartoEco) {
        this.edadGestalPartoEco = edadGestalPartoEco;
    }

    public String getPresenSituacion() {
        return presenSituacion;
    }

    public void setPresenSituacion(String presenSituacion) {
        this.presenSituacion = presenSituacion;
    }

    public String getTamFetalAcorde() {
        return tamFetalAcorde;
    }

    public void setTamFetalAcorde(String tamFetalAcorde) {
        this.tamFetalAcorde = tamFetalAcorde;
    }

    public String getAcompaniantEtdp() {
        return acompaniantEtdp;
    }

    public void setAcompaniantEtdp(String acompaniantEtdp) {
        this.acompaniantEtdp = acompaniantEtdp;
    }

    public String getAcompaniantEp() {
        return acompaniantEp;
    }

    public void setAcompaniantEp(String acompaniantEp) {
        this.acompaniantEp = acompaniantEp;
    }

    public String getTrabPartodeTalle() {
        return trabPartodeTalle;
    }

    public void setTrabPartodeTalle(String trabPartodeTalle) {
        this.trabPartodeTalle = trabPartodeTalle;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getHtaPrevia() {
        return htaPrevia;
    }

    public void setHtaPrevia(String htaPrevia) {
        this.htaPrevia = htaPrevia;
    }

    public String getHtaInducEmbarazo() {
        return htaInducEmbarazo;
    }

    public void setHtaInducEmbarazo(String htaInducEmbarazo) {
        this.htaInducEmbarazo = htaInducEmbarazo;
    }

    public String getPreEclampsia() {
        return preEclampsia;
    }

    public void setPreEclampsia(String preEclampsia) {
        this.preEclampsia = preEclampsia;
    }

    public String getEclampsia() {
        return eclampsia;
    }

    public void setEclampsia(String eclampsia) {
        this.eclampsia = eclampsia;
    }

    public String getCardiopatia() {
        return cardiopatia;
    }

    public void setCardiopatia(String cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public String getNefropatia() {
        return nefropatia;
    }

    public void setNefropatia(String nefropatia) {
        this.nefropatia = nefropatia;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getInfecOvular() {
        return infecOvular;
    }

    public void setInfecOvular(String infecOvular) {
        this.infecOvular = infecOvular;
    }

    public String getInfecUrinaria() {
        return infecUrinaria;
    }

    public void setInfecUrinaria(String infecUrinaria) {
        this.infecUrinaria = infecUrinaria;
    }

    public String getAmenazaPartoPret() {
        return amenazaPartoPret;
    }

    public void setAmenazaPartoPret(String amenazaPartoPret) {
        this.amenazaPartoPret = amenazaPartoPret;
    }

    public String getRciu() {
        return rciu;
    }

    public void setRciu(String rciu) {
        this.rciu = rciu;
    }

    public String getRotpremMembranas() {
        return rotpremMembranas;
    }

    public void setRotpremMembranas(String rotpremMembranas) {
        this.rotpremMembranas = rotpremMembranas;
    }

    public String getAnemia() {
        return anemia;
    }

    public void setAnemia(String anemia) {
        this.anemia = anemia;
    }

    public String getOtraCondGrave() {
        return otraCondGrave;
    }

    public void setOtraCondGrave(String otraCondGrave) {
        this.otraCondGrave = otraCondGrave;
    }

    public String getHemo1trim() {
        return hemo1trim;
    }

    public void setHemo1trim(String hemo1trim) {
        this.hemo1trim = hemo1trim;
    }

    public String getHemo2trim() {
        return hemo2trim;
    }

    public void setHemo2trim(String hemo2trim) {
        this.hemo2trim = hemo2trim;
    }

    public String getHemo3trim() {
        return hemo3trim;
    }

    public void setHemo3trim(String hemo3trim) {
        this.hemo3trim = hemo3trim;
    }

    public String getHemopostParto() {
        return hemopostParto;
    }

    public void setHemopostParto(String hemopostParto) {
        this.hemopostParto = hemopostParto;
    }

    public String getHemoInfecPuerperal() {
        return hemoInfecPuerperal;
    }

    public void setHemoInfecPuerperal(String hemoInfecPuerperal) {
        this.hemoInfecPuerperal = hemoInfecPuerperal;
    }

    public Integer getCodigoEnf1() {
        return codigoEnf1;
    }

    public void setCodigoEnf1(Integer codigoEnf1) {
        this.codigoEnf1 = codigoEnf1;
    }

    public Integer getCodigoEnf2() {
        return codigoEnf2;
    }

    public void setCodigoEnf2(Integer codigoEnf2) {
        this.codigoEnf2 = codigoEnf2;
    }

    public Integer getCodigoEnf3() {
        return codigoEnf3;
    }

    public void setCodigoEnf3(Integer codigoEnf3) {
        this.codigoEnf3 = codigoEnf3;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public LocalDateTime getHoraNacmiento() {
        return horaNacmiento;
    }

    public void setHoraNacmiento(LocalDateTime horaNacmiento) {
        this.horaNacmiento = horaNacmiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacMultiple() {
        return nacMultiple;
    }

    public void setNacMultiple(String nacMultiple) {
        this.nacMultiple = nacMultiple;
    }

    public String getNacTerminacion() {
        return nacTerminacion;
    }

    public void setNacTerminacion(String nacTerminacion) {
        this.nacTerminacion = nacTerminacion;
    }

    public String getInduccPartoOperatorio() {
        return induccPartoOperatorio;
    }

    public void setInduccPartoOperatorio(String induccPartoOperatorio) {
        this.induccPartoOperatorio = induccPartoOperatorio;
    }

    public Integer getCodigoInduc() {
        return codigoInduc;
    }

    public void setCodigoInduc(Integer codigoInduc) {
        this.codigoInduc = codigoInduc;
    }

    public Integer getCodigoOper() {
        return codigoOper;
    }

    public void setCodigoOper(Integer codigoOper) {
        this.codigoOper = codigoOper;
    }

    public String getPosicionParto() {
        return posicionParto;
    }

    public void setPosicionParto(String posicionParto) {
        this.posicionParto = posicionParto;
    }

    public String getEpisiotomia() {
        return episiotomia;
    }

    public void setEpisiotomia(String episiotomia) {
        this.episiotomia = episiotomia;
    }

    public String getDesgarros() {
        return desgarros;
    }

    public void setDesgarros(String desgarros) {
        this.desgarros = desgarros;
    }

    public Integer getDesgarrosGrado() {
        return desgarrosGrado;
    }

    public void setDesgarrosGrado(Integer desgarrosGrado) {
        this.desgarrosGrado = desgarrosGrado;
    }

    public String getOcitocicosPreAlumbr() {
        return ocitocicosPreAlumbr;
    }

    public void setOcitocicosPreAlumbr(String ocitocicosPreAlumbr) {
        this.ocitocicosPreAlumbr = ocitocicosPreAlumbr;
    }

    public String getOcitocicosPostAlumbr() {
        return ocitocicosPostAlumbr;
    }

    public void setOcitocicosPostAlumbr(String ocitocicosPostAlumbr) {
        this.ocitocicosPostAlumbr = ocitocicosPostAlumbr;
    }

    public String getPlacentaCompleta() {
        return placentaCompleta;
    }

    public void setPlacentaCompleta(String placentaCompleta) {
        this.placentaCompleta = placentaCompleta;
    }

    public String getPlacentaRetenida() {
        return placentaRetenida;
    }

    public void setPlacentaRetenida(String placentaRetenida) {
        this.placentaRetenida = placentaRetenida;
    }

    public String getLigCordonPrecoz() {
        return ligCordonPrecoz;
    }

    public void setLigCordonPrecoz(String ligCordonPrecoz) {
        this.ligCordonPrecoz = ligCordonPrecoz;
    }

    public String getMedRecibidaOcitocicos() {
        return medRecibidaOcitocicos;
    }

    public void setMedRecibidaOcitocicos(String medRecibidaOcitocicos) {
        this.medRecibidaOcitocicos = medRecibidaOcitocicos;
    }

    public String getMedRecibidaAtibioticos() {
        return medRecibidaAtibioticos;
    }

    public void setMedRecibidaAtibioticos(String medRecibidaAtibioticos) {
        this.medRecibidaAtibioticos = medRecibidaAtibioticos;
    }

    public String getMedRecibidaAnalgesia() {
        return medRecibidaAnalgesia;
    }

    public void setMedRecibidaAnalgesia(String medRecibidaAnalgesia) {
        this.medRecibidaAnalgesia = medRecibidaAnalgesia;
    }

    public String getMedRecibidaAnestLocal() {
        return medRecibidaAnestLocal;
    }

    public void setMedRecibidaAnestLocal(String medRecibidaAnestLocal) {
        this.medRecibidaAnestLocal = medRecibidaAnestLocal;
    }

    public String getMedRecibidaAnestRegion() {
        return medRecibidaAnestRegion;
    }

    public void setMedRecibidaAnestRegion(String medRecibidaAnestRegion) {
        this.medRecibidaAnestRegion = medRecibidaAnestRegion;
    }

    public String getMedRecibidaAnestGral() {
        return medRecibidaAnestGral;
    }

    public void setMedRecibidaAnestGral(String medRecibidaAnestGral) {
        this.medRecibidaAnestGral = medRecibidaAnestGral;
    }

    public String getMedRecibidaTransfusion() {
        return medRecibidaTransfusion;
    }

    public void setMedRecibidaTransfusion(String medRecibidaTransfusion) {
        this.medRecibidaTransfusion = medRecibidaTransfusion;
    }

    public String getMedRecibidaotros() {
        return medRecibidaotros;
    }

    public void setMedRecibidaotros(String medRecibidaotros) {
        this.medRecibidaotros = medRecibidaotros;
    }

    public Integer getMedRecibidaCodMed1() {
        return medRecibidaCodMed1;
    }

    public void setMedRecibidaCodMed1(Integer medRecibidaCodMed1) {
        this.medRecibidaCodMed1 = medRecibidaCodMed1;
    }

    public String getMedrecibidaCodMed2() {
        return medrecibidaCodMed2;
    }

    public void setMedrecibidaCodMed2(String medrecibidaCodMed2) {
        this.medrecibidaCodMed2 = medrecibidaCodMed2;
    }

    public String getAtendioParto() {
        return atendioParto;
    }

    public void setAtendioParto(String atendioParto) {
        this.atendioParto = atendioParto;
    }

    public String getAtendioPartoNombre() {
        return atendioPartoNombre;
    }

    public void setAtendioPartoNombre(String atendioPartoNombre) {
        this.atendioPartoNombre = atendioPartoNombre;
    }

    public String getAtendioNeonato() {
        return atendioNeonato;
    }

    public void setAtendioNeonato(String atendioNeonato) {
        this.atendioNeonato = atendioNeonato;
    }

    public String getAtendioNeonatoNombre() {
        return atendioNeonatoNombre;
    }

    public void setAtendioNeonatoNombre(String atendioNeonatoNombre) {
        this.atendioNeonatoNombre = atendioNeonatoNombre;
    }

    public String getAntiRubeolaPostParto() {
        return antiRubeolaPostParto;
    }

    public void setAntiRubeolaPostParto(String antiRubeolaPostParto) {
        this.antiRubeolaPostParto = antiRubeolaPostParto;
    }

    public Date getEgresomaternofecha() {
        return egresomaternofecha;
    }

    public void setEgresomaternofecha(Date egresomaternofecha) {
        this.egresomaternofecha = egresomaternofecha;
    }

    public String getEgresoMaternoTraslado() {
        return egresoMaternoTraslado;
    }

    public void setEgresoMaternoTraslado(String egresoMaternoTraslado) {
        this.egresoMaternoTraslado = egresoMaternoTraslado;
    }

    public String getEgresoMaternoLugar() {
        return egresoMaternoLugar;
    }

    public void setEgresoMaternoLugar(String egresoMaternoLugar) {
        this.egresoMaternoLugar = egresoMaternoLugar;
    }

    public String getEgresoMaterno() {
        return egresoMaterno;
    }

    public void setEgresoMaterno(String egresoMaterno) {
        this.egresoMaterno = egresoMaterno;
    }

    public String getEgresoMaternoFallece() {
        return egresoMaternoFallece;
    }

    public void setEgresoMaternoFallece(String egresoMaternoFallece) {
        this.egresoMaternoFallece = egresoMaternoFallece;
    }

    public Integer getEgresoMaternoCantDias() {
        return egresoMaternoCantDias;
    }

    public void setEgresoMaternoCantDias(Integer egresoMaternoCantDias) {
        this.egresoMaternoCantDias = egresoMaternoCantDias;
    }

    public String getAntiConConsejeria() {
        return antiConConsejeria;
    }

    public void setAntiConConsejeria(String antiConConsejeria) {
        this.antiConConsejeria = antiConConsejeria;
    }

    public String getAnticonmetodoelegido() {
        return anticonmetodoelegido;
    }

    public void setAnticonmetodoelegido(String anticonmetodoelegido) {
        this.anticonmetodoelegido = anticonmetodoelegido;
    }

    public String getEgresoMaternoResponsable() {
        return egresoMaternoResponsable;
    }

    public void setEgresoMaternoResponsable(String egresoMaternoResponsable) {
        this.egresoMaternoResponsable = egresoMaternoResponsable;
    }

    public String getGamaglobulina() {
        return gamaglobulina;
    }

    public void setGamaglobulina(String gamaglobulina) {
        this.gamaglobulina = gamaglobulina;
    }

    public String getGamaglobulinaPostParto() {
        return gamaglobulinaPostParto;
    }

    public void setGamaglobulinaPostParto(String gamaglobulinaPostParto) {
        this.gamaglobulinaPostParto = gamaglobulinaPostParto;
    }

    public Integer getSifilisNoTrepMenor20() {
        return sifilisNoTrepMenor20;
    }

    public void setSifilisNoTrepMenor20(Integer sifilisNoTrepMenor20) {
        this.sifilisNoTrepMenor20 = sifilisNoTrepMenor20;
    }

    public Integer getSifilisNoTrepMayor20() {
        return sifilisNoTrepMayor20;
    }

    public void setSifilisNoTrepMayor20(Integer sifilisNoTrepMayor20) {
        this.sifilisNoTrepMayor20 = sifilisNoTrepMayor20;
    }

    public Integer getSifilisTrepMenor20() {
        return sifilisTrepMenor20;
    }

    public void setSifilisTrepMenor20(Integer sifilisTrepMenor20) {
        this.sifilisTrepMenor20 = sifilisTrepMenor20;
    }

    public Integer getSifilisTrepMayor20() {
        return sifilisTrepMayor20;
    }

    public void setSifilisTrepMayor20(Integer sifilisTrepMayor20) {
        this.sifilisTrepMayor20 = sifilisTrepMayor20;
    }

    public Integer getSifilisTratMenor20() {
        return sifilisTratMenor20;
    }

    public void setSifilisTratMenor20(Integer sifilisTratMenor20) {
        this.sifilisTratMenor20 = sifilisTratMenor20;
    }

    public Integer getSifilisTratMayor20() {
        return sifilisTratMayor20;
    }

    public void setSifilisTratMayor20(Integer sifilisTratMayor20) {
        this.sifilisTratMayor20 = sifilisTratMayor20;
    }

    public String getSifilisTrepArriba() {
        return sifilisTrepArriba;
    }

    public void setSifilisTrepArriba(String sifilisTrepArriba) {
        this.sifilisTrepArriba = sifilisTrepArriba;
    }

    public String getSifilisTrepaBajo() {
        return sifilisTrepaBajo;
    }

    public void setSifilisTrepaBajo(String sifilisTrepaBajo) {
        this.sifilisTrepaBajo = sifilisTrepaBajo;
    }

    public String getSifilisTrataBajo() {
        return sifilisTrataBajo;
    }

    public void setSifilisTrataBajo(String sifilisTrataBajo) {
        this.sifilisTrataBajo = sifilisTrataBajo;
    }

    public Integer getEmbarazoEctopico() {
        return embarazoEctopico;
    }

    public void setEmbarazoEctopico(Integer embarazoEctopico) {
        this.embarazoEctopico = embarazoEctopico;
    }

    public String getTtoParejaMenor20Sem() {
        return ttoParejaMenor20Sem;
    }

    public void setTtoParejaMenor20Sem(String ttoParejaMenor20Sem) {
        this.ttoParejaMenor20Sem = ttoParejaMenor20Sem;
    }

    public String getTtoParejaMayor20Sem() {
        return ttoParejaMayor20Sem;
    }

    public void setTtoParejaMayor20Sem(String ttoParejaMayor20Sem) {
        this.ttoParejaMayor20Sem = ttoParejaMayor20Sem;
    }

    public String getGlucemiaMenor20SemMayor105() {
        return glucemiaMenor20SemMayor105;
    }

    public void setGlucemiaMenor20SemMayor105(String glucemiaMenor20SemMayor105) {
        this.glucemiaMenor20SemMayor105 = glucemiaMenor20SemMayor105;
    }

    public String getGlucemiaMayor20SemMayor105() {
        return glucemiaMayor20SemMayor105;
    }

    public void setGlucemiaMayor20SemMayor105(String glucemiaMayor20SemMayor105) {
        this.glucemiaMayor20SemMayor105 = glucemiaMayor20SemMayor105;
    }

    public Date getFum() {
        return fum;
    }

    public void setFum(Date fum) {
        this.fum = fum;
    }

    public String getAntPerVihMas() {
        return antPerVihMas;
    }

    public void setAntPerVihMas(String antPerVihMas) {
        this.antPerVihMas = antPerVihMas;
    }

    public String getVihDiagTratSolicMenor20Sem() {
        return vihDiagTratSolicMenor20Sem;
    }

    public void setVihDiagTratSolicMenor20Sem(String vihDiagTratSolicMenor20Sem) {
        this.vihDiagTratSolicMenor20Sem = vihDiagTratSolicMenor20Sem;
    }

    public String getVihDiagTratSolicMayorIgual20Sem() {
        return vihDiagTratSolicMayorIgual20Sem;
    }

    public void setVihDiagTratSolicMayorIgual20Sem(String vihDiagTratSolicMayorIgual20Sem) {
        this.vihDiagTratSolicMayorIgual20Sem = vihDiagTratSolicMayorIgual20Sem;
    }

    public String getVihDiagTratPruebMenor20Sem() {
        return vihDiagTratPruebMenor20Sem;
    }

    public void setVihDiagTratPruebMenor20Sem(String vihDiagTratPruebMenor20Sem) {
        this.vihDiagTratPruebMenor20Sem = vihDiagTratPruebMenor20Sem;
    }

    public String getVihDiagTratPruebMayorIgual20Sem() {
        return vihDiagTratPruebMayorIgual20Sem;
    }

    public void setVihDiagTratPruebMayorIgual20Sem(String vihDiagTratPruebMayorIgual20Sem) {
        this.vihDiagTratPruebMayorIgual20Sem = vihDiagTratPruebMayorIgual20Sem;
    }

    public String getVihDiagTratTarvMenor20Sem() {
        return vihDiagTratTarvMenor20Sem;
    }

    public void setVihDiagTratTarvMenor20Sem(String vihDiagTratTarvMenor20Sem) {
        this.vihDiagTratTarvMenor20Sem = vihDiagTratTarvMenor20Sem;
    }

    public String getVihDiagTratTarvMayorIgual20Sem() {
        return vihDiagTratTarvMayorIgual20Sem;
    }

    public void setVihDiagTratTarvMayorIgual20Sem(String vihDiagTratTarvMayorIgual20Sem) {
        this.vihDiagTratTarvMayorIgual20Sem = vihDiagTratTarvMayorIgual20Sem;
    }

    public String getTdpPruebaSifilis() {
        return tdpPruebaSifilis;
    }

    public void setTdpPruebaSifilis(String tdpPruebaSifilis) {
        this.tdpPruebaSifilis = tdpPruebaSifilis;
    }

    public String getTdpPruebaVih() {
        return tdpPruebaVih;
    }

    public void setTdpPruebaVih(String tdpPruebaVih) {
        this.tdpPruebaVih = tdpPruebaVih;
    }

    public String getTdpPruebaTarv() {
        return tdpPruebaTarv;
    }

    public void setTdpPruebaTarv(String tdpPruebaTarv) {
        this.tdpPruebaTarv = tdpPruebaTarv;
    }

    public String getPartoOtroEstablecimiento() {
        return partoOtroEstablecimiento;
    }

    public void setPartoOtroEstablecimiento(String partoOtroEstablecimiento) {
        this.partoOtroEstablecimiento = partoOtroEstablecimiento;
    }
}
