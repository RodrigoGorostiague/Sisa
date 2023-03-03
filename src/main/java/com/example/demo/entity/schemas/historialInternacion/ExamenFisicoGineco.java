package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialinternacion", name = "examenfisicogineco")
public class ExamenFisicoGineco {
    @EmbeddedId
    private ExamenFisicoGinecoPK id;
    private String  vulva;
    private  String vagina;
    private String cuello;
    private String utero;
    private String anexos;
    private String flujo;
    private String dolor;

    public ExamenFisicoGinecoPK getId() {
        return id;
    }

    public void setId(ExamenFisicoGinecoPK id) {
        this.id = id;
    }

    public String getVulva() {
        return vulva;
    }

    public void setVulva(String vulva) {
        this.vulva = vulva;
    }

    public String getVagina() {
        return vagina;
    }

    public void setVagina(String vagina) {
        this.vagina = vagina;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getUtero() {
        return utero;
    }

    public void setUtero(String utero) {
        this.utero = utero;
    }

    public String getAnexos() {
        return anexos;
    }

    public void setAnexos(String anexos) {
        this.anexos = anexos;
    }

    public String getFlujo() {
        return flujo;
    }

    public void setFlujo(String flujo) {
        this.flujo = flujo;
    }

    public String getDolor() {
        return dolor;
    }

    public void setDolor(String dolor) {
        this.dolor = dolor;
    }
}
