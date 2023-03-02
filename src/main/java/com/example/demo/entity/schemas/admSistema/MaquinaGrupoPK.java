package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.io.Serializable;

@Embeddable
public class MaquinaGrupoPK implements Serializable {
    @Column(name = "ipmaquina")
    private String ipMaquina;
    @OneToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "idgrupo")
    private Grupo idGrupo;
    public String getIpMaquina() {
        return ipMaquina;
    }

    public void setIpMaquina(String ipMaquina) {
        this.ipMaquina = ipMaquina;
    }

    public Grupo getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Grupo idGrupo) {
        this.idGrupo = idGrupo;
    }
}
