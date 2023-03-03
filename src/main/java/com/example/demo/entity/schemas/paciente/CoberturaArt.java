package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "coberturaart", schema = "paciente")
public class CoberturaArt {
    @EmbeddedId
    private CoberturaArtPK id;
    @Column(name = "numeroasegurado")
    private String numeroAsegurado;
    @Column(name = "cuitempleador")
    private String cuitEmpleador;
    @Column(name = "razonsocialempleador")
    private String razonSocialEmpleador;

    public CoberturaArtPK getId() {
        return id;
    }

    public void setId(CoberturaArtPK id) {
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
