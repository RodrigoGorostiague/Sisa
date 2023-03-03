package com.example.demo.entity.schemas.laboratorio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "padrondeterminacion", schema = "laboratorio")
public class PadronDeterminacion {
    @Id
    private Integer determinacion;
    private String texto;
    @Column(name = "tipovalor")
    private String tipoValor;

    public Integer getDeterminacion() {
        return determinacion;
    }

    public void setDeterminacion(Integer determinacion) {
        this.determinacion = determinacion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(String tipoValor) {
        this.tipoValor = tipoValor;
    }
}
