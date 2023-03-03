package com.example.demo.entity.schemas.sipa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "posnegnocontestasd", schema = "sipa")
public class PosNegNoContestaSd {
    @Id
    private String codigo;
    private String descr;
    @Column(name = "descrcompleta")
    private String descrCompleta;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDescrCompleta() {
        return descrCompleta;
    }

    public void setDescrCompleta(String descrCompleta) {
        this.descrCompleta = descrCompleta;
    }
}
