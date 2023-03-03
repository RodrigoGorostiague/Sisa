package com.example.demo.entity.schemas.historialAmbEsp;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "historialambesp", name = "evalpreanes_itemsotr")
public class EvalPreanesItemSotr {
    @EmbeddedId
    private EvalPreanesItemSotrPK id;
    private String valor;

    public EvalPreanesItemSotrPK getId() {
        return id;
    }

    public void setId(EvalPreanesItemSotrPK id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
