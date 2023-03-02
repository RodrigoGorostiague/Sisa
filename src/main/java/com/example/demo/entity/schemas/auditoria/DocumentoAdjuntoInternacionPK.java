package com.example.demo.entity.schemas.auditoria;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class DocumentoAdjuntoInternacionPK implements Serializable {
    @Column(name = "nrointernacion")
    private Integer nroInternacion;
    private String usuario;
    private String operacion;
    @Column(name = "fechahora")
    private LocalDateTime fehcaHora;

    public Integer getNroInternacion() {
        return nroInternacion;
    }

    public void setNroInternacion(Integer nroInternacion) {
        this.nroInternacion = nroInternacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public LocalDateTime getFehcaHora() {
        return fehcaHora;
    }

    public void setFehcaHora(LocalDateTime fehcaHora) {
        this.fehcaHora = fehcaHora;
    }
}
