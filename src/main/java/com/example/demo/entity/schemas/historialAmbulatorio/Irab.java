package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.paciente.Paciente;
import jakarta.persistence.*;

@Entity
@Table(schema = "historialambulatorio", name = "irab")
public class Irab {
    @Id
    @OneToOne
    @JoinColumn(name = "nroconsulta", referencedColumnName = "nroconsulta")
    private ConsultaTurno consultaTurno;
    @ManyToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    private String codigo;
    @Column(name = "enfermedaddebase")
    private String enfermedadBase;
    @Column(name = "fumadorenlacasa")
    private String fumadorEnLaCasa;
    @Column(name = "talalingreso")
    private String talalIngreso;
    private String destino;
    @Column(name = "tratsalbutamol")
    private String tratSalbutamol;

    public ConsultaTurno getConsultaTurno() {
        return consultaTurno;
    }

    public void setConsultaTurno(ConsultaTurno consultaTurno) {
        this.consultaTurno = consultaTurno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEnfermedadBase() {
        return enfermedadBase;
    }

    public void setEnfermedadBase(String enfermedadBase) {
        this.enfermedadBase = enfermedadBase;
    }

    public String getFumadorEnLaCasa() {
        return fumadorEnLaCasa;
    }

    public void setFumadorEnLaCasa(String fumadorEnLaCasa) {
        this.fumadorEnLaCasa = fumadorEnLaCasa;
    }

    public String getTalalIngreso() {
        return talalIngreso;
    }

    public void setTalalIngreso(String talalIngreso) {
        this.talalIngreso = talalIngreso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTratSalbutamol() {
        return tratSalbutamol;
    }

    public void setTratSalbutamol(String tratSalbutamol) {
        this.tratSalbutamol = tratSalbutamol;
    }
}
