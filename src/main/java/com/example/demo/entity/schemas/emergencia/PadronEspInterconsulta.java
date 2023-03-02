package com.example.demo.entity.schemas.emergencia;

import com.example.demo.entity.schemas.asistencia.PadronEspecialidad;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "padronespinterconsulta", schema = "emergencia")
public class PadronEspInterconsulta {
    @Id
    @OneToOne
    @JoinColumn(name = "especialidad", referencedColumnName = "codigoespecialidad")
    private PadronEspecialidad id;

    public PadronEspecialidad getId() {
        return id;
    }

    public void setId(PadronEspecialidad id) {
        this.id = id;
    }
}
