package com.example.demo.entity.schemas.historialAmbulatorio;

import com.example.demo.entity.schemas.personal.Personal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(schema = "historialambulatorio", name = "antecedentes")
public class Antecedentes {
    @EmbeddedId
    private AntecedentesPK id;
    @Column(name = "fechaalta")
    private Date fechaAlta;
    @Column(name = "horaalta")
    private LocalDateTime horaAlta;
    private String vinculo1;
    private String vinculo2;
    private String vinculo3;
    private String edadant1;
    private String edadant2;
    private String edadant3;
    @ManyToOne
    @JoinColumn(name = "profesional", referencedColumnName = "codigopersonal")
    private Personal profesional;

    public AntecedentesPK getId() {
        return id;
    }

    public void setId(AntecedentesPK id) {
        this.id = id;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDateTime getHoraAlta() {
        return horaAlta;
    }

    public void setHoraAlta(LocalDateTime horaAlta) {
        this.horaAlta = horaAlta;
    }

    public String getVinculo1() {
        return vinculo1;
    }

    public void setVinculo1(String vinculo1) {
        this.vinculo1 = vinculo1;
    }

    public String getVinculo2() {
        return vinculo2;
    }

    public void setVinculo2(String vinculo2) {
        this.vinculo2 = vinculo2;
    }

    public String getVinculo3() {
        return vinculo3;
    }

    public void setVinculo3(String vinculo3) {
        this.vinculo3 = vinculo3;
    }

    public String getEdadant1() {
        return edadant1;
    }

    public void setEdadant1(String edadant1) {
        this.edadant1 = edadant1;
    }

    public String getEdadant2() {
        return edadant2;
    }

    public void setEdadant2(String edadant2) {
        this.edadant2 = edadant2;
    }

    public String getEdadant3() {
        return edadant3;
    }

    public void setEdadant3(String edadant3) {
        this.edadant3 = edadant3;
    }
}
