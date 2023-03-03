package com.example.demo.entity.schemas.quirofano;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "intervencion", schema = "quirofano")
public class Intervencion {
    @EmbeddedId
    private IntervencionPK id;
    @Column(name = "codigouniat")
    private String codigoUniat;
    @Column(name = "codigoprocedencia")
    private Integer codigoProcedencia;
    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;
    @Column(name = "tipointervencion")
    private String tipoIntervencion;
    @Column(name = "nroquirofano")
    private Integer nroQuirofano;
    private LocalDateTime duracion;
    private String sangre;
    private String rayos;
    private String yeso;
    private String diagnostico;
    private String observaciones;
    private String programada;
    private String patologia;
    private String obspracticas;
    private Integer especialidad;
    private String transfusion;
    @Column(name = "eco_intraoperatoria")
    private String ecoIntraoperatoria;
    private String operacion;
    @Column(name = "codigomonitor")
    private String codigoMonitor;
    @Column(name = "codigoradiologo")
    private String codigoRadiologo;
    @Column(name = "codprotesis1")
    private String codProtesis1;
    @Column(name = "codprotesis2")
    private String codProtesis2;
    @Column(name = "codprotesis3")
    private String codProtesis3;
    @Column(name = "codprotesis4")
    private String codProtesis4;
    @Column(name = "codprotesis5")
    private String codProtesis5;
    @Column(name = "codprotesis6")
    private String codProtesis6;
    @Column(name = "horafin")
    private LocalDateTime horaFin;
    @Column(name = "diagnostico_post")
    private String diagnosticoPost;

    public IntervencionPK getId() {
        return id;
    }

    public void setId(IntervencionPK id) {
        this.id = id;
    }

    public String getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(String codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Integer getCodigoProcedencia() {
        return codigoProcedencia;
    }

    public void setCodigoProcedencia(Integer codigoProcedencia) {
        this.codigoProcedencia = codigoProcedencia;
    }

    public String getTipoProcedencia() {
        return tipoProcedencia;
    }

    public void setTipoProcedencia(String tipoProcedencia) {
        this.tipoProcedencia = tipoProcedencia;
    }

    public String getTipoIntervencion() {
        return tipoIntervencion;
    }

    public void setTipoIntervencion(String tipoIntervencion) {
        this.tipoIntervencion = tipoIntervencion;
    }

    public Integer getNroQuirofano() {
        return nroQuirofano;
    }

    public void setNroQuirofano(Integer nroQuirofano) {
        this.nroQuirofano = nroQuirofano;
    }

    public LocalDateTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalDateTime duracion) {
        this.duracion = duracion;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getRayos() {
        return rayos;
    }

    public void setRayos(String rayos) {
        this.rayos = rayos;
    }

    public String getYeso() {
        return yeso;
    }

    public void setYeso(String yeso) {
        this.yeso = yeso;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getProgramada() {
        return programada;
    }

    public void setProgramada(String programada) {
        this.programada = programada;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getObspracticas() {
        return obspracticas;
    }

    public void setObspracticas(String obspracticas) {
        this.obspracticas = obspracticas;
    }

    public Integer getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Integer especialidad) {
        this.especialidad = especialidad;
    }

    public String getTransfusion() {
        return transfusion;
    }

    public void setTransfusion(String transfusion) {
        this.transfusion = transfusion;
    }

    public String getEcoIntraoperatoria() {
        return ecoIntraoperatoria;
    }

    public void setEcoIntraoperatoria(String ecoIntraoperatoria) {
        this.ecoIntraoperatoria = ecoIntraoperatoria;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getCodigoMonitor() {
        return codigoMonitor;
    }

    public void setCodigoMonitor(String codigoMonitor) {
        this.codigoMonitor = codigoMonitor;
    }

    public String getCodigoRadiologo() {
        return codigoRadiologo;
    }

    public void setCodigoRadiologo(String codigoRadiologo) {
        this.codigoRadiologo = codigoRadiologo;
    }

    public String getCodProtesis1() {
        return codProtesis1;
    }

    public void setCodProtesis1(String codProtesis1) {
        this.codProtesis1 = codProtesis1;
    }

    public String getCodProtesis2() {
        return codProtesis2;
    }

    public void setCodProtesis2(String codProtesis2) {
        this.codProtesis2 = codProtesis2;
    }

    public String getCodProtesis3() {
        return codProtesis3;
    }

    public void setCodProtesis3(String codProtesis3) {
        this.codProtesis3 = codProtesis3;
    }

    public String getCodProtesis4() {
        return codProtesis4;
    }

    public void setCodProtesis4(String codProtesis4) {
        this.codProtesis4 = codProtesis4;
    }

    public String getCodProtesis5() {
        return codProtesis5;
    }

    public void setCodProtesis5(String codProtesis5) {
        this.codProtesis5 = codProtesis5;
    }

    public String getCodProtesis6() {
        return codProtesis6;
    }

    public void setCodProtesis6(String codProtesis6) {
        this.codProtesis6 = codProtesis6;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getDiagnosticoPost() {
        return diagnosticoPost;
    }

    public void setDiagnosticoPost(String diagnosticoPost) {
        this.diagnosticoPost = diagnosticoPost;
    }
}
