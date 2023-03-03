package com.example.demo.entity.schemas.radiologia;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "turnolibreimg", schema = "radiologia")
public class TurnoLibreImg {
    @EmbeddedId
    private TurnoLibreImgPK id;
    @Column(name = "tipoturno")
    private String tipoTurno;
    @Column(name = "horaturno")
    private LocalDateTime horaTurno;
    @Column(name = "usuariobloqueo")
    private String usuarioBloqueo;
    @Column(name = "fechabloqueo")
    private Date fechaBloqueo;
    @Column(name = "horabloqueo")
    private LocalDateTime horaBloqueo;
    @Column(name = "tipopractica")
    private String tipoPractica;
    @Column(name = "tipobloqueo")
    private String tipoBloqueo;

    public TurnoLibreImgPK getId() {
        return id;
    }

    public void setId(TurnoLibreImgPK id) {
        this.id = id;
    }

    public String getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(String tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public LocalDateTime getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(LocalDateTime horaTurno) {
        this.horaTurno = horaTurno;
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

    public String getTipoPractica() {
        return tipoPractica;
    }

    public void setTipoPractica(String tipoPractica) {
        this.tipoPractica = tipoPractica;
    }

    public String getTipoBloqueo() {
        return tipoBloqueo;
    }

    public void setTipoBloqueo(String tipoBloqueo) {
        this.tipoBloqueo = tipoBloqueo;
    }
}
