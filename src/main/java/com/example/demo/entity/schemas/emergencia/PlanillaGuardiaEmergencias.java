package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.facturacion.Aseguradora;
import com.example.demo.entity.schemas.facturacion.ObraSocial;
import com.example.demo.entity.schemas.facturacion.Seguro;
import com.example.demo.entity.schemas.nomencladores.NomencladorEnfermedadesCie10;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "emergencia", name = "planillaguardia_emergencias")
public class PlanillaGuardiaEmergencias {
    @EmbeddedId
    private PlanillaGuardiaEmergenciasPK id;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Date fecha;
    private LocalDateTime hora;
    @Column(name = "estadoform")
    private String estadoForm;
    @ManyToMany
    @JoinColumn(name = "obrasocial",referencedColumnName = "codigoobrasocial")
    private List<ObraSocial> obraSocial;
    @ManyToOne
    @JoinColumn(name = "medico", referencedColumnName = "codigopersonal")
    private Personal medico;
    @Column(name = "esaccidente")
    private String esAccidente;
    private String policia;
    private String observacion;
    private Integer importe;
    @ManyToOne
    @JoinColumn(name = "codigoseguro", referencedColumnName = "codigoseguro")
    private Seguro seguro;
    @Column(name = "numeropoliza")
    private Integer numeroPoliza;
    @ManyToOne
    @JoinColumn(name = "codigoart", referencedColumnName = "codigoart")
    private Aseguradora aseguradora;
    @Column(name = "tipoatencion")
    private String tipoAtencion;
    private String consulta;
    private String curacion;
    @Column(name = "sutura_old")
    private String suturaOld;
    private String quemado;
    private String inyeccion;
    private String presion;
    private String nebulizacion;
    private String medicamentos;
    private String radiologia;
    private String laboratorio;
    @Column(name = "yeso_venda_old")
    private String yesoVendaOld;
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "nropacienteviejo", referencedColumnName = "nroPaciente", insertable=false, updatable=false),
            @JoinColumn(name = "uniat", referencedColumnName = "uniat", insertable=false, updatable=false)
    })
    private PacienteGuardia pacienteGuardia;
    @ManyToOne
    @JoinColumn(name = "codigodiagnostico", referencedColumnName = "codigo")
    private NomencladorEnfermedadesCie10 nomencladorEnfermedadesCie10;
    private String defuncion;
    @Column(name = "presentabono")
    private String presentaBono;
    @Column(name = "horaatencion")
    private LocalDateTime horaAtencion;
    @Column(name = "diagregporprof")
    private String diagRegPorProf;
    @Column(name = "fechaatencion")
    private Date fechaAtencion;
    @Column(name = "medicamentostxt_old")
    private String medicamentosTxtOld;
    @Column(name = "radiologiatxt_old")
    private String radiologiaTxtOld;
    @Column(name = "laboratoriotxt_old")
    private String laboratorioTxtOld;
    @Column(name = "enfermeriatxt_old")
    private String enfermeriaTxtOld;
    @Column(name = "plantxt")
    private String planTxt;
    @Column(name = "fechaingrcon")
    private Date fechaIngrCon;
    @Column(name = "horaingrcon")
    private LocalDateTime horaIngrCon;
    @Column(name = "observacionesmedico")
    private String observacionesMedico;
    @Column(name = "trajoambulancia")
    private String trajoAmbulancia;
    @Column(name = "enfermero_old")
    private String enfermeroOld;
    @Column(name = "accionesenfermeria_old")
    private String accionesEnfermeriaOld;
    private String shockroom;
    @Column(name = "radiologiatomo")
    private String radiologiaTomo;
    @Column(name = "radiologiarx")
    private String radiologiaRx;
    @Column(name = "radiologiaeco")
    private String radiologiaEco;
    private String violencia;
    private String alerta;
    private String ecg;
    @Column(name = "codperingreso")
    private String codPerIngreso;
    @Column(name = "niveltriage_old")
    private String nivelTriageOld;
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
    @Column(name = "pedidointernacion_usuario")
    private String pedidoInternacionUsuario;
    @Column(name = "pedidointernacion_fechahora")
    private LocalDateTime pedidoInternacionFechaHora;
    @Column(name = "phidratparen")
    private String pHidratParen;
    private String respiratorio;
    @OneToMany(mappedBy = "id.planillaGuardiaEmergencias")
    private List<InternacionTransitoria> internacionTransitorias;

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public List<InternacionTransitoria> getInternacionTransitorias() {
        return internacionTransitorias;
    }

    public void setInternacionTransitorias(List<InternacionTransitoria> internacionTransitorias) {
        this.internacionTransitorias = internacionTransitorias;
    }

    public PlanillaGuardiaEmergenciasPK getId() {
        return id;
    }

    public void setId(PlanillaGuardiaEmergenciasPK id) {
        this.id = id;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getEstadoForm() {
        return estadoForm;
    }

    public void setEstadoForm(String estadoForm) {
        this.estadoForm = estadoForm;
    }

    public List<ObraSocial> getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(List<ObraSocial> obraSocial) {
        this.obraSocial = obraSocial;
    }

    public Personal getMedico() {
        return medico;
    }

    public void setMedico(Personal medico) {
        this.medico = medico;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getEsAccidente() {
        return esAccidente;
    }

    public void setEsAccidente(String esAccidente) {
        this.esAccidente = esAccidente;
    }

    public String getPolicia() {
        return policia;
    }

    public void setPolicia(String policia) {
        this.policia = policia;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
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

    public String getYesoVendaOld() {
        return yesoVendaOld;
    }

    public void setYesoVendaOld(String yesoVendaOld) {
        this.yesoVendaOld = yesoVendaOld;
    }

    public PacienteGuardia getPacienteGuardia() {
        return pacienteGuardia;
    }

    public void setPacienteGuardia(PacienteGuardia pacienteGuardia) {
        this.pacienteGuardia = pacienteGuardia;
    }

    public NomencladorEnfermedadesCie10 getNomencladorEnfermedadesCie10() {
        return nomencladorEnfermedadesCie10;
    }

    public void setNomencladorEnfermedadesCie10(NomencladorEnfermedadesCie10 nomencladorEnfermedadesCie10) {
        this.nomencladorEnfermedadesCie10 = nomencladorEnfermedadesCie10;
    }

    public String getDefuncion() {
        return defuncion;
    }

    public void setDefuncion(String defuncion) {
        this.defuncion = defuncion;
    }

    public String getPresentaBono() {
        return presentaBono;
    }

    public void setPresentaBono(String presentaBono) {
        this.presentaBono = presentaBono;
    }

    public LocalDateTime getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(LocalDateTime horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getDiagRegPorProf() {
        return diagRegPorProf;
    }

    public void setDiagRegPorProf(String diagRegPorProf) {
        this.diagRegPorProf = diagRegPorProf;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
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

    public String getEnfermeriaTxtOld() {
        return enfermeriaTxtOld;
    }

    public void setEnfermeriaTxtOld(String enfermeriaTxtOld) {
        this.enfermeriaTxtOld = enfermeriaTxtOld;
    }

    public String getPlanTxt() {
        return planTxt;
    }

    public void setPlanTxt(String planTxt) {
        this.planTxt = planTxt;
    }

    public Date getFechaIngrCon() {
        return fechaIngrCon;
    }

    public void setFechaIngrCon(Date fechaIngrCon) {
        this.fechaIngrCon = fechaIngrCon;
    }

    public LocalDateTime getHoraIngrCon() {
        return horaIngrCon;
    }

    public void setHoraIngrCon(LocalDateTime horaIngrCon) {
        this.horaIngrCon = horaIngrCon;
    }

    public String getObservacionesMedico() {
        return observacionesMedico;
    }

    public void setObservacionesMedico(String observacionesMedico) {
        this.observacionesMedico = observacionesMedico;
    }

    public String getTrajoAmbulancia() {
        return trajoAmbulancia;
    }

    public void setTrajoAmbulancia(String trajoAmbulancia) {
        this.trajoAmbulancia = trajoAmbulancia;
    }

    public String getEnfermeroOld() {
        return enfermeroOld;
    }

    public void setEnfermeroOld(String enfermeroOld) {
        this.enfermeroOld = enfermeroOld;
    }

    public String getAccionesEnfermeriaOld() {
        return accionesEnfermeriaOld;
    }

    public void setAccionesEnfermeriaOld(String accionesEnfermeriaOld) {
        this.accionesEnfermeriaOld = accionesEnfermeriaOld;
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

    public String getViolencia() {
        return violencia;
    }

    public void setViolencia(String violencia) {
        this.violencia = violencia;
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

    public String getCodPerIngreso() {
        return codPerIngreso;
    }

    public void setCodPerIngreso(String codPerIngreso) {
        this.codPerIngreso = codPerIngreso;
    }

    public String getNivelTriageOld() {
        return nivelTriageOld;
    }

    public void setNivelTriageOld(String nivelTriageOld) {
        this.nivelTriageOld = nivelTriageOld;
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

    public String getPedidoInternacionUsuario() {
        return pedidoInternacionUsuario;
    }

    public void setPedidoInternacionUsuario(String pedidoInternacionUsuario) {
        this.pedidoInternacionUsuario = pedidoInternacionUsuario;
    }

    public LocalDateTime getPedidoInternacionFechaHora() {
        return pedidoInternacionFechaHora;
    }

    public void setPedidoInternacionFechaHora(LocalDateTime pedidoInternacionFechaHora) {
        this.pedidoInternacionFechaHora = pedidoInternacionFechaHora;
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
