package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "padronotrosestudios", schema = "nomencladores")
public class PadronOtrosEstudios {
    @Id
    @Column(name = "codigopractica")
    private String codigoPractica;
    private String descripcion;
    private String nomenclador;

    public String getCodigoPractica() {
        return codigoPractica;
    }

    public void setCodigoPractica(String codigoPractica) {
        this.codigoPractica = codigoPractica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNomenclador() {
        return nomenclador;
    }

    public void setNomenclador(String nomenclador) {
        this.nomenclador = nomenclador;
    }
}
