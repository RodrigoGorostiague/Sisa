package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "practicas_ignoradas", schema = "pami")
public class PracticasIgnoradas {
    @Id
    @Column(name = "id_practica_sisa")
    private String idPracticaSisa;
    private String sector;

    public String getIdPracticaSisa() {
        return idPracticaSisa;
    }

    public void setIdPracticaSisa(String idPracticaSisa) {
        this.idPracticaSisa = idPracticaSisa;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
