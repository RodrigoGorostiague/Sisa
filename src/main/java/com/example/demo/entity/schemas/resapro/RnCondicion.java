package com.example.demo.entity.schemas.resapro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rn_condicion", schema = "resapro")
public class RnCondicion {
    @Id
    private Integer id;
    private String deascripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeascripcion() {
        return deascripcion;
    }

    public void setDeascripcion(String deascripcion) {
        this.deascripcion = deascripcion;
    }
}
