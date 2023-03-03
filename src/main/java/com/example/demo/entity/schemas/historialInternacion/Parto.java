package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.internacion.Internacion;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "parto", schema = "historialinternacion")
public class Parto {
    @Id
    @OneToOne
    @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion")
    private Internacion internacion;
    @Column(name = "fechaingresoplanillasipa")
    private Date fechaIngresoPlanillasIpa;
    @Column(name = "horaingreso")
    private LocalDateTime horaIngreso;
    @Column(name = "motivo_inicioespecial")
    private String motivoInicioEspecial;
    @Column(name = "tipo_liquidoamniotico")
    private String tipoLiquidoAmniotico;
    @Column(name = "episiotomiadetalle")
    private String episiotomiaDetalle;
    @Column(name = "desgarrosdetalle")
    private String desgarrosDetalle;
    @Column(name = "tipo_parto")
    private String tipoParto;
    @Column(name = "posicion_parto")
    private String posicionParto;
    @Column(name = "duracion_periododilatacion")
    private Integer duracionPeriodoDilatacion;
    @Column(name = "duracion_periodoexpulsion")
    private Integer duracionPeriodoExpulsion;
    @Column(name = "duracion_periodoalumbramiento")
    private Integer duracionPeriodoAlumbramiento;
    @Column(name = "cordon_circulares")
    private String cordonCirculares;
    @Column(name = "cordon_nudos")
    private String cordonNudos;
    @Column(name = "multiplicidad_parto")
    private Integer multiplicidadParto;
    @Column(name = "eg_rn_examenfisicosemanas")
    private Integer egRnExamenFisicosEmanas;
    @Column(name = "eg_rn_examenfisicodias")
    private Integer egRnExamenFisicoDias;
    @Column(name = "hora_despplacenta")
    private LocalDateTime horaDespPlacenta;
    @Column(name = "presentacionplacenta")
    private String presentacionPlacenta;
    @Column(name = "tipoalumbramiento")
    private String tipoAlumbramiento;
    @Column(name = "detalle_tipoalumbramiento")
    private String detalleTipoAlumbramiento;
    @Column(name = "minutos_alumbramiento")
    private Integer minutosAlumbramiento;
    @Column(name = "sangreperdida_alumbramiento")
    private String sangrePerdidaAlumbramiento;
    @Column(name = "uterosangre_postalumb")
    private String uteroSangrePostAlumb;
    @Column(name = "medicacion_postalumb")
    private String medicacionPostAlumb;
    @Column(name = "observaciones_alumbramiento")
    private String observacionesAlumbramiento;
    @Column(name = "examino_paciente")
    private String examinoPaciente;
    @ManyToOne
    @JoinColumn(name = "obstetricia", referencedColumnName = "codigopersonal")
    private Personal obstetricia;
    @ManyToOne
    @JoinColumn(name = "anestesista", referencedColumnName = "codigopersonal")
    private Personal anestesista;
    @ManyToOne
    @JoinColumn(name = "instrumentista", referencedColumnName = "codigopersonal")
    private Personal instrumentista;
    private String observaciones;
    @Column(name = "intervencionesobstetricas")
    private String intervencionesObstetricas;
    @ManyToOne
    @JoinColumn(name = "asistioparto", referencedColumnName = "codigopersonal")
    private Personal asistioParto;
    private String pediatra;
    @Column(name = "nro_pulsera")
    private Integer nroPulsera;

    public Internacion getInternacion() {
        return internacion;
    }

    public void setInternacion(Internacion internacion) {
        this.internacion = internacion;
    }

    public Date getFechaIngresoPlanillasIpa() {
        return fechaIngresoPlanillasIpa;
    }

    public void setFechaIngresoPlanillasIpa(Date fechaIngresoPlanillasIpa) {
        this.fechaIngresoPlanillasIpa = fechaIngresoPlanillasIpa;
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalDateTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getMotivoInicioEspecial() {
        return motivoInicioEspecial;
    }

    public void setMotivoInicioEspecial(String motivoInicioEspecial) {
        this.motivoInicioEspecial = motivoInicioEspecial;
    }

    public String getTipoLiquidoAmniotico() {
        return tipoLiquidoAmniotico;
    }

    public void setTipoLiquidoAmniotico(String tipoLiquidoAmniotico) {
        this.tipoLiquidoAmniotico = tipoLiquidoAmniotico;
    }

    public String getEpisiotomiaDetalle() {
        return episiotomiaDetalle;
    }

    public void setEpisiotomiaDetalle(String episiotomiaDetalle) {
        this.episiotomiaDetalle = episiotomiaDetalle;
    }

    public String getDesgarrosDetalle() {
        return desgarrosDetalle;
    }

    public void setDesgarrosDetalle(String desgarrosDetalle) {
        this.desgarrosDetalle = desgarrosDetalle;
    }

    public String getTipoParto() {
        return tipoParto;
    }

    public void setTipoParto(String tipoParto) {
        this.tipoParto = tipoParto;
    }

    public String getPosicionParto() {
        return posicionParto;
    }

    public void setPosicionParto(String posicionParto) {
        this.posicionParto = posicionParto;
    }

    public Integer getDuracionPeriodoDilatacion() {
        return duracionPeriodoDilatacion;
    }

    public void setDuracionPeriodoDilatacion(Integer duracionPeriodoDilatacion) {
        this.duracionPeriodoDilatacion = duracionPeriodoDilatacion;
    }

    public Integer getDuracionPeriodoExpulsion() {
        return duracionPeriodoExpulsion;
    }

    public void setDuracionPeriodoExpulsion(Integer duracionPeriodoExpulsion) {
        this.duracionPeriodoExpulsion = duracionPeriodoExpulsion;
    }

    public Integer getDuracionPeriodoAlumbramiento() {
        return duracionPeriodoAlumbramiento;
    }

    public void setDuracionPeriodoAlumbramiento(Integer duracionPeriodoAlumbramiento) {
        this.duracionPeriodoAlumbramiento = duracionPeriodoAlumbramiento;
    }

    public String getCordonCirculares() {
        return cordonCirculares;
    }

    public void setCordonCirculares(String cordonCirculares) {
        this.cordonCirculares = cordonCirculares;
    }

    public String getCordonNudos() {
        return cordonNudos;
    }

    public void setCordonNudos(String cordonNudos) {
        this.cordonNudos = cordonNudos;
    }

    public Integer getMultiplicidadParto() {
        return multiplicidadParto;
    }

    public void setMultiplicidadParto(Integer multiplicidadParto) {
        this.multiplicidadParto = multiplicidadParto;
    }

    public Integer getEgRnExamenFisicosEmanas() {
        return egRnExamenFisicosEmanas;
    }

    public void setEgRnExamenFisicosEmanas(Integer egRnExamenFisicosEmanas) {
        this.egRnExamenFisicosEmanas = egRnExamenFisicosEmanas;
    }

    public Integer getEgRnExamenFisicoDias() {
        return egRnExamenFisicoDias;
    }

    public void setEgRnExamenFisicoDias(Integer egRnExamenFisicoDias) {
        this.egRnExamenFisicoDias = egRnExamenFisicoDias;
    }

    public LocalDateTime getHoraDespPlacenta() {
        return horaDespPlacenta;
    }

    public void setHoraDespPlacenta(LocalDateTime horaDespPlacenta) {
        this.horaDespPlacenta = horaDespPlacenta;
    }

    public String getPresentacionPlacenta() {
        return presentacionPlacenta;
    }

    public void setPresentacionPlacenta(String presentacionPlacenta) {
        this.presentacionPlacenta = presentacionPlacenta;
    }

    public String getTipoAlumbramiento() {
        return tipoAlumbramiento;
    }

    public void setTipoAlumbramiento(String tipoAlumbramiento) {
        this.tipoAlumbramiento = tipoAlumbramiento;
    }

    public String getDetalleTipoAlumbramiento() {
        return detalleTipoAlumbramiento;
    }

    public void setDetalleTipoAlumbramiento(String detalleTipoAlumbramiento) {
        this.detalleTipoAlumbramiento = detalleTipoAlumbramiento;
    }

    public Integer getMinutosAlumbramiento() {
        return minutosAlumbramiento;
    }

    public void setMinutosAlumbramiento(Integer minutosAlumbramiento) {
        this.minutosAlumbramiento = minutosAlumbramiento;
    }

    public String getSangrePerdidaAlumbramiento() {
        return sangrePerdidaAlumbramiento;
    }

    public void setSangrePerdidaAlumbramiento(String sangrePerdidaAlumbramiento) {
        this.sangrePerdidaAlumbramiento = sangrePerdidaAlumbramiento;
    }

    public String getUteroSangrePostAlumb() {
        return uteroSangrePostAlumb;
    }

    public void setUteroSangrePostAlumb(String uteroSangrePostAlumb) {
        this.uteroSangrePostAlumb = uteroSangrePostAlumb;
    }

    public String getMedicacionPostAlumb() {
        return medicacionPostAlumb;
    }

    public void setMedicacionPostAlumb(String medicacionPostAlumb) {
        this.medicacionPostAlumb = medicacionPostAlumb;
    }

    public String getObservacionesAlumbramiento() {
        return observacionesAlumbramiento;
    }

    public void setObservacionesAlumbramiento(String observacionesAlumbramiento) {
        this.observacionesAlumbramiento = observacionesAlumbramiento;
    }

    public String getExaminoPaciente() {
        return examinoPaciente;
    }

    public void setExaminoPaciente(String examinoPaciente) {
        this.examinoPaciente = examinoPaciente;
    }

    public Personal getObstetricia() {
        return obstetricia;
    }

    public void setObstetricia(Personal obstetricia) {
        this.obstetricia = obstetricia;
    }

    public Personal getAnestesista() {
        return anestesista;
    }

    public void setAnestesista(Personal anestesista) {
        this.anestesista = anestesista;
    }

    public Personal getInstrumentista() {
        return instrumentista;
    }

    public void setInstrumentista(Personal instrumentista) {
        this.instrumentista = instrumentista;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIntervencionesObstetricas() {
        return intervencionesObstetricas;
    }

    public void setIntervencionesObstetricas(String intervencionesObstetricas) {
        this.intervencionesObstetricas = intervencionesObstetricas;
    }

    public Personal getAsistioParto() {
        return asistioParto;
    }

    public void setAsistioParto(Personal asistioParto) {
        this.asistioParto = asistioParto;
    }

    public String getPediatra() {
        return pediatra;
    }

    public void setPediatra(String pediatra) {
        this.pediatra = pediatra;
    }

    public Integer getNroPulsera() {
        return nroPulsera;
    }

    public void setNroPulsera(Integer nroPulsera) {
        this.nroPulsera = nroPulsera;
    }
}
