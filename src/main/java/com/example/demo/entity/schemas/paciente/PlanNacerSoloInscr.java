package com.example.demo.entity.schemas.paciente;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "plannacersoloinscr", schema = "paciente")
public class PlanNacerSoloInscr {
    @Id
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @Column(name = "numeroafiliado")
    private String numeroAfiliado;
    @Column(name = "fechaprobableparto")
    private Date fechaProbableParto;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getNumeroAfiliado() {
        return numeroAfiliado;
    }

    public void setNumeroAfiliado(String numeroAfiliado) {
        this.numeroAfiliado = numeroAfiliado;
    }

    public Date getFechaProbableParto() {
        return fechaProbableParto;
    }

    public void setFechaProbableParto(Date fechaProbableParto) {
        this.fechaProbableParto = fechaProbableParto;
    }
}
