package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class MapeoProcedenciasPK implements Serializable {
    private String institucion;
    private String dependencia;
    @Column(name = "espserv")
    private String espServ;
    @Column(name = "codigodeorigen")
    private String codigoDeOrigen;

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getEspServ() {
        return espServ;
    }

    public void setEspServ(String espServ) {
        this.espServ = espServ;
    }

    public String getCodigoDeOrigen() {
        return codigoDeOrigen;
    }

    public void setCodigoDeOrigen(String codigoDeOrigen) {
        this.codigoDeOrigen = codigoDeOrigen;
    }
}
