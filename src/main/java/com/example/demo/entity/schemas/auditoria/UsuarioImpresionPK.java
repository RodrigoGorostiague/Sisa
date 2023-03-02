package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Embeddable
public class UsuarioImpresionPK implements Serializable {
    private Date fecha;
    @Column(name = "usuarioexe")
    private String usuarioExe;
    private LocalDateTime hora;
    private String usuario;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuarioExe() {
        return usuarioExe;
    }

    public void setUsuarioExe(String usuarioExe) {
        this.usuarioExe = usuarioExe;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
