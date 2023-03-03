package com.example.demo.entity.schemas.pami;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "practicas_ambulatorio_como_internados", schema = "pami_nuevo")
public class PracticasAmbulatorioComoInternados {
    @Id
    @Column(name = "id_practica_sisa")
    private String idPracticaSisa;

    public String getIdPracticaSisa() {
        return idPracticaSisa;
    }

    public void setIdPracticaSisa(String idPracticaSisa) {
        this.idPracticaSisa = idPracticaSisa;
    }
}
