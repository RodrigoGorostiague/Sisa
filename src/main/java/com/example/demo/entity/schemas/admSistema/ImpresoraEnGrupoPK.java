package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class ImpresoraEnGrupoPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "numeroimpresora", referencedColumnName = "numeroimpresora")
    private Impresora numeroImpresora;
    @OneToOne
    @JoinColumn(name = "numerogrupo", referencedColumnName = "numerogrupo")
    private GrupoImpresora numeroGrupo;

    public Impresora getNumeroImpresora() {
        return numeroImpresora;
    }

    public void setNumeroImpresora(Impresora numeroImpresora) {
        this.numeroImpresora = numeroImpresora;
    }

    public GrupoImpresora getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(GrupoImpresora numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }
}
