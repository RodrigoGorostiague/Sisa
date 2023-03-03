package com.example.demo.entity.schemas.historialInternacion;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "histoyialinternacion", name = "examenfisicoobstetrico")
public class ExamenFisicoObstetrico {
    @EmbeddedId
    private ExamenFisicoObstetricoPK id;
    @Column(name = "altura_uterina")
    private Integer alturaUterina;
    private String dinamica;
    @Column(name = "latidos_fetales")
    private Integer latidosFetales;
    @Column(name = "movimientos_fetales")
    private String movimientosFetales;
    private String tacto;
    private String bolsa;

    public ExamenFisicoObstetricoPK getId() {
        return id;
    }

    public void setId(ExamenFisicoObstetricoPK id) {
        this.id = id;
    }

    public Integer getAlturaUterina() {
        return alturaUterina;
    }

    public void setAlturaUterina(Integer alturaUterina) {
        this.alturaUterina = alturaUterina;
    }

    public String getDinamica() {
        return dinamica;
    }

    public void setDinamica(String dinamica) {
        this.dinamica = dinamica;
    }

    public Integer getLatidosFetales() {
        return latidosFetales;
    }

    public void setLatidosFetales(Integer latidosFetales) {
        this.latidosFetales = latidosFetales;
    }

    public String getMovimientosFetales() {
        return movimientosFetales;
    }

    public void setMovimientosFetales(String movimientosFetales) {
        this.movimientosFetales = movimientosFetales;
    }

    public String getTacto() {
        return tacto;
    }

    public void setTacto(String tacto) {
        this.tacto = tacto;
    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }
}
