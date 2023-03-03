package com.example.demo.entity.schemas.historialInternacion;

import com.example.demo.entity.schemas.internacion.Internacion;
import com.example.demo.entity.schemas.paciente.Paciente;
import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "historialinternacion", name = "cabeceraenfermeria")
public class CabeceraEnfermeria {
    @Id
    @OneToOne
    @JoinColumn(name = "nrointernacion", referencedColumnName = "nrointernacion")
    private Internacion internacion;
    @Column(name = "fechaing")
    private Date fechaIng;
    @Column(name = "horaing")
    private LocalDateTime horaing;
    @OneToOne
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    private Paciente paciente;
    @Column(name = "apynofamiliar")
    private String apellidoNombreFamiliar;
    @Column(name = "telfamiliar")
    private String telFamiliar;
    @ManyToOne
    @JoinColumn(name = "codigopersonal", referencedColumnName = "codigopersonal")
    private Personal personal;

    public Internacion getInternacion() {
        return internacion;
    }

    public void setInternacion(Internacion internacion) {
        this.internacion = internacion;
    }

    public Date getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }

    public LocalDateTime getHoraing() {
        return horaing;
    }

    public void setHoraing(LocalDateTime horaing) {
        this.horaing = horaing;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getApellidoNombreFamiliar() {
        return apellidoNombreFamiliar;
    }

    public void setApellidoNombreFamiliar(String apellidoNombreFamiliar) {
        this.apellidoNombreFamiliar = apellidoNombreFamiliar;
    }

    public String getTelFamiliar() {
        return telFamiliar;
    }

    public void setTelFamiliar(String telFamiliar) {
        this.telFamiliar = telFamiliar;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
}
