package com.example.demo.entity.schemas.libretasSanitarias;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
public class EncargadoPagoPK implements Serializable {
    @Column(name = "fechaalta")
    private LocalDateTime fechaAlta;
    @Column(name = "codigoempresa")
    private String codigoEmpresa;

    public LocalDateTime getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDateTime fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
}
