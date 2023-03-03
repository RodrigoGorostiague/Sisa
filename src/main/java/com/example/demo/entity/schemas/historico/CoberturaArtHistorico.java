package com.example.demo.entity.schemas.historico;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "coberturaart", schema = "historico")
public class CoberturaArtHistorico {
    @EmbeddedId
    private CoberturaArtHistoricoPK id;
    @Column(name = "numeroasegurado")
    private String numeroAsegurado;
    @Column(name = "cuitempleador")
    private String cuitEmpleador;
    @Column(name = "razonsocialempleador")
    private String razonSocialEmpleador;

    public CoberturaArtHistoricoPK getId() {
        return id;
    }

    public void setId(CoberturaArtHistoricoPK id) {
        this.id = id;
    }

    public String getNumeroAsegurado() {
        return numeroAsegurado;
    }

    public void setNumeroAsegurado(String numeroAsegurado) {
        this.numeroAsegurado = numeroAsegurado;
    }

    public String getCuitEmpleador() {
        return cuitEmpleador;
    }

    public void setCuitEmpleador(String cuitEmpleador) {
        this.cuitEmpleador = cuitEmpleador;
    }

    public String getRazonSocialEmpleador() {
        return razonSocialEmpleador;
    }

    public void setRazonSocialEmpleador(String razonSocialEmpleador) {
        this.razonSocialEmpleador = razonSocialEmpleador;
    }
}
