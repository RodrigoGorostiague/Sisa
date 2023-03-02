package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class ConexionaGrupoPK implements Serializable {
    @Column(name = "ipmaquina")
    private String ipMaquina;
    @OneToOne
    @JoinColumn(name = "numerogrupo", referencedColumnName = "numerogrupo")
    private GrupoImpresora numeroGrupo;


    public String getIpMaquina() {
        return ipMaquina;
    }

    public void setIpMaquina(String ipMaquina) {
        this.ipMaquina = ipMaquina;
    }

    public GrupoImpresora getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(GrupoImpresora numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }
}
