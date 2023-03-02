package com.example.demo.entity.schemas.admSistema;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admsistema", name = "usrexcepcionescambioclave")
public class UsrExcepcionesCambioClave {
    @Id
    @Column(name = "codigopersonal")
    private String codigoPersonal;

    public String getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(String codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }
}
