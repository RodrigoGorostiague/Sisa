package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "itemstiss28", schema = "historialuti")
public class ItemsTiss28 {
    @Id
    private String codigo;
    private String desfripcion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDesfripcion() {
        return desfripcion;
    }

    public void setDesfripcion(String desfripcion) {
        this.desfripcion = desfripcion;
    }
}
