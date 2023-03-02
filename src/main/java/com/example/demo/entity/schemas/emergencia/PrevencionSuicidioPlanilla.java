package com.example.demo.entity.schemas.emergencia;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(schema = "emergencia", name = "prevencionsuicidio_planilla")
public class PrevencionSuicidioPlanilla {
    @EmbeddedId
    private PrevencionSuicidioPlanillaPK id;
    @ManyToOne
    @JoinColumn(name = "metodo", referencedColumnName = "codigo")
    private PrevencionSuicidioMetodo prevencionSuicidioMetodo;
    @Column(name = "intentos_previos")
    private Boolean intentosPrevios;
    @Column(name = "antecedentes_violencia")
    private Boolean antecedentesViolencia;
    @Column(name = "antecedentes_abuso")
    private Boolean antecedentesAbuso;
    @ManyToOne
    @JoinColumn(name = "empleo", referencedColumnName = "codigo")
    private PrevencionSuicidioEmpleo prevencionSuicidioEmpleo;
    private Boolean parejan;
    @Column(name = "motivo_detalle")
    private String motivoDetalle;
    @ManyToOne
    @JoinColumn(name = "educacion", referencedColumnName = "codigo")
    private PrevencionSuicidioEducacion prevencionSuicidioEducacion;
    @Column(name = "tipo_ingesta")
    private String tipoIngesta;
    private Boolean advirtio;
    private String observaciones;
    @Column(name = "tratamientoantecedentes")
    private Boolean tratamientoAntecedentes;
    @Column(name = "tratamientoactual")
    private String tratamientoActual;
    @Column(name = "metodo_detalle")
    private String metodoDetalle;
    @ManyToMany
    @JoinTable(name = "prevencionsuicidio_planilla_motivo",
            joinColumns = {@JoinColumn(name = "nrocon"), @JoinColumn(name = "uniat")},
            inverseJoinColumns = @JoinColumn(name = "motivo")
    )
    private List<PrevencionSuicidioMotivo> prevencionSuicidioMotivos;

    public List<PrevencionSuicidioMotivo> getPrevencionSuicidioMotivos() {
        return prevencionSuicidioMotivos;
    }

    public void setPrevencionSuicidioMotivos(List<PrevencionSuicidioMotivo> prevencionSuicidioMotivos) {
        this.prevencionSuicidioMotivos = prevencionSuicidioMotivos;
    }

    public PrevencionSuicidioPlanillaPK getId() {
        return id;
    }

    public void setId(PrevencionSuicidioPlanillaPK id) {
        this.id = id;
    }

    public PrevencionSuicidioMetodo getPrevencionSuicidioMetodo() {
        return prevencionSuicidioMetodo;
    }

    public void setPrevencionSuicidioMetodo(PrevencionSuicidioMetodo prevencionSuicidioMetodo) {
        this.prevencionSuicidioMetodo = prevencionSuicidioMetodo;
    }

    public Boolean getIntentosPrevios() {
        return intentosPrevios;
    }

    public void setIntentosPrevios(Boolean intentosPrevios) {
        this.intentosPrevios = intentosPrevios;
    }

    public Boolean getAntecedentesViolencia() {
        return antecedentesViolencia;
    }

    public void setAntecedentesViolencia(Boolean antecedentesViolencia) {
        this.antecedentesViolencia = antecedentesViolencia;
    }

    public Boolean getAntecedentesAbuso() {
        return antecedentesAbuso;
    }

    public void setAntecedentesAbuso(Boolean antecedentesAbuso) {
        this.antecedentesAbuso = antecedentesAbuso;
    }

    public PrevencionSuicidioEmpleo getPrevencionSuicidioEmpleo() {
        return prevencionSuicidioEmpleo;
    }

    public void setPrevencionSuicidioEmpleo(PrevencionSuicidioEmpleo prevencionSuicidioEmpleo) {
        this.prevencionSuicidioEmpleo = prevencionSuicidioEmpleo;
    }

    public Boolean getParejan() {
        return parejan;
    }

    public void setParejan(Boolean parejan) {
        this.parejan = parejan;
    }

    public String getMotivoDetalle() {
        return motivoDetalle;
    }

    public void setMotivoDetalle(String motivoDetalle) {
        this.motivoDetalle = motivoDetalle;
    }

    public PrevencionSuicidioEducacion getPrevencionSuicidioEducacion() {
        return prevencionSuicidioEducacion;
    }

    public void setPrevencionSuicidioEducacion(PrevencionSuicidioEducacion prevencionSuicidioEducacion) {
        this.prevencionSuicidioEducacion = prevencionSuicidioEducacion;
    }

    public String getTipoIngesta() {
        return tipoIngesta;
    }

    public void setTipoIngesta(String tipoIngesta) {
        this.tipoIngesta = tipoIngesta;
    }

    public Boolean getAdvirtio() {
        return advirtio;
    }

    public void setAdvirtio(Boolean advirtio) {
        this.advirtio = advirtio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Boolean getTratamientoAntecedentes() {
        return tratamientoAntecedentes;
    }

    public void setTratamientoAntecedentes(Boolean tratamientoAntecedentes) {
        this.tratamientoAntecedentes = tratamientoAntecedentes;
    }

    public String getTratamientoActual() {
        return tratamientoActual;
    }

    public void setTratamientoActual(String tratamientoActual) {
        this.tratamientoActual = tratamientoActual;
    }

    public String getMetodoDetalle() {
        return metodoDetalle;
    }

    public void setMetodoDetalle(String metodoDetalle) {
        this.metodoDetalle = metodoDetalle;
    }
}
