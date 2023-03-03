package com.example.demo.entity.schemas.turnos;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pesotallaturno", schema = "turnos")
public class PesoTallaTurno {
    @EmbeddedId
    private PesoTallaTurnoPK id;
    @Column(name = "idpaciente")
    private Integer idPaciente;
    private Integer peso;
    private Integer talla;
    private Integer imc;
    @Column(name = "percefalico")
    private Integer perCefalico;

    public PesoTallaTurnoPK getId() {
        return id;
    }

    public void setId(PesoTallaTurnoPK id) {
        this.id = id;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getTalla() {
        return talla;
    }

    public void setTalla(Integer talla) {
        this.talla = talla;
    }

    public Integer getImc() {
        return imc;
    }

    public void setImc(Integer imc) {
        this.imc = imc;
    }

    public Integer getPerCefalico() {
        return perCefalico;
    }

    public void setPerCefalico(Integer perCefalico) {
        this.perCefalico = perCefalico;
    }
}
