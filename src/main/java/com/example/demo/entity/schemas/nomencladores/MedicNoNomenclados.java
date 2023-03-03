package com.example.demo.entity.schemas.nomencladores;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicnonomenclados", schema = "nomencladores")
public class MedicNoNomenclados {
    @Id
    private Integer codigo;
    private String descripciones;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripciones() {
        return descripciones;
    }

    public void setDescripciones(String descripciones) {
        this.descripciones = descripciones;
    }
}
