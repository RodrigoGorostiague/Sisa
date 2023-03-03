package com.example.demo.entity.schemas.personal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aux_nroidentificatorio", schema = "personal")
public class AuxNroIdentificatorio {
    @Id
    @Column(name = "codigopersonal")
    private String codigoPersonal;
    @Column(name = "numeroidentificatorio")
    private Integer numeroIdentificatorio;

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public Integer getNumeroIdentificatorio() {
        return numeroIdentificatorio;
    }

    public void setNumeroIdentificatorio(Integer numeroIdentificatorio) {
        this.numeroIdentificatorio = numeroIdentificatorio;
    }
}
