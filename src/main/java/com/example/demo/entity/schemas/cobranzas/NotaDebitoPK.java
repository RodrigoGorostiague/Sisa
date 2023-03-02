package com.example.demo.entity.schemas.cobranzas;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class NotaDebitoPK  implements Serializable {
    private String sucursal;
    private Integer numero;

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
