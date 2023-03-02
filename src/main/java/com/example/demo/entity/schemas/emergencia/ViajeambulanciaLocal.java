package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.derivaciones.Lugar;
import com.example.demo.entity.schemas.facturacion.Aseguradora;
import com.example.demo.entity.schemas.facturacion.ObraSocial;
import com.example.demo.entity.schemas.facturacion.Seguro;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "viajeambulancialocal", schema = "emergencia")
public class ViajeambulanciaLocal {
    @EmbeddedId
    private ViajeambulanciaLocalPK id;
    @ManyToOne
    @JoinColumn(name = "obrasocial", referencedColumnName = "codigoobrasocial")
    private ObraSocial obraSocial;
    @OneToOne
    @JoinColumn(name = "codigoart", referencedColumnName = "codigoart")
    private Aseguradora codigoArt;
    @OneToOne
    @JoinColumn(name = "codigoseguro", referencedColumnName = "codigoseguro")
    private Seguro seguro;
    @Column(name = "numeropoliza")
    private Integer numeroPoliza;
    @Column(name = "ambulanciade")
    private String ambulanciaDe;
    @Column(name = "descprivada")
    private String descPrivada;
    @ManyToOne
    @JoinColumn(name = "origen", referencedColumnName = "codigo")
    private OrigenDestinoAmbulancia origen;
    @ManyToOne
    @JoinColumn(name = "origenlugar", referencedColumnName = "codigo")
    private Lugar origenLugar;
    @ManyToOne
    @JoinColumn(name = "destino", referencedColumnName = "codigo")
    private OrigenDestinoAmbulancia destino;
    @ManyToOne
    @JoinColumn(name = "destinolugar", referencedColumnName = "codigo")
    private Lugar destinoLugar;
    @ManyToOne
    @JoinColumn(name = "medico", referencedColumnName = "codigopersonal")
    private Personal medico;
    private String diagnostico;
    private String observacion;
    @Column(name = "nroambulancia")
    private Integer nroAmbulancia;
    private String chofer;
    private String enfermero;
    private String complejidad;
    private String urgencia;
    @Column(name = "matriculaprof")
    private String matriculaProf;
    @Column(name = "destinosalacama")
    private String destinoSalaCama;
    @Column(name = "destinodomicilio")
    private String destinoDomicilio;
    private String practica;
    @Column(name = "tipoamb")
    private String tipoAmb;

    public ViajeambulanciaLocalPK getId() {
        return id;
    }

    public void setId(ViajeambulanciaLocalPK id) {
        this.id = id;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }

    public Aseguradora getCodigoArt() {
        return codigoArt;
    }

    public void setCodigoArt(Aseguradora codigoArt) {
        this.codigoArt = codigoArt;
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

    public String getDescPrivada() {
        return descPrivada;
    }

    public void setDescPrivada(String descPrivada) {
        this.descPrivada = descPrivada;
    }

    public OrigenDestinoAmbulancia getOrigen() {
        return origen;
    }

    public void setOrigen(OrigenDestinoAmbulancia origen) {
        this.origen = origen;
    }

    public Lugar getOrigenLugar() {
        return origenLugar;
    }

    public void setOrigenLugar(Lugar origenLugar) {
        this.origenLugar = origenLugar;
    }

    public OrigenDestinoAmbulancia getDestino() {
        return destino;
    }

    public void setDestino(OrigenDestinoAmbulancia destino) {
        this.destino = destino;
    }

    public Lugar getDestinoLugar() {
        return destinoLugar;
    }

    public void setDestinoLugar(Lugar destinoLugar) {
        this.destinoLugar = destinoLugar;
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

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(String enfermero) {
        this.enfermero = enfermero;
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

    public String getMatriculaProf() {
        return matriculaProf;
    }

    public void setMatriculaProf(String matriculaProf) {
        this.matriculaProf = matriculaProf;
    }

    public String getDestinoSalaCama() {
        return destinoSalaCama;
    }

    public void setDestinoSalaCama(String destinoSalaCama) {
        this.destinoSalaCama = destinoSalaCama;
    }

    public String getDestinoDomicilio() {
        return destinoDomicilio;
    }

    public void setDestinoDomicilio(String destinoDomicilio) {
        this.destinoDomicilio = destinoDomicilio;
    }

    public String getPractica() {
        return practica;
    }

    public void setPractica(String practica) {
        this.practica = practica;
    }

    public String getTipoAmb() {
        return tipoAmb;
    }

    public void setTipoAmb(String tipoAmb) {
        this.tipoAmb = tipoAmb;
    }
}
