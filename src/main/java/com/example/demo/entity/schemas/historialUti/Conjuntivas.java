package com.example.demo.entity.schemas.historialUti;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conjuntivas", schema = "historialuti")
public class Conjuntivas {
    @Id
    private String codigo;
    private String descriopcion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescriopcion() {
        return descriopcion;
    }

    public void setDescriopcion(String descriopcion) {
        this.descriopcion = descriopcion;
    }
}
