package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.derivaciones.Lugar;
import com.example.demo.entity.schemas.facturacion.Aseguradora;
import com.example.demo.entity.schemas.facturacion.ObraSocial;
import com.example.demo.entity.schemas.facturacion.Seguro;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "emergencia", name = "viajeambulancialargdist")
public class ViajeAmbulanciaLargDist {
    @EmbeddedId
    private ViajeAmbulanciaLargDistPK id;
    @ManyToOne
    @JoinColumn(name = "obrasocial", referencedColumnName = "codigoobrasocial")
    private ObraSocial obraSocial;
    @ManyToOne
    @JoinColumn(name = "codigoart", referencedColumnName = "codigoart")
    private Aseguradora aseguradora;
    @ManyToOne
    @JoinColumn(name = "codigoseguro", referencedColumnName = "codigoseguro")
    private Seguro seguro;
    @Column(name = "numeropoliza")
    private Integer numeroPoliza;
    @Column(name = "ambulanciade")
    private String ambulanciaDe;
    @OneToOne
    @JoinColumn(name = "descprivada", referencedColumnName = "codigo")
    private AmbulanciaPrivada ambulanciaPrivada;
    @ManyToOne
    @JoinColumn(name = "origen", referencedColumnName = "codigo")
    private OrigenDestinoAmbulancia origen;
    @ManyToOne
    @JoinColumn(name = "origenlugar", referencedColumnName = "codigo")
    private Lugar origenlugar;
    @ManyToOne
    @JoinColumn(name = "destino", referencedColumnName = "codigo")
    private OrigenDestinoAmbulancia destino;
    @ManyToOne
    @JoinColumn(name = "destinolugar", referencedColumnName = "codigo")
    private Lugar destinolugar;
    @Column(name = "conmedico")
    private String conMedico;
    @ManyToOne
    @JoinColumn(name = "medico", referencedColumnName = "codigopersonal")
    private Personal medico;
    private String diagnostico;
    private String observacion;
    @Column(name = "nroambulancia")
    private Integer nroAmbulancia;
    @ManyToOne
    @JoinColumn(name = "chofer", referencedColumnName = "codigopersonal")
    private Personal chofer;
    @ManyToOne
    @JoinColumn(name = "enfermero", referencedColumnName = "codigopersonal")
    private Personal enfermero;
    @Column(name = "nrocelular")
    private String nroSelular;
    @Column(name = "montoentregado")
    private Integer montoEntregado;
    @Column(name = "viaticochofer")
    private Integer viaticoChofer;
    @Column(name = "viaticoenfermero")
    private Integer viaticoEnfermero;
    private Integer gastos;
    @Column(name = "quedainternado")
    private String quedaInternado;
    private String complejidad;
    private String urgencia;
    @Column(name = "tipoamb")
    private String tipoAmb;
    @Column(name = "matriculaprof")
    private String matriculaProf;
    @Column(name = "fecha_regreso")
    private Date fechaRegreso;
    @Column(name = "hora_regreso")
    private LocalDateTime horaRegreso;
    @Column(name = "kmrecorridos")
    private Integer kmRecorridos;
    private Integer transferido;

    public ViajeAmbulanciaLargDistPK getId() {
        return id;
    }

    public void setId(ViajeAmbulanciaLargDistPK id) {
        this.id = id;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
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

    public String getAmbulanciaDe() {
        return ambulanciaDe;
    }

    public void setAmbulanciaDe(String ambulanciaDe) {
        this.ambulanciaDe = ambulanciaDe;
    }

    public AmbulanciaPrivada getAmbulanciaPrivada() {
        return ambulanciaPrivada;
    }

    public void setAmbulanciaPrivada(AmbulanciaPrivada ambulanciaPrivada) {
        this.ambulanciaPrivada = ambulanciaPrivada;
    }

    public OrigenDestinoAmbulancia getOrigen() {
        return origen;
    }

    public void setOrigen(OrigenDestinoAmbulancia origen) {
        this.origen = origen;
    }

    public Lugar getOrigenlugar() {
        return origenlugar;
    }

    public void setOrigenlugar(Lugar origenlugar) {
        this.origenlugar = origenlugar;
    }

    public OrigenDestinoAmbulancia getDestino() {
        return destino;
    }

    public void setDestino(OrigenDestinoAmbulancia destino) {
        this.destino = destino;
    }

    public Lugar getDestinolugar() {
        return destinolugar;
    }

    public void setDestinolugar(Lugar destinolugar) {
        this.destinolugar = destinolugar;
    }

    public String getConMedico() {
        return conMedico;
    }

    public void setConMedico(String conMedico) {
        this.conMedico = conMedico;
    }

    public Personal getMedico() {
        return medico;
    }

    public void setMedico(Personal medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getNroAmbulancia() {
        return nroAmbulancia;
    }

    public void setNroAmbulancia(Integer nroAmbulancia) {
        this.nroAmbulancia = nroAmbulancia;
    }

    public Personal getChofer() {
        return chofer;
    }

    public void setChofer(Personal chofer) {
        this.chofer = chofer;
    }

    public Personal getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Personal enfermero) {
        this.enfermero = enfermero;
    }

    public String getNroSelular() {
        return nroSelular;
    }

    public void setNroSelular(String nroSelular) {
        this.nroSelular = nroSelular;
    }

    public Integer getMontoEntregado() {
        return montoEntregado;
    }

    public void setMontoEntregado(Integer montoEntregado) {
        this.montoEntregado = montoEntregado;
    }

    public Integer getViaticoChofer() {
        return viaticoChofer;
    }

    public void setViaticoChofer(Integer viaticoChofer) {
        this.viaticoChofer = viaticoChofer;
    }

    public Integer getViaticoEnfermero() {
        return viaticoEnfermero;
    }

    public void setViaticoEnfermero(Integer viaticoEnfermero) {
        this.viaticoEnfermero = viaticoEnfermero;
    }

    public Integer getGastos() {
        return gastos;
    }

    public void setGastos(Integer gastos) {
        this.gastos = gastos;
    }

    public String getQuedaInternado() {
        return quedaInternado;
    }

    public void setQuedaInternado(String quedaInternado) {
        this.quedaInternado = quedaInternado;
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getTipoAmb() {
        return tipoAmb;
    }

    public void setTipoAmb(String tipoAmb) {
        this.tipoAmb = tipoAmb;
    }

    public String getMatriculaProf() {
        return matriculaProf;
    }

    public void setMatriculaProf(String matriculaProf) {
        this.matriculaProf = matriculaProf;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public LocalDateTime getHoraRegreso() {
        return horaRegreso;
    }

    public void setHoraRegreso(LocalDateTime horaRegreso) {
        this.horaRegreso = horaRegreso;
    }

    public Integer getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(Integer kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public Integer getTransferido() {
        return transferido;
    }

    public void setTransferido(Integer transferido) {
        this.transferido = transferido;
    }
}