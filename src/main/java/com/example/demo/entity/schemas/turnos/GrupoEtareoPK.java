package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class GrupoEtareoPK implements Serializable {
    @Column(name = "numerogrupo")
    private Integer numeroGrupo;
    @Column(name = "edadinicial")
    private Integer edadInicial;
    @Column(name = "edadfinal")
    private Integer edadFinal;

    public Integer getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(Integer numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public Integer getEdadInicial() {
        return edadInicial;
    }

    public void setEdadInicial(Integer edadInicial) {
        this.edadInicial = edadInicial;
    }

    public Integer getEdadFinal() {
        return edadFinal;
    }

    public void setEdadFinal(Integer edadFinal) {
        this.edadFinal = edadFinal;
    }
}
