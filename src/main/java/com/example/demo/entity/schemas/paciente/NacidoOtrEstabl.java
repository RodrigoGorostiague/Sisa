package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.*;

@Entity
@Table(name = "nacidootrestabl", schema = "paciente")
public class NacidoOtrEstabl {
    @Id
    @OneToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    private Integer peso;
    @Column(name = "apgardesde")
    private String apgarDesde;
    @Column(name = "apgarhasta")
    private String apgarHasta;
    @Column(name = "semgestacion")
    private Integer semGestacion;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getApgarDesde() {
        return apgarDesde;
    }

    public void setApgarDesde(String apgarDesde) {
        this.apgarDesde = apgarDesde;
    }

    public String getApgarHasta() {
        return apgarHasta;
    }

    public void setApgarHasta(String apgarHasta) {
        this.apgarHasta = apgarHasta;
    }

    public Integer getSemGestacion() {
        return semGestacion;
    }

    public void setSemGestacion(Integer semGestacion) {
        this.semGestacion = semGestacion;
    }
}
