package com.example.demo.entity.schemas.admSistema;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Date;

@Embeddable
public class CierraSistemaPK implements Serializable {
    @Column(name = "fechacierre")
    private Date fechaCierre;
    @ManyToOne
    @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    private UnidadAtencion codigoUniat;
    @ManyToOne
    @JoinColumn(name = "idmodulo", referencedColumnName = "idmodulo")
    private Modulo idModulo;

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public UnidadAtencion getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(UnidadAtencion codigoUniat) {
        this.codigoUniat = codigoUniat;
    }

    public Modulo getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Modulo idModulo) {
        this.idModulo = idModulo;
    }
}
