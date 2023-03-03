package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "valorreferencia", schema = "laboratorio")
public class ValorReferencia {
    @EmbeddedId
    private ValorReferenciaPK id;
    private Integer valor1;
    private Integer valor2;
    private String unidad;
    @Column(name = "valortexto")
    private String valorTexto;
    private Integer interpretacion;
    private Integer referencia;

    public ValorReferenciaPK getId() {
        return id;
    }

    public void setId(ValorReferenciaPK id) {
        this.id = id;
    }

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getValorTexto() {
        return valorTexto;
    }

    public void setValorTexto(String valorTexto) {
        this.valorTexto = valorTexto;
    }

    public Integer getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(Integer interpretacion) {
        this.interpretacion = interpretacion;
    }

    public Integer getReferencia() {
        return referencia;
    }

    public void setReferencia(Integer referencia) {
        this.referencia = referencia;
    }
}
