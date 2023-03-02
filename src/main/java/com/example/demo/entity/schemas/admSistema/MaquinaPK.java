package com.example.demo.entity.schemas.admSistema;

import com.example.demo.entity.schemas.organizacion.UnidadAtencion;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Embeddable
public class MaquinaPK implements Serializable {
    @Column(name = "ipmaquina")
    private String ipMaquina;
    @ManyToOne
    @JoinColumn(name = "codigouniat", referencedColumnName = "codigouniat")
    private UnidadAtencion codigoUniat;

    public String getIpMaquina() {
        return ipMaquina;
    }

    public void setIpMaquina(String ipMaquina) {
        this.ipMaquina = ipMaquina;
    }

    public UnidadAtencion getCodigoUniat() {
        return codigoUniat;
    }

    public void setCodigoUniat(UnidadAtencion codigoUniat) {
        this.codigoUniat = codigoUniat;
    }
}
