package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "resultado", schema = "laboratorio")
public class Resultado {
    @EmbeddedId
    private ResultadoPK id;
    @Column(name = "valornumero")
    private Integer valorNumero;
    @Column(name = "valortexto")
    private String valorTexto;
    private String observacion;
    @Column(name = "controlnumeroresultado")
    private Integer controlNumeroResultado;

    public ResultadoPK getId() {
        return id;
    }

    public void setId(ResultadoPK id) {
        this.id = id;
    }

    public Integer getValorNumero() {
        return valorNumero;
    }

    public void setValorNumero(Integer valorNumero) {
        this.valorNumero = valorNumero;
    }

    public String getValorTexto() {
        return valorTexto;
    }

    public void setValorTexto(String valorTexto) {
        this.valorTexto = valorTexto;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getControlNumeroResultado() {
        return controlNumeroResultado;
    }

    public void setControlNumeroResultado(Integer controlNumeroResultado) {
        this.controlNumeroResultado = controlNumeroResultado;
    }
}
