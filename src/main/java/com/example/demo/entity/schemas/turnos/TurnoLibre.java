package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "turnolibre")
public class TurnoLibre {
    @EmbeddedId
    private TurnoLibrePK id;
    @Column(name = "codigocupo")
    private String codigoCupo;
    @Column(name = "codigotipoturno")
    private String codigoTipoTurno;
    @Column(name = "tipobloqueo")
    private String tipoBloqueo;
    private Integer consultorio;
    @Column(name = "codigotipoatencion")
    private String codigoTipoAtencion;
    @Column(name = "usuariobloqueo")
    private String usuarioBloqueo;
    @Column(name = "fechabloqueo")
    private Date fechaBloqueo;
    @Column(name = "horabloqueo")
    private LocalDateTime horaBloqueo;
    @Column(name = "consultoriogenera")
    private String consultorioGenera;
    @Column(name = "horaturno")
    private LocalDateTime horaTurno;

    public TurnoLibrePK getId() {
        return id;
    }

    public void setId(TurnoLibrePK id) {
        this.id = id;
    }

    public String getCodigoCupo() {
        return codigoCupo;
    }

    public void setCodigoCupo(String codigoCupo) {
        this.codigoCupo = codigoCupo;
    }

    public String getCodigoTipoTurno() {
        return codigoTipoTurno;
    }

    public void setCodigoTipoTurno(String codigoTipoTurno) {
        this.codigoTipoTurno = codigoTipoTurno;
    }

    public String getTipoBloqueo() {
        return tipoBloqueo;
    }

    public void setTipoBloqueo(String tipoBloqueo) {
        this.tipoBloqueo = tipoBloqueo;
    }

    public Integer getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Integer consultorio) {
        this.consultorio = consultorio;
    }

    public String getCodigoTipoAtencion() {
        return codigoTipoAtencion;
    }

    public void setCodigoTipoAtencion(String codigoTipoAtencion) {
        this.codigoTipoAtencion = codigoTipoAtencion;
    }

    public String getUsuarioBloqueo() {
        return usuarioBloqueo;
    }

    public void setUsuarioBloqueo(String usuarioBloqueo) {
        this.usuarioBloqueo = usuarioBloqueo;
    }

    public Date getFechaBloqueo() {
        return fechaBloqueo;
    }

    public void setFechaBloqueo(Date fechaBloqueo) {
        this.fechaBloqueo = fechaBloqueo;
    }

    public LocalDateTime getHoraBloqueo() {
        return horaBloqueo;
    }

    public void setHoraBloqueo(LocalDateTime horaBloqueo) {
        this.horaBloqueo = horaBloqueo;
    }

    public String getConsultorioGenera() {
        return consultorioGenera;
    }

    public void setConsultorioGenera(String consultorioGenera) {
        this.consultorioGenera = consultorioGenera;
    }

    public LocalDateTime getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(LocalDateTime horaTurno) {
        this.horaTurno = horaTurno;
    }
}
