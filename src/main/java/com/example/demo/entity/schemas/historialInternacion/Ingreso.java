package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.asistencia.PadronServicio;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "historialinternacion", name = "ingreso")
public class Ingreso {
    @EmbeddedId
    private IngresoPK id;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    @Column(name = "motivointernacion")
    private String motivoInternacion;
    @Column(name = "enfermedadestadoactual")
    private String enfermedadEstadoActual;
    @Column(name = "antecenfermedadactual")
    private String antecEnfermedadActual;
    @Column(name = "antecotraspatologias")
    private String antecoTrasPatologias;
    @Column(name = "antecheredofamiliares")
    private String antecHeredoFamiliares;
    private String habitos;
    private String medicamentos;
    private Integer avd;
    @ManyToOne
    @JoinColumn(name = "tiposaturacion", referencedColumnName = "codigo")
    private Saturacion saturacion;
    @Column(name = "valorsaturacion")
    private Integer valorSaturacion;
    @ManyToOne
    @JoinColumn(name = "codigoservicio", referencedColumnName = "codigoservicio")
    private PadronServicio padronServicio;
    @Column(name = "antecpatologicos")
    private String antecPatologicos;
    @Column(name = "antecalergicos")
    private String antecAlergicos;
    @Column(name = "antecsocioeconomicos")
    private String antecSocioEconomicos;
    @Column(name = "antecvacunacion")
    private String antecVacunacion;
    private Boolean obito;
    @Column(name = "porpa")
    private Boolean porPase;

    public IngresoPK getId() {
        return id;
    }

    public void setId(IngresoPK id) {
        this.id = id;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getMotivoInternacion() {
        return motivoInternacion;
    }

    public void setMotivoInternacion(String motivoInternacion) {
        this.motivoInternacion = motivoInternacion;
    }

    public String getEnfermedadEstadoActual() {
        return enfermedadEstadoActual;
    }

    public void setEnfermedadEstadoActual(String enfermedadEstadoActual) {
        this.enfermedadEstadoActual = enfermedadEstadoActual;
    }

    public String getAntecEnfermedadActual() {
        return antecEnfermedadActual;
    }

    public void setAntecEnfermedadActual(String antecEnfermedadActual) {
        this.antecEnfermedadActual = antecEnfermedadActual;
    }

    public String getAntecoTrasPatologias() {
        return antecoTrasPatologias;
    }

    public void setAntecoTrasPatologias(String antecoTrasPatologias) {
        this.antecoTrasPatologias = antecoTrasPatologias;
    }

    public String getAntecHeredoFamiliares() {
        return antecHeredoFamiliares;
    }

    public void setAntecHeredoFamiliares(String antecHeredoFamiliares) {
        this.antecHeredoFamiliares = antecHeredoFamiliares;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Integer getAvd() {
        return avd;
    }

    public void setAvd(Integer avd) {
        this.avd = avd;
    }

    public Saturacion getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(Saturacion saturacion) {
        this.saturacion = saturacion;
    }

    public Integer getValorSaturacion() {
        return valorSaturacion;
    }

    public void setValorSaturacion(Integer valorSaturacion) {
        this.valorSaturacion = valorSaturacion;
    }

    public PadronServicio getPadronServicio() {
        return padronServicio;
    }

    public void setPadronServicio(PadronServicio padronServicio) {
        this.padronServicio = padronServicio;
    }

    public String getAntecPatologicos() {
        return antecPatologicos;
    }

    public void setAntecPatologicos(String antecPatologicos) {
        this.antecPatologicos = antecPatologicos;
    }

    public String getAntecAlergicos() {
        return antecAlergicos;
    }

    public void setAntecAlergicos(String antecAlergicos) {
        this.antecAlergicos = antecAlergicos;
    }

    public String getAntecSocioEconomicos() {
        return antecSocioEconomicos;
    }

    public void setAntecSocioEconomicos(String antecSocioEconomicos) {
        this.antecSocioEconomicos = antecSocioEconomicos;
    }

    public String getAntecVacunacion() {
        return antecVacunacion;
    }

    public void setAntecVacunacion(String antecVacunacion) {
        this.antecVacunacion = antecVacunacion;
    }

    public Boolean getObito() {
        return obito;
    }

    public void setObito(Boolean obito) {
        this.obito = obito;
    }

    public Boolean getPorPase() {
        return porPase;
    }

    public void setPorPase(Boolean porPase) {
        this.porPase = porPase;
    }
}
