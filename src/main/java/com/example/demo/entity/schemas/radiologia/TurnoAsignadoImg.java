package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "turnoasignadoimg", schema = "radiologia")
public class TurnoAsignadoImg {
    @EmbeddedId
    private TurnoAsignadoImgPK id;
    @Column(name = "horaturno")
    private LocalDateTime horaTurno;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Integer peso;
    @Column(name = "turnoprincipal")
    private String turnoPrincipal;
    @Column(name = "tipoturno")
    private String tipoTurno;
    @Column(name = "tipopractica")
    private String tipoPractica;
    private String diagnostico;
    @Column(name = "fechaorden")
    private Date fechaOrden;
    @Column(name = "profesionalsolicitante")
    private String profesionalSolicitante;
    @Column(name = "uniatproc")
    private String uniatProc;
    @Column(name = "tipoprocedencia")
    private String tipoProcedencia;
    @Column(name = "codigoprocedencia")
    private String codigoProcedencia;
    private String confirmado;
    @Column(name = "celularcontacto")
    private String celularContacto;
    @Column(name = "transfwl")
    private String transfWl;

    public TurnoAsignadoImgPK getId() {
        return id;
    }

    public void setId(TurnoAsignadoImgPK id) {
        this.id = id;
    }

    public LocalDateTime getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(LocalDateTime horaTurno) {
        this.horaTurno = horaTurno;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getTurnoPrincipal() {
        return turnoPrincipal;
    }

    public void setTurnoPrincipal(String turnoPrincipal) {
        this.turnoPrincipal = turnoPrincipal;
    }

    public String getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(String tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public String getTipoPractica() {
        return tipoPractica;
    }

    public void setTipoPractica(String tipoPractica) {
        this.tipoPractica = tipoPractica;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public String getProfesionalSolicitante() {
        return profesionalSolicitante;
    }

    public void setProfesionalSolicitante(String profesionalSolicitante) {
        this.profesionalSolicitante = profesionalSolicitante;
    }

    public String getUniatProc() {
        return uniatProc;
    }

    public void setUniatProc(String uniatProc) {
        this.uniatProc = uniatProc;
    }

    public String getTipoProcedencia() {
        return tipoProcedencia;
    }

    public void setTipoProcedencia(String tipoProcedencia) {
        this.tipoProcedencia = tipoProcedencia;
    }

    public String getCodigoProcedencia() {
        return codigoProcedencia;
    }

    public void setCodigoProcedencia(String codigoProcedencia) {
        this.codigoProcedencia = codigoProcedencia;
    }

    public String getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(String confirmado) {
        this.confirmado = confirmado;
    }

    public String getCelularContacto() {
        return celularContacto;
    }

    public void setCelularContacto(String celularContacto) {
        this.celularContacto = celularContacto;
    }

    public String getTransfWl() {
        return transfWl;
    }

    public void setTransfWl(String transfWl) {
        this.transfWl = transfWl;
    }
}
